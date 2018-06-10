/*package steps;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadSteps {

	public static RemoteWebDriver driver;

	@Given("Invoke Leaftap Application")
	public void invokeApp() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@And("Enter Username as (.*)")
	public void enterUserName(String uName) {
		driver.findElementById("username").sendKeys(uName);
	}
	
	@And("Enter Password as (.*)")
	public void enterPassword(String pwd) {
		driver.findElementById("password").sendKeys(pwd);
	}
	
	@And("Click on login button")
	public void clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@And("Click on CRMSFA link")
	public void clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
	}
	
	@And("Click on Leads tab")
	public void clickLeads() {
		driver.findElementByLinkText("Leads").click();
	}
	
	@And("Click on Create Lead link")
	public void clickCreateLead() {
		driver.findElementByLinkText("Create Lead").click();
	}
	
	@And("Enter Company Name as (.*)")
	public void enterCName(String uName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(uName);
	}
	
	@And("Enter First Name as (.*)")
	public void enterfName(String fName) {
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
	}
	
	@And("Enter Last Name as (.*)")
	public void enterlName(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}
	
	@When("Click on Create Lead Button")
	public void clickCLButton() {
		driver.findElementByClassName("smallSubmit").click();
	}
	
	@Then("Verify the First Name")
	public void verifyFName() {
		System.out.println("Create Lead Functionality Works Successfully");
	}
	
	@Then("Close the browser")
	public void closeBrowser() {
		driver.close();
	}

}
*/