package Test;

import org.testng.annotations.Test;

import base.BaseTest;

public class UploadDownloadTest extends BaseTest {

	@Test
	public void testUploadDownloadFile() throws InterruptedException {
		elementPage.clickOnElement();
		uploadDownload.uploadDownloadFile();
		Thread.sleep(5000);
	}

}
