package abstract1;

import java.util.Scanner;

public class MyClass2 {

	public static void main(String[] args) 
{
		int num;
		System.out.print("Enter any Number "); 
		Scanner r=new Scanner(System.in);
		num=r.nextInt();
		for(int i=1; i<=10; i++)
		{
		System.out.println(num+"*"+i+"="+num*i);
		}

	
}
}
