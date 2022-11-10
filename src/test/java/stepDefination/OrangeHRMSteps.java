package stepDefination;


import basePKG.MainClass;
import io.cucumber.java.en.*;
import pageObjectModels.OrangeHrmPage;
import varificationPKG.PageValedation;


public class OrangeHRMSteps extends MainClass {


	OrangeHrmPage hrm;
	 PageValedation pv;

	@Given("user is in home page as")
	public void user_is_in_home_page_as() {
		orangeHRMurl();
		System.out.println("Page Title:--> "+driver.getTitle());
	}

	@When("user is enter {string} and {string}")
	public void user_is_enter_and(String UserName, String Password) throws InterruptedException {
		hrm = new OrangeHrmPage();
		hrm.userName(UserName);
		Thread.sleep(3000);
		hrm.password(Password);
	}

	@Then("user click login button")
	public void user_click_login_button() {
		hrm.clickLogin();
	}
	@Then("user able to login the page")
	public void user_able_to_login_the_page() {
		 pv = new PageValedation();
		pv.loginVaryfied();
		
	}

	@Then("user click admin name for logout page")
	public void user_click_admin_name_for_logout_page() {
	 hrm.clickAdminName();
	}

	@Then("user click logout botton")
	public void user_click_logout_botton() {
	  hrm.clickLogout();
	}

	@Then("user able to logout the page")
	public void user_able_to_logout_the_page() {
		pv.logoutVeryfied();
	}

	  @And("^user should see  massage \"([^\"]*)\"$")
	    public void user_should_see_massage_something(String expecteddMassage){
		  pv = new PageValedation();
		pv.invalidMassage(expecteddMassage);

	    }

}
