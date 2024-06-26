package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AmazonPage;
import utility.ScreenShot03;

public class AmazonPage_test extends TestBase{
		AmazonPage amazon;
		@BeforeMethod
		public void setUp() throws IOException
		{
			initialization();
			amazon=new AmazonPage();
		}
		
		@Test
		public void verifyAmazonNextPage() throws IOException
		{
			//String expUrl="https://www.amazon.in/s?k=Ashirvad&i=alexa-skills&crid=1B6YM9ZYI6RDL&sprefix=ashirvad%2Calexa-skills%2C344&ref=nb_sb_noss_2";
			//String actUrl = amazon.nextPageOfAmazon();
			//Assert.assertEquals(expUrl, actUrl);
			//Reporter.log("URL:" +actUrl);
			amazon.nextPageOfAmazon();
		}
		
		@AfterMethod
		public void close(ITestResult it) throws IOException
		{
			if(it.FAILURE==it.getStatus())
			{
				ScreenShot03.Screenshot(it.getName());
			}
			driver.close();
		}
		
	

}
