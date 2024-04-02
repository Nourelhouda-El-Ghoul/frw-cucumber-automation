package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RegistrePage {
	
	private ConfigFileReader configfilereader; 

	/*@FindBy*/
	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'REGISTER')]")
	public static WebElement lien;
	
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstname;
	
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@name, 'phone')]")
	public static WebElement phone;
	
	@FindBy(how = How.ID, using = "userName")
	public static WebElement userName;
	
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address1;
	
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	
	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;
	
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	
	@FindBy(how = How.ID, using = "email")
	public static WebElement email;
	
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;

	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnsoumettre;
	
	@FindBy(how = How.XPATH, using = "//b[contains(text(),'Note: Your user name is')]")
	public static WebElement message;
	
	
	//creation  constructor
	public RegistrePage() {
		PageFactory.initElements(Setup.driver,this);
		this.configfilereader = new ConfigFileReader();
	}
		
	public void goToUrl() {
			Setup.getDriver().get(configfilereader.getProperties("home.url"));
		}
	public void clickOnRegistreButton() {
		lien.click();
		}

	
	public void fillFirstName(String name) {
		firstname.sendKeys(name);
		}
	
	public void fillLastName(String lastname) {
		lastName.sendKeys(lastname);
		}
	
	public void fillPhone(String phonetel) {
		phone.sendKeys(phonetel);
		}
	public void fillEmail(String Email) {
		email.sendKeys(Email);
		}

	
	
	public void fillAddress1(String address) {
		address1.sendKeys(address);
		}
	
	public void fillCity(String City) {
		city.sendKeys(City);
		}
	
	public void fillState(String State) {
		state.sendKeys(State);
		}
	
	public void fillPostalCode(String PostalCode) {
		postalCode.sendKeys(PostalCode);
		}
	
	public void fillCountry(String Country) {
		country.sendKeys(Country);
		//Select countryDropDown = new Select(country);
		//countryDropDown.selectByVisibleText(Country);	
		}
	
	public void fillUserName(String UserName) {
		userName.sendKeys(UserName);
		}
	
	public void fillPassword(String mot) {
		password.sendKeys(mot);
		}
	public void fillConfirmPassword(String ConfirmPassword) {
		confirmPassword.sendKeys(ConfirmPassword);
		}
		
	public void ClickOnBbtnSubmit() {
			btnsoumettre.click();
		}
	
}