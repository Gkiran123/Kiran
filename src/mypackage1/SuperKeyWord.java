package mypackage1;

public class SuperKeyWord extends ThisKeyWord

{

	int a=1000;
	
	public static void main(String[] args) 
	
	{
		SuperKeyWord su=new SuperKeyWord();
		su.test3();
	}

	
	
	public void test3()
	{
		
int a=999;//local non static variable from subclass

int sum=a+100;//used local value of a--->999

System.out.println(sum+" used local value");
		
int sum1=this.a+100;//used local value of a-->1000
System.out.println(sum+" used local value of same class");
		
int sum2=b+100;//used global variable of b-->190 from super class(from thiskeyword)
	System.out.println(sum2);
int sum3=super.a+100;//
	System.out.println(sum3);
	
	}
	
}
