package inheritance1;

public class Single_Level_Inheritance
{
public static void main(String[] args)
{
Mother m = new Mother();
m.Home();
m.Bicycle();

son s = new son();
s.Mobile();
s.Laptop();

{
System.out.println("=======================");	
}


s.Home();
s.Laptop();

}


}
