package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_Register_02_Test extends BaseClass {
	@Test
	public void Register_using_credentials() {
		registerpage.getRegistrationlink().click();
		logger.log(Status.INFO,"User click on Register Link");
		registerpage.getFirstNameTF().sendKeys("Chakri");
		logger.log(Status.INFO,"User Entered First Name");
		registerpage.getLastNameTF().sendKeys("AswathaNarayana");
		logger.log(Status.INFO,"User Entered Last Name");
		registerpage.getEmailTF().sendKeys("kadivya333@gmail.com");
		logger.log(Status.INFO,"User Entered email address");
		registerpage.getPasswordTF().sendKeys("1234567");
		logger.log(Status.INFO,"User Entered Password");
		registerpage.getConfirmPasswordTF().sendKeys("1234567");
		logger.log(Status.INFO,"User Confirmed Password");
		registerpage.getRegisterButton().click();
		
		
		
}}