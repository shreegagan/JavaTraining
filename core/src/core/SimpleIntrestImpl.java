package core;

public class SimpleIntrestImpl implements SimpleIntrest{
	private Arithematic arithematic;
	
	public SimpleIntrestImpl(Arithematic arithematic){
		this.arithematic = arithematic;
	}
	
	public void setArithematic(Arithematic arithematic) {
		this.arithematic = arithematic;
	}
	
	@Override
	public double computeIntrest(int prin, int roi, int time) {
		int result= arithematic.mul(prin, roi);
		result= arithematic.mul(result, time);
		

		return arithematic.div(result,100);
	}
	
	public static void main(String[] args) {
		Arithematic arithematic= new ArithematicImpl();
		SimpleIntrest s1=new SimpleIntrestImpl(arithematic);
		System.out.println(s1.computeIntrest(200, 3, 4));
	}
}