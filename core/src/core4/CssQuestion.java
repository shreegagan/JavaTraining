package core4;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CssQuestion {
    public static void main(String[] args) {
        try {
            // Provide the path to your CSS file
            String cssFilePath = "styles.css";

            // Read the CSS file
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Beluvigi.Shreegagana\\eclipse-workspace\\EmployeeJspProject\\src\\main\\webapp\\style.css"));
            String line;
            StringBuilder cssContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                cssContent.append(line).append("\n");
            }
            reader.close();

            // Define regular expressions for class selectors, integer attributes, and hex color codes
            Pattern classPattern = Pattern.compile("\\.([a-zA-Z\\-\\_0-9]+)\\s*\\{");
            Pattern intAttributePattern = Pattern.compile("([a-zA-Z\\-\\_0-9]+)\\s*:\\s*([0-9]+)\\s*;");
            Pattern hexColorPattern = Pattern.compile("([a-zA-Z\\-\\_0-9]+)\\s*:\\s*#([0-9a-fA-F]+)\\s*;");

            // Create maps to store class names, integer attributes, and color attributes
            Map<String, String> classes = new HashMap<>();
            Map<String, Integer> intAttributes = new HashMap<>();
            Map<String, String> colorAttributes = new HashMap<>();

            // Match class selectors and attribute values
            Matcher classMatcher = classPattern.matcher(cssContent);
            while (classMatcher.find()) {
                String className = classMatcher.group(1);
                classes.put(className, "");
            }

            Matcher intAttributeMatcher = intAttributePattern.matcher(cssContent);
            while (intAttributeMatcher.find()) {
                String attributeName = intAttributeMatcher.group(1);
                int attributeValue = Integer.parseInt(intAttributeMatcher.group(2));
                intAttributes.put(attributeName, attributeValue);
            }

            Matcher hexColorMatcher = hexColorPattern.matcher(cssContent);
            while (hexColorMatcher.find()) {
                String attributeName = hexColorMatcher.group(1);
                String hexColor = hexColorMatcher.group(2);
                String rgbColor = convertHexToRGB(hexColor);
                colorAttributes.put(attributeName, rgbColor);
            }

            // Print the results
            System.out.println("Class Selectors:");
            classes.keySet().forEach(System.out::println);
            System.out.println("\nInteger Attributes:");
            intAttributes.forEach((attribute, value) -> System.out.println(attribute + ": " + value));
            System.out.println("\nColor Attributes (RGB):");
            colorAttributes.forEach((attribute, rgbColor) -> System.out.println(attribute + ": " + rgbColor));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Function to convert hex color code to RGB format
    private static String convertHexToRGB(String hexColor) {
        int hex = Integer.parseInt(hexColor, 16);
        int r = (hex >> 16) & 0xFF;
        int g = (hex >> 8) & 0xFF;
        int b = hex & 0xFF;
        return "rgb(" + r + "," + g + "," + b + ")";
    }
}
