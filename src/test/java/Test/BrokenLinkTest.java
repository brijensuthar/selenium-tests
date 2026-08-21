package Test;

import org.testng.annotations.Test;
import base.BaseTest;

public class BrokenLinkTest extends BaseTest {

	@Test
	public void testBrokenLink() throws InterruptedException {
		elementPage.clickOnElement();
		brokenLinkManu.clickOnBrokenLinkManu();
		brokenLinkManu.clickOnBrokenLink();
		Thread.sleep(5000);
	}

}
