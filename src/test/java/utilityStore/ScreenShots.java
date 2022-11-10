package utilityStore;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import basePKG.MainClass;

public class ScreenShots extends MainClass{
	
	public ScreenShots(WebDriver driver, String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file = ts.getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(file, new File("./ScreenShots/"+fileName+""));
	}

}
