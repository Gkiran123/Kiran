package methodsWithparameters;

public class MethodsWithParameters1 {

	public static void main(String[] args) 
	{
	
		
		//Static with paral
		StudentInfo("Kiran",54 , 56, 'B', 56.11f);
		MethodsWithParameters1 mu = new MethodsWithParameters1();
		mu.StudentInformation("Shrutika",85, 'A', 35.55);
	}

	public static void StudentInfo(String name,int rollno,int marks,char grade,float percentage)
	{
		
		System.out.println("=========================");
		System.out.println("Name of the Student "+name);
		System.out.println("Roll no of the Student "+rollno);
		System.out.println("Marks of the student "+marks);
		System.out.println("Grade of the student "+grade);
		System.out.println("Percentage of the student "+percentage);
		System.out.println("=========================");
		
		
	}
	
	void StudentInformation(String Name,int Marks,char Grade,double Percentage)
	{
		
		System.out.println(Name);
		System.out.println(Marks);
		System.out.println(Grade);
		System.out.println(Percentage);
	}
	
}
