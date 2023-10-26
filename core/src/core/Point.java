package core;

import java.io.Serializable;

public class Point implements PointIntf,Comparable<Point>,Serializable {
	
	
	
 

	public static final Point ORIGIN= new Point();

	

	//static {System.out.println(ORIGIN);} (Should ask about it)

	

	public Point() {}

	

	protected int x;

	 protected int y;
	
	@Override
	public Point pointAdd(Point a, Point b, Point c) {
		// TODO Auto-generated method stub
		c.x=a.x+b.x;
		c.y=a.y+b.y;
		return c;
	}
	@Override
	public Point pointSub(Point a, Point b, Point c) {
		c.x=a.x-b.y;
		c.y=a.y-b.y;
		// TODO Auto-generated method stub
		return c;
	}
	@Override
	public double pointDistance(Point a, Point b) {
		double x=a.x-b.x;
		double y=a.y-b.y;
		double res=Math.sqrt(x*x+y*y);
		
		
		return res;

	}

 

	//Overriding equals method by Type casting

	@Override

	public boolean equals(Object obj) {

		Point p = (Point) obj;

		return p.x==x && p.y==y;

	}

 

	//Overriding hashCode

	@Override

	public int hashCode() {

		return toString().hashCode();

	}

 

	@Override

	public String toString() {

		System.out.println("Printing the values of X,Y,Distance");

		return " X = " + x + " Y = " + y + " Distance = " +distance();	

	}

 

	//Constructor with Parameters

	public Point(int x, int y){

		System.out.println("0. Invoking Point(x,y) in Point");

		this.x=x;

		this.y=y;

	}

	

	//Method with object as parameter

	public double distance (Point other)

	{

		System.out.println("1. Invoking distance(Point Obj) in Point");

		return distance (other.x,other.y);

	}

 

	//Method to calculate distance after the origin has been changed

	public double distance()

	{

		System.out.println("2. Invoking distance() in Point");

		int diffx = x-ORIGIN.x;

		int diffy = y-ORIGIN.y;

		return Math.sqrt(diffx*diffx +diffy*diffy);

	}

	

	//Method with integers as parameter

	public double distance(int x, int y)

	{

		System.out.println("3. Invoking distance(x,y) in Point");

		int diffx =this.x-x;

		int diffy =this.y-y;

		return Math.sqrt(diffx*diffx +diffy*diffy);

	}

 

	//Main function

	public static void main(String[] args) {
		double d1;

		Point p = new Point();

		System.out.println("When the origin was in 0,0");

		p.x=3;

		p.y=4;

		System.out.println(p.distance());

		

		System.out.println("After changing the origin");

		ORIGIN.x=1;

		ORIGIN.y=1;

		System.out.println(p.distance());

		

		Point p1 = new Point(2,3);
		Point p2 = new Point(1,1);
		Point p3= new Point();
		PointIntf s1=new Point();
		System.out.println(s1.pointAdd(p1, p2, p3));
		System.out.println(s1.pointSub(p1, p2, p3));
		d1=s1.pointDistance(p1 ,p2);
		System.out.println(d1);
		
				
		
		

	}
	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		
		return (x-o.x)==0?(y-o.y):(x-o.x);
	}

}