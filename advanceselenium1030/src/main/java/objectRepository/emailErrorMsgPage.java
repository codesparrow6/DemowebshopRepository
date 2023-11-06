package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class emailErrorMsgPage extends BaseClass {
	public emailErrorMsgPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText="Apparel & shoes")
	private WebElement ApparelShoeslink;
	@FindBy(xpath="//img[@alt=\"Picture of 50's Rockability polkaDot Jr Plus Size\"]")
	private WebElement PolkDotTop;
	@FindBy(xpath="//input[@value='Email a friend']")
	private WebElement enterFriendEmail;
	@FindBy(id="YourEmailAddress")
	private WebElement enteryourEmail;
	@FindBy(name="send-email")
	private WebElement sendEmailButton;
	@FindBy(xpath="//li[contains(text(),\"Only registered customers can use email a friend feature\")]")
	private WebElement errorMsg;
	public WebElement getApparelShoeslink() {
		return ApparelShoeslink;
	}
	public WebElement getPolkaDotTop() {
		return getPolkaDotTop();
	}
	public WebElement getEmailaFriendButton() {
		return getEmailaFriendButton();
		
	}
	public WebElement getEnterFriendEmail() {
		return enterFriendEmail;
	}
	public WebElement getSendEmailButton() {
		return sendEmailButton;
	}
	public WebElement getErroeMsg() {
		return errorMsg;
	}

	}
		
	
	
	


