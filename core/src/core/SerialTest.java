package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialTest {
	
	public static void main(String[] args)  throws Exception {
		Point p =new Point(2,3);
		System.out.println(p);
		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream(new File("object")));
		oos.writeObject(p);
		oos.flush();
		oos.close();
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream(new File("object")));
		Point p1= (Point) ois.readObject();
		System.out.println(p1);
		System.out.println(p==p1);
		
		Point3D p2 =new Point3D(2,3,4);
		System.out.println(p2);
		ObjectOutputStream oos1 =new ObjectOutputStream(new FileOutputStream(new File("gagan")));
		oos1.writeObject(p2);
		oos1.flush();
		oos1.close();
		ObjectInputStream ois1 =new ObjectInputStream(new FileInputStream(new File("gagan")));
		Point p3= (Point) ois1.readObject();
		System.out.println(p3);
		System.out.println(p2!=p3);
	}
	

}

