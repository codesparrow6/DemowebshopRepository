package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPage {
	public  BookPage(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}
	@FindBy(linkText="Books")
	private WebElement book;
	
	@FindBy(linkText="Fiction")
     private WebElement ficbook;
	
	@FindBy(id="add-to-cart-button-45")
    private WebElement Ficcart;

	public WebElement getBook() {
		return book;
	}

	public WebElement getFicbook() {
		return ficbook;
	}

	public WebElement getFiccart() {
		return Ficcart;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@FindBy(xpath="(//input[@class='button-2 product-box-add-to-cart-button'])[1]")
//	private WebElement addbookCart;
//
//	@FindBy(linkText="Computing and Internet")
//	private WebElement booksincart;
//
//	@FindBy(name="removefromcart")
//	private WebElement removecart;
//
//	@FindBy(name="updatecart")
//	private WebElement updatecart;
//
//
//	public WebElement getBook() {
//		return book;
//	}
//
//	public WebElement getAddbookCart() {
//		return addbookCart;
//	}
//
//	public WebElement getBooksincart() {
//		return booksincart;
//	}
//
//	public WebElement getRemovecart() {
//		return removecart;
//	}
//
//	public WebElement getUpdatecart() {
//		return updatecart;
//	}
//
}
