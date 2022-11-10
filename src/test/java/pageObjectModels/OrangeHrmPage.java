package pageObjectModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePKG.MainClass;

public class OrangeHrmPage extends MainClass {


	public OrangeHrmPage () {

		PageFactory.initElements(driver, this);
	}
	@FindBy(name = "username")
	WebElement User_Name;
	
	@FindBy(name = "password")
	WebElement Enter_Password;
	
	@FindBy(css = "[type=\"submit\"]")
	WebElement Login;
	
	@FindBy(css = "[class=\"oxd-userdropdown-name\"]")
	WebElement AdminName;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logout;
	

	
	public void userName(String UserName) {
		User_Name.sendKeys(UserName);
	}
	public void password(String Password) {
		Enter_Password.sendKeys(Password);
	}
	public void clickLogout() {
		
		Logout.click();
	}
	public void clickAdminName() {
		AdminName.click();
	}
	public void clickLogin() {
		Login.click();
		
	}


}
