package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText="Computers")
	private WebElement computerClick;
	@FindBy(partialLinkText="Desktops")
	private WebElement DesktopsClick;
	@FindBy(xpath="//img[@alt=\"Picture of Build your own cheap computer\"]")
	private WebElement clickonProduct;
	@FindBy(xpath="//input[@value=\"add to compare list\"]")
	private WebElement addtoCompareList;
	@FindBy(xpath="//img[@alt=\"Picture of Build your own expensive computer\"]")
	private WebElement clickonProduct1;
	public WebElement getComputerClick() {
		return computerClick;
	}
	public WebElement getDesktopsClick() {
		return DesktopsClick;
	}
	public WebElement getClickonProduct() {
		return clickonProduct;
	}
	public WebElement getAddtoCompareList() {
		return addtoCompareList;
	}
	public WebElement getClickonProduct1() {
		return clickonProduct1;
	}
	
	
	
}
