package Framework;

import org.testng.annotations.DataProvider;

public class DataProviderClass
{
	@DataProvider(name="SignupCredentials")
	public static String[][] data()
	{
		String arr[][]= {{"lap","acer.aspire@gmil.com","store"}};
		return arr;
		
	
	}

}
