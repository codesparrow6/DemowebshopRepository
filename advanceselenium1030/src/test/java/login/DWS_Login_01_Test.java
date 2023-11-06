package login;

//import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;

@Listeners(ITestListenerUtility.class)

public class DWS_Login_01_Test extends BaseClass {
	@Test
	public void Login_to_application_with_valid_credentials() {
		Loginpage.getLoginlink().click();
		logger.log(Status.INFO,"User click on Login Link");
		Loginpage.getEmailTF().sendKeys("kadivya333@gmail.com");
		logger.log(Status.INFO,"User Entered email address");
		//assertTrue(true);
		Loginpage.getPasswordTF().sendKeys("1234567");
		logger.log(Status.INFO,"User Entered Password");
		Loginpage.getLoginButton().click();

	}


}
	









