package core3;

import java.util.Arrays;
import java.util.Comparator;

public class CheckVowels {
	 public static void main(String[] args) {
	        String[] words = "Hello how are you".split(" ");

	        Arrays.sort(words, new VowelCountComparator());

	        System.out.println(Arrays.toString(words));
	    }

	    private static class VowelCountComparator implements Comparator<String> {

	        @Override
	        public int compare(String a, String b) {
	            int vowelCountA = countVowels(a);
	            int vowelCountB = countVowels(b);

	            if (vowelCountA != vowelCountB) {
	                return vowelCountB - vowelCountA;
	            } else {
	                return a.compareTo(b);
	            }
	        }
	    }

	    private static int countVowels(String word) {
	        int vowelCount = 0;
	        for (char ch : word.toLowerCase().toCharArray()) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowelCount++;
	            }
	        }
	        return vowelCount;
	    }
	}