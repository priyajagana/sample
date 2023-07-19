package day04;

public class Student_Array {
float sum;
	
	public void ArrayExample() {
		
		float [][] studentsMarks = {
		
				{34.5f, 78.9f, 30.5f},
				{90.5f, 86.5f, 76.5f},
				{90.5f, 46.7f, 29.5f, 88.5f}
		};
		
		studentsMarks[2][3]=67.5f;
		
		calculateSum_Array(studentsMarks);
	}
	
	public void calculateSum_Array(float [][] studentsMarks) {
		
		for (float[] studentMarks : studentsMarks) {
			
			sum=0;
			
			for (float mark :  studentMarks) {
				
				sum=sum+mark;	
				
			}
			System.out.println("the sum of marks scored by Student is "+sum);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Student_Array s1 = new Student_Array();
		s1.ArrayExample();
	}


}
