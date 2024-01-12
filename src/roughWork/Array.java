package roughWork;

import java.util.Arrays;

public class Array 
{

	public static void main(String[] args) 
	{
	
		int Roll_No[] = new int[5];
		Roll_No[0] =10;
		Roll_No[1] =50;
		Roll_No[2] =40;
		Roll_No[3] =30;
		Roll_No[4] =20;

		for(int i=Roll_No.length-1;i>=0;i--)
		{
			System.out.println(Roll_No[i]+" ");
		}
		
		Arrays.sort(Roll_No);//read about this how to do this

	System.out.println("=================");
		
//		System.out.println(S.length);
		
		System.out.println("=================");
		
//		Split Method:-
		String mystring="Good Morning";
		String s=" ";
		String[] output=mystring.split(s);
		System.out.println(output[1]);
		
		System.out.println("=================");
		
		int RollNo[]= {1,2,3,4,5};
		
		System.out.println(RollNo[3]);

		System.out.println("=================");
		
		
		int ar[][]= {{10,20,30},{40,50,60},{70,80,90}};

		
		//System.out.println(ar[1][1]);
			
			for(int i=0;i<=2;i++)
			{
			 for (int j=0;j<=2;j++)
			 {
				 System.out.print(ar[i][j]+" ");
			 }
			 System.out.println();
			}


	}

}
