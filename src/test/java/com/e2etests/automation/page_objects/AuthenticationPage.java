package com.e2etests.automation.page_objects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;
public class AuthenticationPage {
	
	private ConfigFileReader configfilereader; 
	
	/*@FindBy*/
	@FindBy(how = How.NAME, using = "userName")
			public static WebElement username;
	//identification de champ password
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnsubmit;

	@FindBy(how = How.TAG_NAME, using = "h3")
	public static WebElement welcomemessage;
	
	
	//creation  constructor
	public AuthenticationPage() {
		PageFactory.initElements(Setup.driver,this);
		this.configfilereader = new ConfigFileReader();
	}
	
	
	/* Create method */
	
	public void goToUrl() {
		Setup.getDriver().get(configfilereader.getProperties("home.url"));
	}
	
	public void fillUserName(String name) {
		username.sendKeys(name);
	}
	
	public void fillPassword(String passtext) {
		password.sendKeys(passtext);
	}
	
	public void ClickOnBbtnSubmit() {
		btnsubmit.click();
	}
	
}
