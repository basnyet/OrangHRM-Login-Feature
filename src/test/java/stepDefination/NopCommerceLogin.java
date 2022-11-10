package stepDefination;

import java.io.IOException;

import basePKG.MainClass;
import io.cucumber.java.en.*;
import pageObjectModels.NopCommercePage;
import utilityStore.ScreenShots;
import varificationPKG.NopcommerceLogin;

public class NopCommerceLogin extends MainClass {
	
	NopCommercePage npc;
	NopcommerceLogin vrif;
	ScreenShots shot;
	
	@Given("as a valid user is in a home page")
	public void as_a_valid_user_is_in_a_home_page() {

		nopCommerceURL();
	}
	@When("user type valid userName and password as <{string}> and <{string}>")
	public void user_type_valid_user_name_and_password_as_and(String userName, String password) throws InterruptedException {
		   npc = new NopCommercePage();
			  npc.userName(userName);
			  Thread.sleep(3000);
			  npc.password(password);
	}
	
	@Then("user clik login button")
	public void user_clik_login_button() {

		npc.login();

	}

	@Then("user able to enter the account")
	public void user_able_to_enter_the_account() throws IOException {
		vrif = new NopcommerceLogin();
		vrif.varifiedPageLogo();
		shot = new ScreenShots(driver, "img.png");
	
	}

	@Then("user click logout buttn to exit the page")
	public void user_click_logout_buttn_to_exit_the_page() {
		npc.logout();
	 
	}

}
