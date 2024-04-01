package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.RegistrePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistreStepDefinition {

	private RegistrePage RegistrePage;
	
	//creation constructor
		public RegistreStepDefinition() {
			this.RegistrePage = new RegistrePage();
		}

	@Given("je suis sur la page de login")
	public void jeSuisSurLaPageDeInscription() {
	   
	}
	@When("je suis clique sur le navigation registre")
	public void jeCliqueSurLanavigationRegister(String firstname) {
		RegistrePage.fillFirstName(firstname);
	    
	}
	@When("Je saisie le first name {string}")
	public void jeSaisieLeFirstName(String firstname) {
		RegistrePage.fillFirstName(firstname);
	    
	}
	@When("Je saisie le last name {string}")
	public void jeSaisieLeLastName(String lastName) {
		RegistrePage.fillLastName(lastName);
	}
	@When("Je saisie le Phone {string}")
	public void jeSaisieLePhone(String phone) {
		RegistrePage.fillPhone(phone);
	}
	@When("Je saisie le Email {string}")
	public void jeSaisieLeEmail(String userName) {
		RegistrePage.fillUserName(userName);
	}
	@When("Je saisie le Address {string}")
	public void jeSaisieLeAddress(String address1) {
		RegistrePage.fillAddress1(address1);
	}
	@When("Je saisie le City {string}")
	public void jeSaisieLeCity(String city) {
		RegistrePage.fillCity(city);
	}
	@When("Je saisie le State {string}")
	public void jeSaisieLeState(String state) {
		RegistrePage.fillState(state);
	}
	@When("Je saisie le Code {string}")
	public void jeSaisieLeCode(String postalCode) {
		RegistrePage.fillPostalCode(postalCode);
	}
	@When("Je saisie le Country {string}")
	public void jeSaisieLeCountry(String country) {
		RegistrePage.fillCountry(country);
	}
	@When("Je saisie le Username {string}")
	public void jeSaisieLeUsername(String email) {
		RegistrePage.fillEmail(email);
	}
	@When("Je saisie le Password {string}")
	public void jeSaisieLePassword(String password) {
		RegistrePage.fillPassword(password);
	}
	@When("Je saisie le Confirmpasword {string}")
	public void jeSaisieLeConfirmpasword(String confirmPassword) {
		RegistrePage.fillConfirmPassword(confirmPassword);
	}
	@When("Je clique sur le bouton soumettre")
	public void jeCliqueSurLeBoutonSoumettre() {
		RegistrePage.ClickOnBbtnSubmit();
	}
	@Then("Je me redirige vers la page registre succes {string}")
	public void jeMeRedirigeVersLaPageRegistreSucces(String string) {
	//	String message = AuthenticationPage.welcomemessage.getText();
		//Assert.assertEquals(message, texte);
	}



}
