package core4;


	import java.util.ArrayList;
	import java.util.List;

	public class NumberFinder {
	    public static void main(String[] args) {
	        List<String> inputList = new ArrayList<>();
	        inputList.add("7777770777");
	        inputList.add("123321");
	        inputList.add("555");
	        inputList.add("99999999");
	       

	        String mostCatchy = findCatchyNumber(inputList);
	        System.out.println("The most easily remembere number is: " + mostCatchy);
	    }

	    public static String findCatchyNumber(List<String> inputList) {
	        String mostCatchy = "";
	        int maxScore = 0;

	        for (String number : inputList) {
	            int score = 0;

	            // Calculate the score based on the criteria you mentioned
	            int len = number.length();
	            for (int i = 0; i < len; i++) {
	                if (i < len - 1 && number.charAt(i) == number.charAt(i + 1)) {
	                    score += 1;  // Repetitive numbers
	                }

	                if (i < len / 2 && number.charAt(i) == number.charAt(len - i - 1)) {
	                    score += 2;  // First half and second half equal
	                }
	                
	                // Add more criteria as needed

	                // Update the most catchy if a higher score is found
	                if (score > maxScore) {
	                    maxScore = score;
	                    mostCatchy = number;
	                }
	            }
	        }

	        return mostCatchy;
	    }
	}
