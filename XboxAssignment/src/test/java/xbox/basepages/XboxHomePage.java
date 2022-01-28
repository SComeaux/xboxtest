package xbox.basepages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;

public class XboxHomePage extends Page {
	
	public static String TITLE = "Xbox Gamertag";
	
		//elements
		@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
		public WebElement home;
		
		@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")
		public WebElement xboxClips;
		
		@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a")
		public WebElement gamercards;
		
		@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/a")
		public WebElement gamertagGenerator;
		
		@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]")
		public WebElement leaderboards;
		
		
	
	public XboxHomePage open() {
		//get url from properties file
		Properties PROPERTIES_RESOURCES = SystemUtil
				.loadPropertiesResources("/testdata_xbox.properties");
		String URL = PROPERTIES_RESOURCES.getProperty("home.url");
		TestCaseBase.threadDriver.get().navigate().to(URL);
		return this;
	}
	
	public XboxHomePage waitPage() throws InterruptedException {
		Thread.sleep(2000);
		Waiting.implicitly(2);
		return this;
	}
	
}
