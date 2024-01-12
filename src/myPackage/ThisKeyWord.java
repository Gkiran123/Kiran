package myPackage;

public class ThisKeyWord extends SuperKeyWord
{

int a=100;
int b=200;

static int c=1;

public void test()
{
int a=300;

int sum1=a+100;

System.out.println(sum1);



int sum2=this.a+100;
System.out.println(sum2);

int sum3=this.b+100;
System.out.println(sum3);

int sum4=super.a+100;
System.out.println(sum4);

int sum5=super.b+100;
System.out.println(sum5);

int sum6=c+100;
System.out.println(sum6);


}

public static void test2()
{

	int sum7=c+100;
	System.out.println(sum7);
}
	
	
	
	
	public static void main(String[] args) 

{
		ThisKeyWord s = new ThisKeyWord();
		s.test();
	
		test2();
}
}
