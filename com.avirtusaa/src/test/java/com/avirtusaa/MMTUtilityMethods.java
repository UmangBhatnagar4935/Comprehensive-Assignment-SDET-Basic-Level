

//		author                                    Umang Bhatnagar     @umangbhatnagar@virtusa.com
//		*************************************     Here the whole script is written keeping MACOS		    *************************************
//		*************************************	  in mind. "MMTUtilityMethods" class has been written	    *************************************			
//		*************************************	  for the low level implementation by segregating into 	    *************************************
//		*************************************	  different methods. These methods are later called   	    *************************************
//		*************************************	  as in need in class "MMTChromeAndFireFox"	to come		    *************************************
//		*************************************	  up with a meaningful script as asked for.					*************************************


package com.avirtusaa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MMTUtilityMethods {
	
	
	private WebDriver driver;
	private WebDriverWait webDriverWait1;
	
	public MMTUtilityMethods(String browserType, long timeForElementDiscovery)
	{
		
		
		if(browserType.toLowerCase().equals("firefox") )
		{
			System.out.println(System.getProperty("user.dir")+"/drivers/geckodriver");
			String path1 = System.getProperty("user.dir");
			System.out.println("#########");
			System.out.println(path1);
			System.setProperty("webdriver.gecko.driver", path1+"/drivers/geckodriver");
			this.driver = new FirefoxDriver();
			webDriverWait1 = new WebDriverWait(driver, Duration.ofMillis(timeForElementDiscovery));
		}
		
		else if (browserType.toLowerCase().equals("chrome") )
		{
			System.out.println(System.getProperty("user.dir")+"/drivers/chromedriver_mac64");
			String path1 = System.getProperty("user.dir");
			
			System.setProperty("webdriver.chrome.driver", path1+"/drivers/chromedriver-mac-x64/chromedriver");
			
			this.driver = new ChromeDriver();
			webDriverWait1 = new WebDriverWait(driver, Duration.ofMillis(timeForElementDiscovery));
		}
		
	}
	
	public void maximizeBrowser()
	{
		driver.manage().window().maximize();
		
	}
	
	
	public void visitPage(String urlReceived)
	{
		driver.get("https://www.makemytrip.com");
	}
	
	
	public WebElement elementGrabber(String xpathReceived)
	{
		WebElement webelement1 = driver.findElement(By.xpath(xpathReceived));
		return webelement1;
	}
	
	
	
	public void typeStringValues(WebElement elementReceived, String messageStringReceived)
	{
		elementReceived.sendKeys(messageStringReceived);
	}
	
	
	public void waitForAnElement(WebElement waitForElementReceived)
	{
	
		webDriverWait1.until(ExpectedConditions.visibilityOf(waitForElementReceived));
		
	}
	
	public void waitForAnElementTextDiscovery(WebElement waitForElementReceived, String stringToFindReceived)
	{
		
		webDriverWait1.until(ExpectedConditions.textToBePresentInElement(waitForElementReceived, stringToFindReceived));
		
	}
	
	
	public void clickTheElement(WebElement elementToBeClickedReceived)
	{
		elementToBeClickedReceived.click();
		
	}
	
	
	public void escapeFocus()
	{
		Actions actions1 = new Actions(driver);
		actions1.sendKeys(Keys.ESCAPE).perform();
	}
	
	
	
	public void terminateBrowser()
	{
		driver.quit();
	}

}
