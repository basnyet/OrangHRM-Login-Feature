package pageObjectModels;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import basePKG.MainClass;

public class Guru99DemmoPage extends MainClass {

	public Guru99DemmoPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='SIGN-ON']")
	WebElement Sign_On;
	
	@FindBy(name = "userName")
	WebElement UserName;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(name = "submit")
	WebElement Submit;
	
	@FindBy(xpath = "//a[text()='SIGN-OFF']")
	WebElement Sign_Off;
	
	@FindBy(xpath = "(//table[@width=\"492\"]/*/*/*/*)[1]")
	WebElement loginMssg;
	
//	@FindBy(xpath = "//img[@width=\"492\"]")
	@FindBy(css = "Enter your userName and password correct\r\n"
			+ "            ")
	WebElement negativeMssg;
	
	public void success_Massage(String psostvExpectedMassage, String ngtvExpectMassage) {
	try {	
		String actualPostvmssg = loginMssg.getText();
		String actualNgtvmsag = negativeMssg.getText();
		Assert.assertEquals(actualPostvmssg,psostvExpectedMassage);
		Assert.assertEquals(actualNgtvmsag,ngtvExpectMassage);
		System.out.println("Expected Possitive Massage: "+actualPostvmssg);
		System.out.println("Expected Negative Massage: "+actualNgtvmsag);
//		if(actualPostvmssg.equals(psostvExpectedMassage)) {
//			Assert.assertEquals(actualPostvmssg,psostvExpectedMassage);
//			System.out.println("****This scenario is a posative Massage***");
//		}else if(actualNgtvmsag.equals(ngtvExpectMassage)) {
//			Assert.assertEquals(actualNgtvmsag,ngtvExpectMassage);
//			System.out.println("****This scenario a negative Massage******");
//		}else {
//			System.out.println("****Here is something went wrong******");
//		}
	}catch(Exception e) {
		System.out.println("***Chck it out Assortion, is not playing Roll****");
	}
		
		}
	
	public void click_SignOn() {
		Sign_On.click();
	}
	
	public void type_UserName(String userName) {
		UserName.sendKeys(userName);
	}
	
	public void type_Password(String password) {
		Password.sendKeys(password);
	}
	
	public void click_Submit() {
		Submit.click();
	}
	
	public void click_Sign_Off() {
		Sign_Off.click();
	}
}
