package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CL extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="Tc - Create lead";
		testDescription="Creating a lead";
		testNodes="Leads";
		category="Smoke";
		authors="Gopi";
		browserName="chrome";
		dataSheetName="TC003";
	}
	@Test(dataProvider="fetchData")
	public void crate(String uName,String pwd, String cName, String fName, String lName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.ClickCreateLead()
		.enterCompnayName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton();
	}

}
