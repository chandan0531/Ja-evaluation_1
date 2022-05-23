//Question 2:
package com.massai;
import java.util.Scanner;
public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	public void displayCourseDetails() {
		
		System.out.println("courseId : " + courseId);
		System.out.println("courseName : " + courseName);
		System.out.println( "courseFee : " + courseFee);
	}
	
	public static void authenticate (String username, String password) {
		if(username=="Admin" && password=="1234")
			{
				Course s1 = new Course();
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Enter Course Id");
				s1.courseId = scan.nextInt();
				
				System.out.println("Enter Course Name");
				s1.courseName = scan.nextLine();
				scan.nextLine();
				
				
				System.out.println("Enter Course courseFee");
				s1.courseFee = scan.nextInt();
				
				s1.displayCourseDetails();
			}
		else {
			System.out.println("Invalid Username or password");
			}
		}
	
	public static void main(String[] args) {
		authenticate("Admin", "1234");
		authenticate("Admin", "123");
	}
}

