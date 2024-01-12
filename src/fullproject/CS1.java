package fullproject;
public class CS1 
{
int num1;
int num2;
int num3;

public CS1() //user defined without parameters constructor
{
num1 = 10;
num2 = 20;
num3 = 30;
}

public CS1(int a) //user defined with parameter constructor
{
num1 = a;	
}
		
public CS1(int a,int b)//user defined with 2 parameters constructor
{
num1=a;
num2=b;
}
public CS1(int a,int b,int c)//user defined with 3 parameters constructor
{
num1=a;
num2=b;
num3=c;
}
public void addition()//non static method
{
int sum = num1+num2+num3;
System.out.println("Addition is "+sum);	
}
public static void main(String[] args) 
{
CS1 mu1 = new CS1();
mu1.addition();
CS1 mu2=new CS1(100);
mu2.addition();
CS1 mu3=new CS1(100,200);
mu3.addition();
CS1 mu4=new CS1(100,200,300);
mu4.addition();
}
}
