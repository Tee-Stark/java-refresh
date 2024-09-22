package basics;

import java.util.Scanner;

public class ReadingInput {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		System.out.print("Enter your gender: ");
		char gender = scanner.next().charAt(0);
		System.out.print("Enter your contact: ");
		long contact = scanner.nextLong();
		
		System.out.println("Name : " + name);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Contact: " + contact);
		
	}
}