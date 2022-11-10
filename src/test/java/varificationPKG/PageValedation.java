package varificationPKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePKG.MainClass;

public class PageValedation extends MainClass {

	public PageValedation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "[alt=\"client brand banner\"]")
	WebElement PageLogo;
	
	@FindBy(css = "[alt=\"company-branding\"]")
	WebElement LogoutPagelogo;
	
	@FindBy(css = "[class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")
	WebElement invalidcredentials;
	public WebElement Invalidcredentials() {
		return invalidcredentials;
		}
	
	
	public void loginVaryfied() {
		Assert.assertTrue(PageLogo.isDisplayed());
	}
	public void logoutVeryfied() {
		Assert.assertTrue(LogoutPagelogo.isDisplayed());
	}
	public void varifiedHomePahe (){

	}
	public void invalidMassage(String expecteddMassage) {
		  String actualMssg = driver.findElement
	(By.cssSelector("[class=\"oxd-text oxd-text--p oxd-alert-content-text\"]")).getText();
		  Assert.assertEquals(actualMssg, expecteddMassage);
		  System.out.println("***Text Massage***: "+actualMssg );
	}
}
