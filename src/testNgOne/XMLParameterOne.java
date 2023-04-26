package testNgOne;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XMLParameterOne 
{
	@Parameters({"url","username","password"})
	@Test
	public void login (String url,String username,String password)
	{
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

}
