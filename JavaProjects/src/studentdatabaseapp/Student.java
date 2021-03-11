package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstname;
	private String lastname;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costPerCourse = 600;
	private static int id = 1000;
	
	//Constructor: Prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first name: ");
		this.firstname = in.nextLine();
		
		System.out.print("Enter the last name: ");
		this.lastname = in.nextLine();
		
		System.out.println("\n1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter the grade level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
	}
	
	//Generate an ID
	private void setStudentID() {
		id++;
		this.studentID = this.gradeYear + "" + id;
	}
	
	//Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter the course to enroll[Q to quit] : ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n " +course;
				tuitionBalance = tuitionBalance + costPerCourse;
			}
			else
				break;
		}while(1 != 0);
	}
	
	//View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" +  this.tuitionBalance);
	}
	
	//Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		if(tuitionBalance > 0) {
			tuitionBalance -= payment;
			System.out.println("Thank your for your payment of : $" + payment);
		}
		else {
			System.out.println("You are not enrolled in any courses");
		}
		
		viewBalance();
	}
	
	//Show status
	public String showInfo() {
		return "\nName:" + firstname + " " + lastname
				+ "\nStudent ID: " + studentID
				+ "\nGrade Level:" + gradeYear
				+ "\nCourses Enrolled: " + courses
				+ "\nBalance is: " + tuitionBalance
				+"\n";
	}

}
