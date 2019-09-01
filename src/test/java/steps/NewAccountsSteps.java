package steps;

import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.ListAccountPage;
import page.LoginPage;
import page.NewAccountPage;
import page.SideNavigation;
import util.Assertion;
import util.BrowserFactory;

public class NewAccountsSteps extends TestBase {
	WebDriver driver;
	String modifiedTitle;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	NewAccountPage newAccountsPage;
	SideNavigation sideNavigation;
	ListAccountPage listAccountPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		newAccountsPage = PageFactory.initElements(driver, NewAccountPage.class);
		sideNavigation = PageFactory.initElements(driver, SideNavigation.class);
		listAccountPage = PageFactory.initElements(driver, ListAccountPage.class);
	}

	@Given("^a user already logged in as \"([^\"]*)\" and \"([^\"]*)\"$")
	public void a_user_already_logged_in_as_and(String username, String password) throws Exception {
		String expectedTitle = "Login - TechFios Test Application - Billing";
		Assertion.equals("Wrong page displayed!", expectedTitle, loginPage.getPageTitle());
		loginPage.login(username, password);
		screenShot(driver, "c:\\ScreenShotFile\\DashbaordPage.jpg");
		dashboardPage.waitForPage();
	}

	@When("^user navigate to Bank Cash -> New Account Page$")
	public void user_navigate_to_Bank_Cash_New_Account_Page() throws InterruptedException {
		sideNavigation.goToNewAccountPage();
	}

	@Then("^New Accounts Page should display$")
	public void new_Accounts_Page_should_display() throws Exception {
		screenShot(driver, "c:\\ScreenShotFile\\NewAccontsPage.jpg");
		newAccountsPage.waitForPage();
	}

	@When("^user submits \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_submits_and(String title, String description, String balance) throws InterruptedException {
		Random rnd = new Random();
		modifiedTitle = title + rnd.nextInt(999);
		newAccountsPage.fillInTheNewAccountForm(modifiedTitle, description, balance);
	}

	@Then("^created account should be posted$")
	public void account_created_successfully_message_should_display() throws Exception {
		sideNavigation.goToListAccountPage();
		boolean status = isDataFoundInList(listAccountPage.getColumnDataFor("Account"), modifiedTitle);
		System.out.println("Created account name: " + modifiedTitle);
		screenShot(driver, "c:\\ScreenShotFile\\ListAccountPage.jpg");
		Assert.assertTrue(modifiedTitle + " account did not post!", status);
	}

	public boolean isDataFoundInList(List<String> dataList, String title) {
		for (int i = 0; i < dataList.size(); i++) {
			if (dataList.get(i).equalsIgnoreCase(title)) {
				return true;
			}
		}
		return false;
	}

	@After
	public void afterRun() {
		loginPage.close();
	}
}
