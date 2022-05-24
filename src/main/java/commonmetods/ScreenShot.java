package commonmetods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot extends TestBase{
	
	
	public static void shot() throws IOException {
		
		
File screshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
FileUtils.copyFile(screshot,new File( "C:\\Users\\kiran\\eclipse-workspace\\9pmnew\\resources\\Screenshot\\error.png"));
	}

}
