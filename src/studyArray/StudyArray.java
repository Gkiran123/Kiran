package studyArray;

public class StudyArray {

	public static void main(String[] args) 
	{
	// i want to store student names
		
	String name[] = new String[5];
	
	int tableOf2[] = new int [10];
	
	char [] gender = new char[3];
	
	// i want to store players
	
	String [] players = new String[10];// array declaration
	
	players[0] = "Gill";//Array initialization
	players[1] = "Rohit";
	players[2] = "Virat";
	players[3] = "KL";
	players[4] = "Surya";
	
	System.out.println(players[0]);
	System.out.println(players[1]);
	System.out.println(players[2]);
	System.out.println(players[3]);
	System.out.println(players[4]);
	System.out.println(players[5]);
	
	int[] rollNum = new int[5];//array declaration
	
	rollNum[0] = 10;
	rollNum[1] = 11;
	rollNum[2] = 12;
	rollNum[3] = 13;
	rollNum[4] = 14;
	//rollNum[5] = 15;
	System.out.println("===============");

	System.out.println(rollNum[0]);//array usage
	System.out.println(rollNum[1]);//array usage
	System.out.println(rollNum[2]);
	System.out.println(rollNum[3]);
	System.out.println(rollNum[4]);
	System.out.println("===============");
// static for loop
	for(int i=0;i<=4;i++)//(i++ means only change of 1)
		//0->1->2->3->4
	{
		System.out.println(rollNum[i]);
	}
	System.out.println("===============");
	//this above for loop is called as static for loop
	
	System.out.println(rollNum.length);
	
	
//Dynamic for loop
	
	for(int i=0;i<=rollNum.length-1;i++)
	{
		System.out.println(rollNum[i]);
	}
	
	
	
	}
}
