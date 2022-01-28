package xbox.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import util.TestCaseBase;
import xbox.basepages.XboxLeaderboardPage;

public class XboxLeaderboardVerify extends TestCaseBase {

	@Test(groups = {"ChromeWin32", "IEWin32"})
	public void open() throws InterruptedException {
		XboxLeaderboardPage leaderboard = new XboxLeaderboardPage();
		//CustomAssertion assertion = new CustomAssertion();
		leaderboard.open();
		leaderboard.waitPage();
		Assert.assertTrue(leaderboard.titleIs(leaderboard.TITLE));
	}
}
