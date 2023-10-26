package core3;

public class VarArgs {
	public int add(int a, int... b) {
		int result = a;
		for (int b1 : b) {
			result += b1;

		}
		return result;
	}

	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		System.out.println(va.add(2));
		System.out.println(va.add(2, 3));
		System.out.println(va.add(2, 3, 4));
		System.out.println(va.add(0, 10, 20, 30));
	}

}
