package studyArray;

import java.util.Arrays;

public class Array_Study {

	public static void main(String[] args) 
	{
	
int money[]=new int[6];
		
		money[0]=50;
		money[1]=20;
		money[2]=10;
		money[3]=40;
		money[4]=30;
		money[5]=60;
		
		
		
		System.out.println("Orignal Output");
		for (int i=0;i<=5;i++)
		{
			System.out.println(money[i]);
		}
		System.out.println("=======================");
		
		Arrays.sort(money);// inbuilt method Array
		
		System.out.println("Sorted array");
		for (int i=0;i<=5;i++)
		{
			System.out.println(money[i]);
		}
		System.out.println("=======================");

		for(int i=5;i>=0;i--)
		{
			System.out.println(money[i]);
		}
		}

}
