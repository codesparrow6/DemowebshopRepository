package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class jewelleryPage extends BaseClass {
	
	public jewelleryPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText="Jewelry")
	private WebElement Jewlry;
	@FindBy(xpath="//a[@href=\"https://demoWebShop.tricentis.com/jewelry?price=0-500\"]")
	private WebElement priceRangeFilter;
	@FindBy(xpath="(//div[@class=\"add-info\"]) [2]")
	private WebElement jProduct;
	
	public WebElement getJewelry() {
		return Jewlry;
		}
	public WebElement getPriceRangeFilter() {
		return priceRangeFilter;
	}
	public WebElement getjProduct() {
		return jProduct;
		
		
		
	}
	

}
