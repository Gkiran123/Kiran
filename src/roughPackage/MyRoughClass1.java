package roughPackage;

public class MyRoughClass1 {

	public static void main(String[] args) 
	{
		int num = 5;
        System.out.println("Multiplication Table for " + num + ":");
        System.out.println("===========================");
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(i + " x " + num + " = " + result);

	}

}
}
