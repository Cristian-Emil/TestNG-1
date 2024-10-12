package ziua_42;

import org.testng.annotations.Test;

/*
 1) Open app
 2) Login
 3) Logout
  
 */

//        -4 -5 -3 -2 -1  0 1 2 3 4 5

public class Clasa_FirstTestCase
{
	@Test(priority=1)
	void logout()
	{
		System.out.println("Logout from application.....");
	}
	
	
	@Test(priority=0)
	void login()
	{
		System.out.println("Login to application.....");
	}

	@Test(priority=-1)
	void openapp()
	{
		System.out.println("opening application...");
	}
	
}
