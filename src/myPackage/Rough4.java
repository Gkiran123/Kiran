package myPackage;

public class Rough4 
{
	
	public static void main(String[] args)
	{

		Rough4 mu = new Rough4();
		mu.c(200, 50,"India");


	}

	public void c(int runs,int overs,String teamName)
	{//runs,overs,team.
	System.out.println("Details of the Match");
	System.out.println("=======================");
	System.out.println("Total runs of the Team is "+runs);
	System.out.println("Total overs of the Team played "+overs);
	System.out.println("Name of the Team is "+teamName);

	}
	

}
