package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.DashboardPage;
import page.LoginPage;
import util.Assertion;
import util.BrowserFactory;

public class LoginSteps extends TestBase {
	WebDriver driver;
	LoginPage loginPage;
	DashboardPage dashboardPage;

	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

	@Given("^a valid user$")
	public void a_valid_user() {

	}

	@When("^user goes to the site$")
	public void user_goes_to_the_site() {

	}

	@Then("^login page should display$")
	public void login_page_should_display() {
		String expectedTitle = "Login - TechFios Test Application - Billing";
		Assertion.equals("Wrong page displayed!", expectedTitle, loginPage.getPageTitle());
	}

	// (.*)
	@When("^user enters valid user name \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enters_valid_user_name_and_password(String username, String password) throws Exception {
		loginPage.login(username, password);
		screenShot(driver, "c:\\ScreenShotFile\\DashbaordPage.jpg");
	}
	
	@Then("^Dashboard page should display$")
	public void dashboard_page_should_display() {
		dashboardPage.waitForPage();
	}
	
	@Then("^Dashboard page should not display$")
	public void dashboard_page_should_not_display()  {
	    Assert.assertFalse("Invalid customer was able to login!", dashboardPage.isDashboardDisplayed());
	}
	
	@After
	public void afterRun() {
		loginPage.close();
	}
}







