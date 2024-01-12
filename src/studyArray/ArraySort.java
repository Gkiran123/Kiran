package studyArray;

import java.util.Arrays;

public class ArraySort 
{

	public static void main(String[] args) 
	{
	
	int money[] = {10,100,20,200,50,500,2000};
	int length = money.length;
	
	System.out.println(money.length);
		
for(int i=0;i<=length-1;i++)
{
System.out.println(money[i]);	
}
System.out.println("========Ascending======================");
Arrays.sort(money);
for(int i=0;i<=length-1;i++)
{
System.out.println(money[i]);	
}
System.out.println("=========Descending====================");
for(int i=length-1;i>=0;i--)
{
System.out.println(money[i]);
}
System.out.println("=========Multiple Example==============");


int ar[][] = {{100,50,10},{1000,500,50},{10000,5000,500}};

for(int i=0;i<=2;i++)
{
	for(int j=0;j<=2;j++)
	{
		System.out.print(ar[i][j]+" ");//i is for row then j is for column
	}
	System.out.println();
}





























	}

}
