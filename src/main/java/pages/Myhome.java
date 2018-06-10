package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class Myhome extends ProjectMethods{

	public Myhome() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;

	@And("Click on Leads tab")
	public  MyLeads clickLeads() {
		click(eleLeads);
		return new MyLeads();
		}
}