package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class DeskTopPage extends BaseClass {
	
	public DeskTopPage(WebDriver driver) {
	  PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText="computers")
	private WebElement computerClick;
	@FindBy(partialLinkText="Desktops")
	private WebElement DesktopsClick;
	@FindBy(xpath="//imp[@alt=\"pictureof Build your own cheap computer\"]")
	private WebElement clickonProduct;
	@FindBy(xpath="//img[@alt=\"pictureof Build your own expensivecomputer\"]")
	private WebElement removebutton;
	
	public WebElement getRemovebutton() {
	return removebutton;
	}
	
	public WebElement getComputerClick() {
		return computerClick;
	}
	public WebElement getDesktopsClick() {
		return DesktopsClick;
	}
	public WebElement getCickonProduct() {
		return clickonProduct;
	}
//	public WebElement getAddtoCompareList() {
//		return addtoCompareList;
//	}
	public WebElement getClickonProduct1() {
		return getClickonProduct1();
	}


	
	
	}
	
	
	


