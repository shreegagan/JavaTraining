package core4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTagCount {
    public static void main(String[] args) {
        try {
            // Provide the path to your HTML file
            String htmlFilePath = "C:\\Users\\Beluvigi.Shreegagana\\eclipse-workspace\\core\\src\\core4\\Sample.html";

            // Read the HTML file
            BufferedReader reader = new BufferedReader(new FileReader(htmlFilePath));
            String line;
            StringBuilder htmlContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                htmlContent.append(line).append("\n");
            }
            reader.close();

            // Define a regular expression to match HTML tags
            Pattern pattern = Pattern.compile("<([a-zA-Z]+)[^>]*>");

            // Create a map to store the counts of opening tags for each type
            Map<String, Integer> tagCounts = new HashMap<>();

            // Create a map to store the start and end line numbers for each tag
            Map<String, String> tagLocations = new HashMap<>();

            // Match and count the opening tags
            Matcher matcher = pattern.matcher(htmlContent);
            int lineCounter = 0;
            while (matcher.find()) {
                lineCounter++;

                String tag = matcher.group(1);

                // Update the count of the tag
                tagCounts.put(tag, tagCounts.getOrDefault(tag, 0) + 1);

                // Store the start and end line numbers for the tag
                String location = tagLocations.getOrDefault(tag, "");
                if (location.isEmpty()) {
                    location = "Starts at line " + lineCounter;
                } else {
                    location += " and ends at line " + (lineCounter - 1);
                }
                tagLocations.put(tag, location);
            }

            // Print the counts of opening tags for each type
            System.out.println("Counts of Opening Tags:");
            for (Map.Entry<String, Integer> entry : tagCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Print the start and end lines for each tag
            System.out.println("\nStart and End Lines for Each Tag:");
            for (Map.Entry<String, String> entry : tagLocations.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

