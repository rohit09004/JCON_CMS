package com.csm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.csm.qa.base.CSMBase;

public class LoginPage extends CSMBase {
	

	@FindBy(xpath="/html/body/div/div[2]/div[2]/form/div/div[2]/input")
	WebElement UserID;
	
    @FindBy(id="/html/body/div/div[2]/div[2]/form/div/div[3]/input")
	WebElement Password;
	
    @FindBy(xpath="/html/body/div/div[2]/div[2]/form/div/button")
	WebElement login_Btn;
	
     @FindBy(xpath="/html/body/div[1]/div/section[2]/div[3]/div/div/div/div[1]/button")
     WebElement closePasswordPoup;
     
    //Initialize Page object  
     public LoginPage()
     {
    	 PageFactory.initElements(driver,this);
     }
    
//    public HomePage login(String uid, String pwd)
//     //public void HomePage(String uid, String pwd)
//    // public HomePage login()
//     {
//    	 UserID.sendKeys(uid);
////    	 UserID.sendKeys("Admin");
//    	 Password.sendKeys(pwd);
////    	 Password.sendKeys("AdminQA1");
//    	 login_Btn.click(); 
//    	 closePasswordPoup.click();
//    	 return new HomePage();
//    		
//     }
    public void loginCredentials(String uid, String pwd) {
    	UserID.sendKeys(uid);
//   	 UserID.sendKeys("Admin");
   	 Password.sendKeys(pwd);
//   	 Password.sendKeys("AdminQA1");
   	 login_Btn.click(); 
   	 closePasswordPoup.click();
   	 
    }
    
	private void closePasswordPoup() {
		// TODO Auto-generated method stub
		//closePasswordPoup.click();
	}
}
