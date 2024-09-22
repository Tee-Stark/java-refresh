package basics;

import java.awt.Point;
import java.util.Date;

public class VariablesAndDataTypes {
	public static void main(String[] args) {
		// primitive data types
		byte age = 23;
		long viewCounts = 1_123_234_456;
		float price = 234.65F;
		char gender = 'M';
		boolean isValid = true;
		
		System.out.println(age);
		System.out.println(viewCounts);
		System.out.println(price);
		System.out.println(gender);
		System.out.println(isValid);
		
		// non-primitive data types
		String name = "Timi Stark";
		Point pnt = new Point(10,20);
		Date now = new Date();
		System.out.println(name);
		System.out.println(now);
		System.out.println(pnt.x + ":" + pnt.y);
		pnt.y = 12;
		System.out.println(pnt.x + ":" + pnt.y);
	}
}