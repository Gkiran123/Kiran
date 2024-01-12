package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FBDataProvider 
{
//method --> data provider
//String firstName,String LastName,String MobNum
	
@DataProvider(name="FBRegression")
public static String[][] fbDataSet()
{
	
	String data [][]= {{"Yogendra","Joshi","9923098580"},{"Yogesh","Reddy","9923098590"},{"Sunil","Shinde","8823098580"}};
	return data;
	
	
}

public static String[][] fbDataSet1()
{
	
	String data [][]= {{"Yogendra","Joshi","9923098580"},{"Yogesh","Reddy","9923098590"},{"Sunil","Shinde","8823098580"}};
	return data;
	
	
}




}
