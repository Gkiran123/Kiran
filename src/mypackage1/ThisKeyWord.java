package mypackage1;

public class ThisKeyWord 
{

int a=100;//non static global variable
int b=190;//non static global variable
static int c=1;

public static void main(String[] args) 
{

	ThisKeyWord t= new ThisKeyWord();//created pbject of a
	t.test();//cant use object variable outside main method
	
}

public void test()
{
int a=100;//non static local variable
int sum=a+10;
System.out.println("sum is"+sum);

int b=900;

int sum1 = this.a+10;
System.out.println("sum is "+sum);

int sum2=this.b+10;
System.out.println("sum is "+sum2);

int div=c/10;//we can use static variable in static as well as non static methods 
}

static void test1()
{
	//int mul=a*10; we cant use non static variable in static method
	
	
	int mul1=c*100;
}

}
