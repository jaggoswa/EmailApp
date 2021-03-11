package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		//Ask how many new users we want to add
		System.out.print("Enter the number of students to enroll: ");
		Scanner in = new Scanner(System.in);
		int noOfStudents = in.nextInt();
		
		//Create n number of new students
		Student[] students = new Student[noOfStudents];
		
		for(int i=0; i<noOfStudents; i++) {
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].showInfo());
		}
		

	}

}
