package Logical_Program_Of_array;


public class Find_Duplicate_Element {

	public static void main(String[] args) 
	{
		
	int VN[] = {10,100,10,50,500,50,20,200,20};
	
	for(int i=0;i<VN.length;i++)
	{
		for(int j=i+1;j<VN.length;j++)
		{
			if(VN[i]==VN[j])
				System.out.println(VN[i]);
		}
	}
		
		
	}

}
