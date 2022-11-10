package varificationPKG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePKG.MainClass;

public class NopcommerceLogin extends MainClass {

	
	public NopcommerceLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//img[@alt=\"logo.png\"])[2]")
	WebElement pageLogo;
	
	public void varifiedPageLogo() {
		Assert.assertTrue(pageLogo.isDisplayed());	
	}
	//or
	@FindBy(xpath = "(//img[@alt=\"logo.png\"])[2]")
	WebElement pageLogo1;
	
	public boolean varifiedPageLogo1() {
		return pageLogo.isDisplayed();	
	}
	
}
