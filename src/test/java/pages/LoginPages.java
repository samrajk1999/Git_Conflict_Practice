package pages;

import org.openqa.selenium.By;

import utils.BaseClass;

public class LoginPages extends BaseClass{

	//testcase1
			public By hompage = By.xpath("//i[contains(@class, 'fa fa-home')]");
			public By btnlogin = By.xpath("//a[@href=\"/login\"]");
			public By txtsign = By.xpath("//h2[text()='New User Signup!']");
			public By txtname = By.xpath("//input[@placeholder=\"Name\"]");
			public By txtemail = By.xpath("(//form[@action=\"/signup\"])//input[@placeholder=\"Email Address\"]");
			public By btnsubmit = By.xpath("//button[@data-qa=\"signup-button\"]");
			public By txtaccount = By.xpath("//b[text()='Enter Account Information']");
			
			
			//Enter Account Information
			public By radiotitle = By.xpath("//input[@value=\"Mr\"]");
			public By txtpassword = By.id("password");
			public By txtday = By.id("days");
			public By txtmonth = By.id("months");
			public By txtyear = By.id("years");
			public By newsletter = By.id("newsletter");
			public By offers = By.id("optin");
			
			//Address Information
			public By firstname = By.id("first_name");
			public By lastname = By.id("last_name");
			public By company = By.id("company");
			public By address = By.id("address1");
			public By country = By.id("country");
			public By state = By.id("state");
			public By city = By.id("city");
			public By zipcode = By.id("zipcode");
			public By mobilenumber = By.id("mobile_number");
			public By createaccount = By.xpath("//button[@data-qa=\"create-account\"]");
			
				
			//verify account is created
			
			public By verifyaccount = By.xpath("//b[text()='Account Created!']");
			
			public By continueaccount = By.xpath("//a[.='Continue']");
			
			public By loginas = By.xpath("//a[text()=' Logged in as ']");
			
			
			//Delete account
			 public By delete = By.xpath("//a[@href=\"/delete_account\"]");
			 public By verifydelete = By.xpath("//b[.='Account Deleted!']");
		
}
