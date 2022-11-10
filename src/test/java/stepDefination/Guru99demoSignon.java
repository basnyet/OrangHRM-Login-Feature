package stepDefination;

import basePKG.MainClass;
import io.cucumber.java.en.*;
import pageObjectModels.Guru99DemmoPage;
import pageObjectModels.Guru99pageValidation;

public class Guru99demoSignon extends MainClass {
	Guru99DemmoPage guru;
	Guru99pageValidation vlidation;
	
	@Given("user is in home page")
	public void user_is_in_home_page() {
		guru99URL();
	}
	@When("user click Signon button to Sigon")
	public void user_click_signon_button_to_sigon() {
		guru = new Guru99DemmoPage();
	  guru.click_SignOn();
	}

	@When("user type to different {string} and {string} for sign in")
	public void user_type_to_different_and_for_sign_in(String userName, String password) {	
		guru.type_UserName(userName);
		guru.type_Password(password);
	}

	@When("user click submit button")
	public void user_click_submit_button() {
	   guru.click_Submit();
	}

	@Then("user should see positive massage as {string}")
	public void user_should_see_positive_massage_as(String expecteMsg) {
		vlidation = new Guru99pageValidation();
		vlidation.positiveMsg(expecteMsg);
	}

	@Then("user should see negative massage as {string}")
	public void user_should_see_negative_massage_as(String expectedMsg) {

//		vlidation.negativemssg(expectedMsg);
		
	}

	@Then("user click sign off button to logout the page")
	public void user_click_sign_off_button_to_logout_the_page() {
	 guru.click_Sign_Off();
	}
}
