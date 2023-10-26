package core;

public class ArithematicImpl implements Arithematic{
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int sub(int a, int b) {
		return a-b;
	}
	@Override
	public int mul(int a, int b) {
		return a*b;
	}
	@Override
	public int div(int a, int b) throws DivideByZero {
		if (b==0) {
			throw new DivideByZero("Zero cannot be used as dinominator");
			
		}
		return a/b;
	}
	public static void main(String[] args) throws DivideByZero{
		Arithematic a = new ArithematicImpl();
		System.out.println(a.add(9, 3));
		try {
			System.out.println(a.div(9, 0));
		}catch(DivideByZero e) {
			System.out.println(e.getMessage());
		}catch (Exception e)
		{
			System.out.println("will not disply");
		}finally {
			System.out.println("always seen:");
		}
		System.out.println(a.mul(9, 3));
	}

}
