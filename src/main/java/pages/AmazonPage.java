package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import utility.HandleDropdown;
import utility.ReadData;

public class AmazonPage extends TestBase{
	@FindBy(xpath=("//input[@id='twotabsearchtextbox']")) private WebElement searchBox;
	@FindBy(xpath=("//select[@aria-describedby='searchDropdownDescription']")) private WebElement AllDropdown;
	@FindBy(xpath=("//input[@id='nav-search-submit-button']")) private WebElement searchclick;
	
	public AmazonPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String nextPageOfAmazon() throws IOException
	{	
		HandleDropdown.handleSelect(AllDropdown,"Alexa Skills");
		searchBox.sendKeys(ReadData.readExcelFile(0, 0));
		searchclick.click();
		return driver.getCurrentUrl();
	}
}
