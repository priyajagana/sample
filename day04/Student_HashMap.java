package day04;

import java.util.HashMap;
import java.util.Map.Entry;

//hashmap is used when 2 diff variables used like roll and student
//in hashmap its keyvalue relationship
public class Student_HashMap {
public void hashmapExample() {
		
		HashMap<Integer, String> studentDetails = new HashMap<Integer, String>();
		
		studentDetails.put(10001, "vijaya");
		studentDetails.put(10002, "bharathi");
		studentDetails.put(10003, "java");
		studentDetails.put(10004, "selenium");
		studentDetails.put(10005, "numpy ninja");
		
		//printStudentDetails(studentDetails);
		
		System.out.println(studentDetails);
		
		System.out.println("value for the key 10003 : " + studentDetails.get(10003));
		
	}
	
	public void printStudentDetails(HashMap<Integer, String> studentDetails) {
		
		
		for(Entry student : studentDetails.entrySet()) {
			
			//every entry above has combination of 
			//one kay and value
			
			int rollNo = (int) student.getKey();
			String Name = (String) student.getValue();
			
			System.out.println("Roll Number : "+rollNo+ " | name : "+Name);
		}
		
		
	}

	public static void main(String[] args) {
		
		Student_HashMap s1 = new Student_HashMap();
		
		s1.hashmapExample();
	}

}
