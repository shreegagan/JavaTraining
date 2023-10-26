package core3;

import java.util.Scanner;

public class AdderImpl implements Adder{

	public int sub(int a,int b) {
		return subExtract(a,b);
	}

	/**
	 * @return
	 */
	public int subExtract(int a,int b) {
		
		return a+b;
	}
	
	@Override
	public int add(int a, int b) {
		
		return a+b;
	}
 public static void main(String[] args) {
	Adder a= new AdderImpl();
	AdderImpl a3=new AdderImpl();
	System.out.println(a.add(2,3));
	Adder a1=new Adder() {

		@Override
		public int add(int a, int b) {
			// TODO Auto-generated method stub
			return a+b;
		}
		
		
	};
//	Lambda Expression
	Adder a2=(i,j)-> {return i+j;};
	System.out.println(a2.add(4,3));
	System.out.println(a3.sub(2,3));
}
	
}
