package roughWork;

public class Constructor12 {

	public static void main(String[] args) 
	{
		Constructor12 S = new Constructor12();
		
		
		
	}

	private int x;
	
    public Constructor12() {
        this(1);
    }

    public Constructor12(int x) {
        this.x = x;
    }
	
	public void Addition()
	{
		System.out.println(this.x);
	}
}
