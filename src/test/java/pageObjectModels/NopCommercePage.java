package pageObjectModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePKG.MainClass;

public class NopCommercePage extends MainClass {

	public NopCommercePage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	WebElement typeUN;
	
	@FindBy(id = "Password")
	WebElement typePW;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement clickLogin;
	
	@FindBy(xpath = "//a[@href=\"/logout\"]")
	WebElement logOut;
	
	public void userName(String userName) {
		typeUN.clear();
		typeUN.sendKeys(userName);
	}
	public void password(String password) {
		typePW.clear();
		typePW.sendKeys(password);
	}
	public void login() {
		clickLogin.click();
	}
	public void logout() {
		logOut.click();
	}
	
}

