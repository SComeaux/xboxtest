package xbox.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import util.TestCaseBase;
import xbox.basepages.XboxHomePage;
import xbox.basepages.XboxLeaderboardPage;

public class ValidateTop5GamerTags extends TestCaseBase {
	
	@Test(groups = {"ChromeWin32", "IEWin32"})
	public void openLeaderboardPage_ValidateTop5() throws InterruptedException {
		XboxLeaderboardPage leaderboard = new XboxLeaderboardPage();
		//CustomAssertion assertion = new CustomAssertion();
		leaderboard.open();
		leaderboard.waitPage();
		//Assert.assertTrue(leaderboard.titleIs(leaderboard.TITLE));
	}
}
