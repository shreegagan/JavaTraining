package core;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class UtilsTest {
	
	public static void testQueue(Queue<Point>points) {
		points.add(new Point(2,3));
		points.add(new Point(2,4));
		
		points.add(new Point(2,3)); 
		points.add(new Point(2,9)); //add an element to top of stack
		System.out.println("Size="+points.size());//print the size of stack
		System.out.println(points);
		System.out.println(points.remove());//removes top elements
		System.out.println(points.poll());
//		System.out.println(points.peek());//display top element
		System.out.println("Size="+points.size());
	}
	
	public static void testStack(Stack<Point>points) {
		points.push(new Point(2,3));
		points.push(new Point(2,4));
		
		points.push(new Point(2,3)); 
		points.push(new Point(2,9)); //add an element to top of stack
		System.out.println("Size="+points.size());//print the size of stack
		System.out.println(points);
		System.out.println(points.pop());//removes top elements
		System.out.println(points.peek());//display top element
		System.out.println("Size="+points.size());
			
	}
	
	public static void testMap(Map<String,Point>points) {
		points.put("2,3",new Point(2,3));
		points.put("2,9",new Point(2,3));
		points.put("3,2",new Point(3,2));
		points.put("2,4",new Point(2,4));
		points.put("4,2",new Point(2,4));
		System.out.println("Size="+points.size());
	System.out.println(points);
		
	}
//	public static void testList(List<Point>points)
//	{
//		Point p =new Point(2,3);
//		Point p1=new Point(2,3);
//		
//		points.add(p);
//		points.add(p1);
//		points.add(p);
//		points.add(new Point(3,2));
//		points.add(new Point(2,4));
//		points.add(new Point(4,2));
//		System.out.println("Size="+points.size());
//		System.out.println(points);
//		
//	}
	
//	public static void testSet(Set<Point>points)
//	{
//		Point p =new Point(2,3);
//		Point p1=new Point(2,3);
//		
//		points.add(p);
//		points.add(p1);
//		points.add(p);
//		points.add(new Point(3,2));
//		points.add(new Point(2,4));
//		points.add(new Point(4,2));
//		System.out.println("Size="+points.size());
//		System.out.println(points);
//	}
	
	
	
	public static void main(String[] args) {
//		testSet(new HashSet<>());
//		testSet(new TreeSet<>());
//		testList(new ArrayList<>());
//		testList(new LinkedList<>());
//		
//		testMap(new HashMap<>());
//		testStack(new Stack<>());
		testQueue(new LinkedList<>());
	}

}
