package utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataUtils 
{
	public static String firstName()
	{
		String fName = RandomStringUtils.secure().nextAlphabetic(5);
		return fName;
	}
	
	public static String lastName()
	{
		String lName= RandomStringUtils.secure().nextAlphabetic(5);
		return (lName);
	}
	
	public static String email()
	{
		String ranEmail = RandomStringUtils.secure().nextAlphanumeric(5);
		return (ranEmail + "@gmail.com");
	}
	
	public static String pass()
	{
		String ranPass = RandomStringUtils.secure().nextAlphanumeric(8);
		return ranPass;
	}
	
	public static String phoneNo()
	{
		String phoneno = RandomStringUtils.secure().nextNumeric(10);
		return phoneno;
	}
	
	public static String zipCode()
	{
		String zipcode = RandomStringUtils.secure().nextNumeric(6);
		return zipcode;
	}
	
	
}
