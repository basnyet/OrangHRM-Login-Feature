package basePKG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass {
	
	public static WebDriver driver;
	String browserName ="Chrome";
	
	public MainClass() {
		PageFactory.initElements(driver, this);
	}
	public void initilization() {
		if(browserName.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}	
		else if(browserName.equalsIgnoreCase("Edge")) {
		 WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("FireFox")) {
		 WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}
		else {
		System.out.println("This driver is not supported at the moment");
		
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}

	public void tearDown(){
		driver.close();
	}
	public void orangeHRMurl() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	public void guru99URL() {
		driver.get("https://demo.guru99.com/test/newtours/index.php");
	}
	public void nopCommerceURL() {
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}
			
}


