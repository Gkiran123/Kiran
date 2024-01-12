package packageMethods;

public class Class8 {

	public class CS {
	    int a;
	    int b;
	    int c;

	    public CS() // user defined without parameter/ zero parameter
	    {
	        a = 1;
	        b = 5;
	        c = 6;
	    }

	    public CS(int x) // user defined single parameter cons
	    {
	        a = x;
	        b = 0; // Initialize b to 0
	        c = 0; // Initialize c to 0
	    }

	    public CS(int x, int y) // user defined two parameter cons
	    {
	        a = x;
	        b = y;
	        c = 0; // Initialize c to 0
	    }

	    public CS(int x, int y, int z) {
	        a = x;
	        b = y;
	        c = z;
	    }

	    public static void main(String[] args) {

	        CS c = new CS();
	        c.addition();
	        c.subtraction();
	        System.out.println("=================================");

	        CS c1 = new CS(200);
	        c1.addition();
	        c1.subtraction();
	        System.out.println("======================================");

	        CS c2 = new CS(6, 9);
	        c2.addition();
	        c2.subtraction();
	        System.out.println("==========================================");
	    }

	    public void addition() // non-static method
	    {
	        int sum = a + b + c;
	        System.out.println("a value is " + a);
	        System.out.println("b value is " + b);
	        System.out.println("c value is " + c);
	    }

	    public void subtraction() {
	        int sub = a - b - c;
	        System.out.println("sub is " + sub);
	    }
	}


}
