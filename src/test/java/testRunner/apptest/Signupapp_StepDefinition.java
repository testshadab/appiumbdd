package testRunner.apptest;
//import static io.appium.java_client.touch.offset.PointOption.point;

import java.util.Random;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import objectRepository.SignupObject;
import testRunner.SetupClass;
import webApp.PerformAction;
import webApp.Scrollscreen;

public class Signupapp_StepDefinition extends SetupClass {
	public static String Email_Address;
	PerformAction wait = new PerformAction();
	Random rad = new Random();
	String name = "" + rad.nextInt(1000) + "@gmail.com";
	public static String FN;
	public static String LN;

	@Given("^Tap on Next CTA$")
	public void launchapp() throws Throwable {
		try {
		WebDriverWait wait1 = new WebDriverWait(driver, 90);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(SignupObject.menu_more));
		
		WebElement menuop = new WebDriverWait(driver, 90)
				.until(ExpectedConditions.elementToBeClickable(SignupObject.menu_more));
		
	
		wait.implictywait(driver);
		menuop.click();
		Thread.sleep(1000);
		}catch(NoSuchElementException nm) {
			
		}
	}

	@Then("^Tap on Register option CTA\\.$")
	public void tap_on_Register_CTA() throws Throwable {
try {
		 MobileElement el2 = (MobileElement) driver.findElement(SignupObject.Register);
		 if(el2.isDisplayed()) {
			el2.click();
		Thread.sleep(1000);
	}
} catch(Exception e) {
			 
		 }
	}

	@Then("^Enter first Name \"([^\"]*)\" in first name text field\\.$")
	public void enter_first_Name_in_first_name_text_field(String Fn) throws Throwable {
		webelement = driver.findElement(SignupObject.FName);
		wait.implictywait(driver);
		webelement.click();
		wait.implictywait(driver);
		webelement.clear();
		wait.implictywait(driver);
		webelement.sendKeys(Fn);
		wait.implictywait(driver);
		wait.implictywait(driver);
	}

	@Then("^Enter last Name \"([^\"]*)\" in Last name text field\\.$")
	public void enter_last_Name_in_Last_name_text_field(String Ln) throws Throwable {
		webelement = driver.findElement(SignupObject.lastname);
		wait.implictywait(driver);
		webelement.click();
		wait.implictywait(driver);
		webelement.clear();
		wait.implictywait(driver);
		webelement.sendKeys(Ln);
		wait.implictywait(driver);
		 driver.hideKeyboard();
	}

