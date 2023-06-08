package com.csm.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.csm.qa.base.CSMBase;

public class HomePage extends CSMBase{
	
	
     @FindBy(xpath="//*[contains(text(),'CMS Modules')]")
	 WebElement CMS_Module;

	//Initialise the page object 
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
   public void clickOnCMSModuleMenu()
	{
		CMS_Module.click();
	}
	
	
	
	
	
	
}