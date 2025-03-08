package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPages;
import utils.BaseClass;

public class LoginSteps extends BaseClass {

	LoginPages pom = new LoginPages();
	
	@Given("User launches the browser")
	public void user_launches_the_browser() {
		browser();
		max();
		implicitywait();
	}

	@When("User navigates to url {string}")
	public void user_navigates_to_url(String url) {

		url(url);
		implicitywait();
	}

	@Then("Verify that home page is visible successfully")
	public boolean verify_that_home_page_is_visible_successfully() {

		try {
			boolean isvisible = (driver.findElement(pom.hompage).isDisplayed());

			if (isvisible) {

				System.out.println("Home page is visible successfully");
				shot1(isvisible);
				Thread.sleep(3000);

				return isvisible;
			}

		} catch (Exception e) {

			System.out.println("Home page is not visible");
		}
		return false;
	}

	@When("User clicks on Signup Login button")
	public void user_clicks_on_signup_login_button() {

		driver.findElement(pom.btnlogin).click();
		implicitywait();
	}

	@Then("Verify Login to your account is visible")
	public boolean verify_New_User_Signup_is_visible() {

		try {
			boolean isvisible = (driver.findElement(pom.txtsign).isDisplayed());

			if (isvisible) {
				System.out.println("New User Signup is visible");

				shot1(isvisible);
				Thread.sleep(3000);
				return isvisible;
			}
		} catch (Exception e) {

			System.out.println("New User Signup is not visible");

		}
		return false;

	}

	@When("User enters name {string} and email {string}")
	public void user_enters_name_and_email(String name, String email) {

		driver.findElement(pom.txtname).sendKeys(name);
		driver.findElement(pom.txtemail).sendKeys(email);
	}

	@When("User clicks on Signup button")
	public void user_clicks_on_Signup_button() {

		driver.findElement(pom.btnsubmit).click();
	}

	@Then("Verify that ENTER ACCOUNT INFORMATION is visible")
	public boolean verify_that_enter_account_information_is_visible() {

		try {
			boolean isvisible = driver.findElement(pom.txtaccount).isDisplayed();

			if (isvisible) {
				System.out.println("Verify that ENTER ACCOUNT INFORMATION is visible");
				shot1(isvisible);
				Thread.sleep(4000);
			}

		} catch (Exception e) {

			System.out.println("Verify that ENTER ACCOUNT INFORMATION is not visible");
		}
		return false;
	}

	@Then("Fill details Title {string} Password {string} Day {string} month {string} year{string}")
	public void fill_details_title_password_day_month_year(String title, String password, String Day, String Month,
			String Year) {

		WebElement Title = driver.findElement(By.xpath("//input[@value='" + title + "']"));
		Title.click();

		WebElement pass = driver.findElement(pom.txtpassword);
		pass.sendKeys(password);

		WebElement day = driver.findElement(pom.txtday);
		day.sendKeys(Day);

		WebElement month = driver.findElement(pom.txtmonth);
		month.sendKeys(Month);

		WebElement year = driver.findElement(pom.txtyear);
		year.sendKeys(Year);
		implicitywait();

	}

	@Then("User select Sign up for our newsletter checkbox")
	public void user_select_sign_up_for_our_newsletter_checkbox() {

		driver.findElement(pom.newsletter).click();
	}

	@Then("User select Receive special offers from our partners checkbox")
	public void user_select_receive_special_offers_from_our_partners_checkbox() {

		driver.findElement(pom.offers).click();
		implicitywait();
	}

	@Then("user fill personal details First name {string} Last name {string} Company {string} Address {string} Country {string} State {string} City {string} Zipcode {string} Mobile Number {string}")
	public void user_fill_personal_details(String FirstName, String LastName, String Company, String Address,
			String Country, String State, String City, String Zipcode, String MobileNumber) {

		driver.findElement(pom.firstname).sendKeys(FirstName);
		driver.findElement(pom.lastname).sendKeys(LastName);
		driver.findElement(pom.company).sendKeys(Company);
		driver.findElement(pom.address).sendKeys(Address);
		driver.findElement(pom.country).sendKeys(Country);
		driver.findElement(pom.state).sendKeys(State);
		driver.findElement(pom.city).sendKeys(City);
		driver.findElement(pom.zipcode).sendKeys(Zipcode);
		driver.findElement(pom.mobilenumber).sendKeys(MobileNumber);
		implicitywait();

	}

	@Then("Click on Create Account button")
	public void click_on_create_account_button() {

		driver.findElement(pom.createaccount).click();
		implicitywait();
	}

	@Then("Verify that ACCOUNT CREATED is visible")
	public void verify_that_account_created_is_visible() {

		try {

			WebElement verify = driver.findElement(pom.verifyaccount);
			verify.isDisplayed();

			System.out.println("Congratulations! Your new account has been successfully created!");
			shot("verifyaccount");

		} catch (Exception e) {
			System.out.println("Sorry! Your new account has not been created!");
		}

	}

	@Then("Click on Continue button")
	public void click_on_continue_button() {

		driver.findElement(pom.continueaccount).click();
	}

	@Then("Verify that Logged in as {string} is visible")
	public void verify_that_is_visible(String username) throws IOException {

		driver.findElement(pom.loginas).isDisplayed();

		System.out.println("Logged in as " + username + " is visible");
		shot("login");
	}

	@Then("Click on Delete Account button")
	public void click_on_delete_account_button() {

		driver.findElement(pom.delete).click();
	}

	@Then("Verify that ACCOUNT DELETED is visible and click Continue button")
	public void verify_that_account_deleted_is_visible_and_click_continue_button() {

		try {

			WebElement account_deleted = driver.findElement(pom.verifydelete);
			account_deleted.isDisplayed();

			System.out.println("Your account has been permanently deleted!");
			shot("accountdeleted");
		} catch (Exception e) {

			System.out.println("Your account has not deleted!");
		}
		driver.findElement(pom.continueaccount).click();

	}

}
