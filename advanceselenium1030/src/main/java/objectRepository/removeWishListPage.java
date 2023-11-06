package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.BaseClass;

public class removeWishListPage extends BaseClass {
	public removeWishListPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy (xpath="//input[@value=\"Update wishlist\"]")
	private WebElement updateWishList;
	@FindBy(xpath="//input[@name=\"removefromcart\"]")
	private WebElement productCheckBox;
	
	public WebElement getProductCheckBox() {
		return updateWishList;
	}
	
	public WebElement getUpdateWishList() {
		return updateWishList;
		
		
	}
	public WebElement getWishListButton() {
		return getWishListButton();
	}
	
	public WebElement getSelectJewellery() {
		return getSelectJewellery();
	}
	public WebElement getwishlistlink() {
		return getwishlistlink();
	}
	
}


