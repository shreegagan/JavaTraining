package core4;

@FunctionalInterface
interface Computer{
	
	int code(int i, int j);
	
}
//
//class Laptop implements Computer{
//
//	@Override
//	public void code() {
//		// TODO Auto-generated method stub
//		System.out.println("run");
//		
//	}
//	
//	 
//}
//class Desktop implements Computer{
//
//	@Override
//	public void code() {
//		// TODO Auto-generated method stub
//		System.out.println("run faster");
//		
//	}
//}
//
//class Developer{
//	public void devApp(Desktop d) {
//		d.code();
//	}
//}
public class IntfWork {

	public static void main(String[] args) {
//		Laptop l= new Laptop();
//		Desktop d= new Desktop();
//		
//	Developer dv= new Developer();
//	dv.devApp(d);
//	System.out.println(Computer.i);
		
		Computer c= (int i,int j)-> i+j;
			
		
		int res=c.code(3,4);
		System.out.println(res);
	}
}
