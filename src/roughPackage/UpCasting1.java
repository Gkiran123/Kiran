package roughPackage;

public class UpCasting1
{

	public static void main(String[] args) 
	{
	
		Father F = new Father();
		F.bike();
		F.car();
			
		
		Son S = new Son();
		S.bike();
		S.car();
		S.degree();
		
		Father FS = new Son();
		FS.bike();
		FS.car();
		//FS.degree();
		
		
		
	}

}
