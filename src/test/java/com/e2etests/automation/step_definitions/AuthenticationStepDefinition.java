package com.e2etests.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2etests.automation.page_objects.AuthenticationPage;
import com.e2etests.automation.utils.Setup;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {
	
	private AuthenticationPage authenticationPage;

	//creation constructor
	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();
	}
	
	
	@Given("Je me connecte sur la application Mercury")
	public void jeMeConnecteSurLaApplicationMercury() {
		authenticationPage.goToUrl();
	}
	
	@When("Je saisie le username {string}")
	public void jeSaisieLeUsername(String name) {
		authenticationPage.fillUserName(name);
	}
	@When("Je saisie le password  {string}")
	public void jeSaisieLePassword(String pass) {
		authenticationPage.fillPassword(pass);
	   
	}
	@When("Je clique sur le bouton submit")
	public void jeCliqueSurLeBoutonSubmit() {
		authenticationPage.ClickOnBbtnSubmit();
	}
	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String texte) {
		String message = AuthenticationPage.welcomemessage.getText();
		Assert.assertEquals(message, texte);
	}






}
