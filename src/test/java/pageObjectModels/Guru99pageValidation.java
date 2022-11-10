package pageObjectModels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePKG.MainClass;

public class Guru99pageValidation extends MainClass {

	public Guru99pageValidation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//table[@width=\"492\"]/*/*/*/*)[1]")
	WebElement loginMssg;
	
	@FindBy(xpath = "//span['Enter your userName and password correct']")
			
	WebElement negativeMssg;
	
	public void positiveMsg(String expecteMsg) {
		String actualMsg = loginMssg.getText();
		Assert.assertEquals(actualMsg, expecteMsg);
		System.out.println("****Positive Massage:--> "+actualMsg);
		
	}
	
	public void negativemssg(String expectedMsg) {
		String actualMasg = negativeMssg.getText();
		Assert.assertEquals(actualMasg, expectedMsg);
		System.out.println("****Negative Massage:--> "+actualMasg);
	}
}
