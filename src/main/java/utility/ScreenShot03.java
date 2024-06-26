package utility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import base.TestBase;


public class ScreenShot03 extends TestBase {
		public static String getDate()
		{
			return new SimpleDateFormat("dd-mm-YYYY ss-mm-HH").format(new Date());
		}
		
		public static void Screenshot(String nameOfMethod) throws IOException
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("F:\\Software sql\\Amazon\\Screenshot03"+nameOfMethod+"--"+getDate()+".jpeg");
			FileHandler.copy(src, dest);
		}
}
