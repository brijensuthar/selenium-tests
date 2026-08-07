package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Base.Base;
import Page.ButtonPage;
import Page.CheckBoxPage;
import Page.ElementPage;
import Page.LinkPage;
import Page.RadioButtonPage;
import Page.TablePage;
import Page.TextBoxPage;

public class BaseTest extends Base {

	protected ElementPage elementPage;
	protected ButtonPage buttonPage;
	protected CheckBoxPage checkBoxPage;
	protected LinkPage linkPage;
	protected RadioButtonPage radioButtonPage;
	protected TablePage talblePage;
	protected TextBoxPage textBoxPage;

	@BeforeMethod
	public void setup() {

		openBrowser();
		elementPage = new ElementPage(driver);
		buttonPage = new ButtonPage(driver);
		checkBoxPage = new CheckBoxPage(driver);
		linkPage = new LinkPage(driver);
		radioButtonPage = new RadioButtonPage(driver);
		talblePage = new TablePage(driver);
		textBoxPage = new TextBoxPage(driver);
	}

	@AfterMethod
	public void tearDown() {

		closeBrowser();
	}

}