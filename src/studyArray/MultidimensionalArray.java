package studyArray;

public class MultidimensionalArray {

	public static void main(String[] args) 
	{
		
		// {{ 10 20 }}
		// {{ 30 40 }}
		
		// array declaration part
		int [][] num = new int [2][2]; 
		
		//Array initialization
		num[0][0] = 10;
		num[0][1] = 20;
		num[1][0] = 30;
		num[1][1] = 40;
 		
		System.out.print(num[0][0]+" ");
		System.out.println(num[0][1]+" ");
		System.out.print(num[1][0]+" ");
		System.out.println(num[1][1]);
		
		System.out.println("================");
		
		// use of nested for
		
		//row-----> outer for loop
		for(int i=0;i<=num.length-1;i++)//0
		{
			//column-->inner for loop
			
			for(int j=0;j<=num.length-1;j++);//0,1,2
			{
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		
		// {{	Sachin Virendra Sourabh }}
		//{{	Irfan Zaheer Anil		}}
		//{{	Kaif Yuvraj MSD 		}}
		
		String players [][] = new String [3][3];
		
		players [0][1]="ST";
		players [0][1]="VS";
		players [0][2]="SG";
		players [1][0]="IP";
		players [1][1]="ZK";
		players [1][2]="AK";
		players [2][0]="MK";
		players [2][1]="YS";
		players [2][2]="MD";
		
		for(int i=0;i<=players.length-1;i++)
		{
			for(int j=0;j<=players.length-1;j++)
				System.out.println(players[i][j]+" ");
		}
		System.out.println();
	}

}
