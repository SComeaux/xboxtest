package xbox.basepages;

import java.util.*;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import util.FunctionUtil;
import util.Page;
import util.SystemUtil;
import util.TestCaseBase;
import util.Waiting;

public class XboxLeaderboardPage extends Page {

	public static String TITLE = "Xbox Leaderboards - Xbox Gamertag";
	
	//You'll need to iterate over the next 4 scores to get each value from the path
		@FindBy(xpath = "p[class=display-4]")
		public WebElement gamerscore;

		
		/* @FindBy(xpath = "") public WebElement gamerTag; */
		 
		//Get each GamerTag (I'd loop if we used a driver...)
		@FindBy(xpath = "a[href='/search/fumingpuma5803']")
		public WebElement firstPlaceGamerTag;

		@FindBy(xpath = "a[href='/search/Chrissie']")
		public WebElement secondPlaceGamerTag;

		@FindBy(xpath = "a[href='/search/WNA3T']")
		public WebElement thirdPlaceGamerTag;

		@FindBy(xpath = "a[href='/search/Senjuu-x']")
		public WebElement fourthPlaceGamerTag;

		@FindBy(xpath = "a[href='/search/SpriTe-light']")
		public WebElement fifthPlaceGamerTag;
		
		///html/body/div[1]/div
		@FindBy(xpath = "//*[contains(@class,'row')]")
		List<WebElement> allElements;
		
		public XboxLeaderboardPage open() {
			//get url from properties file
			Properties PROPERTIES_RESOURCES = SystemUtil
					.loadPropertiesResources("/testdata_xbox.properties");
			String URL = PROPERTIES_RESOURCES.getProperty("leaderboard.url");
			TestCaseBase.threadDriver.get().navigate().to(URL);
			return this;
		}
		
		public XboxLeaderboardPage waitPage() throws InterruptedException {
			Thread.sleep(2000);
			Waiting.implicitly(2);
			return this;
		}
}
