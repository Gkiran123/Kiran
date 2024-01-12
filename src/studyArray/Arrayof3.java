package studyArray;

import java.util.Arrays;

public class Arrayof3 {

	public static void main(String[] args) 
	{
	
		int [] age = {7,8,1,9,6,4,5};
		
		
		
		// i want to print the age values as it is
		
		System.out.println("============Same order================");
		
		for(int i =0;i<=age.length-1;i++)
			
		{
			System.out.println(age[i]);
		}
		System.out.println("============Reverse order================");
		// i want to print the age values in the reverse order
		
		for(int i=age.length-1;i>=0;i=i-1)
		{
			System.out.println(age[i]);
		}
		
		System.out.println("============Ascending order================");
		
		Arrays.sort(age);           //using sort method of arrays class
		
		for(int i=0;i<=age.length-1;i++)
		{
			System.out.println(age[i]);
		}
		
		
	}

}
