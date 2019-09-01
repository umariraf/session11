package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import page.DashboardPage;

public class DashboardSteps {
	WebDriver driver;
	DashboardPage dashboardPage;

	@Before
	public void beforeRun() {
		// driver = BrowserFactory.startBrowser();
		dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
	}

//	@Then("^Dashboard page should display$")
//	public void dashboard_page_should_display() {
//
//		dashboardPage.waitForPage();
//	}
}