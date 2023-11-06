package login;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseClass;
import genericUtilities.ITestListenerUtility;
@Listeners(ITestListenerUtility.class)
public class DWS_Booktocart_04_Test extends BaseClass {
	@Test
	public void add_Book_to_remove() {
		
		bookpage.getBook().click();
		logger.log(Status.INFO,"User click on book link");
		bookpage.getFicbook().click();
		bookpage.getFiccart();
	}

}
