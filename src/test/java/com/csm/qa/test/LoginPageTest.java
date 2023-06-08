package com.csm.qa.test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.csm.qa.base.CSMBase;
import com.csm.qa.pages.HomePage;
import com.csm.qa.pages.LoginPage;

public class LoginPageTest extends CSMBase{
	LoginPage loginPage;
	HomePage homePage;
	
//	public LoginPageTest()
//	{
//		super();// call base class constructor first 
//	}
	
    //Validate Login with Valid Credentials 
	@Test(priority=1)
	public void LoginWithValidCredentials() throws InterruptedException
	{
		initialize();
		loginPage= new LoginPage();
		System.out.println("upto loginPage doned");
	//	homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		loginPage.loginCredentials("Admin", "AdimQA1");
		//loginPage=homePage.login(prop.getProperty("username"), prop.getProperty("password"));	
		//loginPage=homePage.l
		//homePage=loginPage.login();
		Thread.sleep(1000);
		String homePagetitle= driver.getTitle();
		Assert.assertEquals(homePagetitle,"Home Page", "Invalid Credentials");
		driver.quit();
	}
	@Test(priority=2)
	public void DemoTest2() throws InterruptedException
	{
		
	System.out.println("Test2");
	}
	@Test(priority=3)
	public void DemoTest3() throws InterruptedException
	{
		
	System.out.println("Test3");
	}
	@Test(priority=4)
	public void DemoTest4() throws InterruptedException
	{
		
	System.out.println("Test4");
	}
	@Test(priority=5)
	public void DemoTest5() throws InterruptedException
	{
		
	System.out.println("Test5");
	}
	@Test(priority=6)
	public void DemoTest6() throws InterruptedException
	{
		
	System.out.println("Test6");
	}
	
}