//	@Then("^Select the Date Of Birth\\.$")
//	public void select_the_Date_Of_Birth() throws Throwable {
//		webelement = driver.findElement(SignupObject.Dateof_birth);
//		wait.implictywait(driver);
//		webelement.click();
//		Thread.sleep(500);
//
//		WebElement year = driver
//				.findElement(By.xpath("//android.widget.NumberPicker[@index='2']//android.widget.Button[@index=0]"));
//		wait.implictywait(driver);
//		year.click();
//		wait.implictywait(driver);
//		Scrollscreen.scroll();
//		driver.findElement(By.xpath("//[@text='1990']")).click();
//		wait.implictywait(driver);
//		WebElement done = driver.findElement(By.id("dpokbtn"));
//		wait.implictywait(driver);
//		done.click();
//		wait.implictywait(driver);
//	}

	@Then("^Enter email address \"([^\"]*)\" in Email address text field\\.$")
	public void enter_email_address_in_Email_address_text_field(String arg1) throws Throwable {
//		Scrollscreen.scroll();
		webelement = driver.findElement(SignupObject.Email);
		webelement.click();
		wait.implictywait(driver);
		webelement.clear();
		wait.implictywait(driver);
		webelement.sendKeys(arg1);
		wait.implictywait(driver);
		 driver.hideKeyboard();
	}

	@And("^Enter password \"([^\"]*)\"\\.$")
	public void enter_password(String arg1) throws Throwable {
		webelement = driver.findElement(SignupObject.password);
		webelement.click();
		wait.implictywait(driver);
		webelement.clear();
		wait.implictywait(driver);
		webelement.sendKeys(arg1);
		wait.implictywait(driver);
		 driver.hideKeyboard();
	}

	@Then("^Tap on Submit CTA\\.$")
	public void tap_on_Submit_CTA() throws Throwable {
		webelement = driver.findElement(SignupObject.Submit);
		webelement.click();
		wait.implictywait(driver);
		Thread.sleep(1000);
	}


	 @Then("^Verify \"([^\"]*)\" for validation message for First name field\\.$")
	 public void verify_for_validation_message_for_First_name_field(String FNval)
	 throws Throwable {
	 try {
	 String Fname = driver.findElement(SignupObject.FNVal).getText();
	 System.out.println(Fname);
	 String FNwhite = Fname.trim();
	 wait.implictywait(driver);
	 System.out.println(FNwhite);
	 Assert.assertEquals(FNval, FNwhite);
	 wait.implictywait(driver);
	 } catch (NoSuchElementException FNE) {
	
	 }
	 }
	
	 @Then("^Verify \"([^\"]*)\" for validation message for Last name field\\.$")
	 public void verify_for_validation_message_for_Last_name_field(String LNval)
	 throws Throwable {
	 try {
	 String Lname = driver.findElement(SignupObject.LNVal).getText();
	 wait.implictywait(driver);
	 String LNameVal = Lname.trim();
	 Assert.assertEquals(LNval, LNameVal);
	 wait.implictywait(driver);
	
	 } catch (NoSuchElementException LNex) {
	 }
	 }
	
	 @Then("^Verify \"([^\"]*)\" for message for email address field\\.$")
	 public void verify_for_validation_message_for_email_address_field(String
	 EmailVal) throws Throwable {
	 try {
	 String Email = driver.findElement(SignupObject.Email_AddressVal).getText();
	 wait.implictywait(driver);
	 String EmailNameval = Email.trim();
	 wait.implictywait(driver);
	 Assert.assertEquals(EmailVal, EmailNameval);
	 wait.implictywait(driver);
	
	 } catch (NoSuchElementException Emailex) {
	 }
	 }
	
	 @Then("^Verify \"([^\"]*)\" for validation message for password field\\.$")
	 public void verify_for_validation_message_for_password_field(String Pswdval)
	 throws Throwable {
	 try {
	 String passwordVal = driver.findElement(SignupObject.passwordVal).getText();
	 wait.implictywait(driver);
	 String pwdT = passwordVal.trim();
	 wait.implictywait(driver);
	 Assert.assertEquals(Pswdval, pwdT);
	 wait.implictywait(driver);
	
	 } catch (NoSuchElementException paswd) {
	 }
	 }
	
	 @Then("Verify \"([^\"]*)\" validation for all invalid credentials\\.")
	 public void then_for_for_For_validation_for_all_invalid_credentials(String
	 Error) throws Throwable {
	 try {
	 String ErrorVal =
	 driver.findElement(SignupObject.Signup_errormessage).getText();
	 wait.implictywait(driver);
	 String ErrorT = ErrorVal.trim();
	 wait.implictywait(driver);
	 Assert.assertEquals(Error, ErrorT);
	 wait.implictywait(driver);
	
	 } catch (NoSuchElementException ErrorExc) {
	 }
	 }
	
	 @Then("^Close the alert message\\.$")
	 public void close_in() throws Throwable {
	 try {
	 webelement = driver.findElement(SignupObject.ok);
	 wait.implictywait(driver);
	 webelement.click();
	 wait.implictywait(driver);
	 } catch (NoSuchElementException NSError) {
	
	 }
	 // TouchAction touchAction = new TouchAction(driver);
	 // touchAction.tap(new PointOption().withCoordinates(1280, 1013)).perform();
	
	 }
	
	 @Then("^Enter email address \"([^\"]*)\"\\.$")
	 public void random_email(String email) {
	 webelement = driver.findElement(SignupObject.Email);
	 webelement.click();
	 wait.implictywait(driver);
	 webelement.clear();
	 wait.implictywait(driver);
	 Email_Address = email + name;
	 webelement.sendKeys(Email_Address);
	 wait.implictywait(driver);
	 driver.hideKeyboard();
	 }
	
	 @Then("^Tap on Register button\\.$")
	 public void Tap_register_button() throws Throwable {
//	 Scrollscreen.scroll();
	 webelement = driver.findElement(SignupObject.Submit);
	 wait.implictywait(driver);
	 webelement.click();
	
	 }
	
	 @Then("^Tap on user profile\\.$")
	 public void Tap_profile_button() throws Throwable {
	 WebDriverWait Profile = new WebDriverWait(driver, 90);
	 Profile.until(ExpectedConditions.visibilityOfElementLocated(SignupObject.Profile));
	 webelement = driver.findElement(SignupObject.Profile);
	 wait.implictywait(driver);
	 webelement.click();
	 }
	
	 @Then("^Verify the User Name\\.$")
	 public void Tap_User_Name() throws Throwable {
	 WebDriverWait visible = new WebDriverWait(driver, 90);
	 visible.until(ExpectedConditions.visibilityOfElementLocated(SignupObject.ProfileName));
	 String actual = driver.findElement(SignupObject.ProfileName).getText();
	 wait.implictywait(driver);
	 String expected = FN + " " + LN;
	 wait.implictywait(driver);
	 Assert.assertEquals(expected, actual);
	 wait.implictywait(driver);
	
	 }

	 //Login the app

	 @Then("^Tap on login CTA\\.$")
	 public void tap_on_login_CTA() throws Throwable {
//			Scrollscreen.scroll();
			 wait.implictywait(driver);
//			Scrollscreen.scroll();
			 wait.implictywait(driver);
		Thread.sleep(1000);
			webelement = driver.findElement(SignupObject.login);
			webelement.click();
			wait.implictywait(driver);
	 }

	 @Then("^Enter useremail address \"([^\"]*)\"\\.$")
	 public void enter_useremail_address(String useremail) throws Throwable {
		 webelement = driver.findElement(SignupObject.USemail);
		 webelement.click();
		 wait.implictywait(driver);
		 webelement.clear();
		 wait.implictywait(driver);
		 webelement.sendKeys(useremail);
		 wait.implictywait(driver);
	
	 }

	 @Then("^Enter user password \"([^\"]*)\"\\.$")
	 public void enter_user_password(String userpass) throws Throwable {
		 webelement = driver.findElement(SignupObject.USpwd);
		 webelement.click();
		 wait.implictywait(driver);
		 webelement.clear();
		 wait.implictywait(driver);
		 webelement.sendKeys(userpass);
		 wait.implictywait(driver);
		 driver.hideKeyboard();
	 }

	 @Then("^Tap on Login button\\.$")
	 public void tap_on_Login_button() throws Throwable {
		 webelement = driver.findElement(SignupObject.logintap);
		 webelement.click();
		 wait.implictywait(driver); 
		 Thread.sleep(4000);
	 }


}