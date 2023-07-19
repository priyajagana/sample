package day04;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Student_Set {
public void setExample() {
		
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number of students...");
		int numberOfstudents = sc.nextInt();
		
		for(int i=1; i<=numberOfstudents; i++) {
			System.out.println("please enter name-"+i);
			
			String name  = sc.next();
			boolean isAlreadyNotExists = names.add(name);
			
			if (isAlreadyNotExists) {
				System.out.println("Name enrolled sucecssfully");
			}
			else {
				System.out.println("Name already exists");
			}
		}
		
		printNames(names);
		
	}
	
	public void printNames(LinkedHashSet<String> names) {
		
		for (String name : names) {
			
			System.out.println(name);
		}
		
	}

	public static void main(String[] args) {
		
		Student_Set list1 = new Student_Set();
		list1.setExample();
	}
//hashset stores data or names randomly
	//treeset stores in alphabetically order or any order depending on string
	//linkedhastset stores according to the insertion of data
	//how it is entered it stores and reads the data
}
