package core3;

public class NumberGenerator {
	
	public static void main(String[] args) {
        long[] list = {2985341777L, 5626789297L, 2277737468L, 1111111111, 4238516333L, 5535555568L, 5677222856L, 6287890819L, 7894103332L, 4305550139L};

        for (long number : list) {
            if (isEasyToRemember(number)) {
                System.out.println(number + " is easy to remember");
            }
        }
    }

    private static boolean isEasyToRemember(long number) {
        String numberString = String.valueOf(number);
        for (int i = 0; i < numberString.length() - 2; i++) {
            if (numberString.charAt(i) == numberString.charAt(i + 1) && numberString.charAt(i) == numberString.charAt(i + 2)) {
                return true;
            }
        }
        return false;
    }
}
//[2985341777,5626789297,2277737468,2531233066, 4238516333,5535555568,5677222856,6287890819, 7894103332,4305550139]
