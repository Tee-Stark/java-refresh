package oops;

import java.util.Scanner;

class Student {
	String fullname;
	int age;
	int id;
	Scanner scanner = new Scanner(System.in);
	
	public void enterDetails() {
		System.out.println("Enter student name: ");
		this.fullname = scanner.nextLine();
		System.out.println("Enter student age: ");
		this.age = scanner.nextInt();
		System.out.println("Enter student ID: ");
		this.id = scanner.nextInt();
	}
	
	public void displayDetails() {
		System.out.println("*****Student details******");
		System.out.println("Name: " + this.fullname);
		System.out.println("Age: " + this.age);
		System.out.println("ID: " + this.id);
	}
}

public class OopDemo {
	public static void main(String[] args) {
		Student tim = new Student();
		tim.enterDetails();
		tim.displayDetails();
	}
}