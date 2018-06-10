package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how = How.ID, using = "createLeadForm_companyName")
	private WebElement eleCName;
	@And("Enter Company Name as (.*)")
	public CreateLead enterCompnayName(String cName) {
		type(eleCName, cName);
		return this;
	}
	@FindBy(how = How.ID, using = "createLeadForm_firstName")
	private WebElement firstName;
	@And("Enter First Name as (.*)")
	public CreateLead enterFirstName(String fName) {
		type(firstName, fName);
		return this;
	}
	@FindBy(how = How.ID, using = "createLeadForm_lastName")
	private WebElement lastName;
	@And("Enter Last Name as (.*)")
	public CreateLead enterLastName(String lName) {
		type(lastName, lName);
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME, using = "smallSubmit")
	private WebElement eleCLClick;
	@When("Click on Create Lead Button")
	public ViewLead clickCreateLeadButton() {
		click(eleCLClick);
		return new ViewLead();
	}
	
	
	
	

}
