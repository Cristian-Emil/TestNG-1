package ziua_44;

import org.testng.annotations.Test;

public class SignupTests {
	
	@Test(priority=1,groups= {"regression"})
	void signupbyemail()
	{
		System.out.println("this is signup by email....");
	}
	
	@Test(priority=1,groups= {"regression"})
	void signupbyfacebook()
	{
		System.out.println("this is signup by facebook....");
	}
	
	@Test(priority=1,groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("this is signup by twitter....");
	}
	

}
