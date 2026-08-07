package Test;

import org.testng.annotations.Test;

import base.BaseTest;

public class TableTest extends BaseTest {

	@Test
	public void tableTest() throws InterruptedException {
		elementPage.clickOnElement();
		talblePage.testTable();
	}

}
