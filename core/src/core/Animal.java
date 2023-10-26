package core;

 interface Animal {
	public void myMethod();
	public void myOtherMethod();
	

}

class Dog implements Animal{
	public void myMethod()
	{
		System.out.println("abc");
		
	}
	public void myOtherMethod()
	{
		System.out.println("xyz");
	}
}
class Main{
	public static void main(String[] args) {
		Dog d =new Dog();
		d.myMethod();
		d.myOtherMethod();
		
	
}
	
}

	
