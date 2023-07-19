package day04;

import java.util.ArrayList;
//modlog
public class Student_Arraylist {
	float sum;
	public void ArrayList(){
		//1. create an empty collection
				//2. add data to the collection
				//3. read data from the collection
		ArrayList<Float>marks=new ArrayList<Float>();
		marks.add(87.5f);
		marks.add(97.5f);
		marks.add(37.5f);
		marks.add(67.5f);
		
		calculateSum(marks);

		
		
	}
	public void calculateSum(java.util.ArrayList<Float> marks) {
		// TODO Auto-generated method stub
		for(float mark:marks) {
			sum=sum+mark;
		}
		System.out.println("The sum of the marks scored by student is : "+sum);
	}
public static void main(String[] args) {
	Student_Arraylist s1=new Student_Arraylist();
	s1.ArrayList();
}
}
