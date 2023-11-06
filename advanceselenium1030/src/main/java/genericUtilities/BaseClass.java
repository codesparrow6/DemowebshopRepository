package genericUtilities;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.Addproductstocart;
import objectRepository.BookPage;
import objectRepository.CartPage;
import objectRepository.LoginPage;
import objectRepository.RegisterPage;
import objectRepository.emailErrorMsgPage;
import objectRepository.jewelleryPage;
import objectRepository.removeWishListPage;

public class BaseClass implements IAutoConstants {
	public static WebDriver driver;
	public static TakeScreenshotUtility screenshot;
	public static ExtentTest logger;
	DatabaseUtility dbUtility;
	JavaUtility javaUtility;
	PropertyUtility property;
	public static LoginPage Loginpage;
	public static WebDriverUtility webdriverUtility;
	public static RegisterPage registerpage;
	public static Addproductstocart desktop;
	public static CartPage product;
	public static emailErrorMsgPage  msg;
	public static removeWishListPage wishlist;
	public static BookPage bookpage;
	public static jewelleryPage jpage;

	@BeforeClass(alwaysRun=true)
	public void launchingBrowserAndNavagateToApp() {
		property=new PropertyUtility();
		if(BROWSER.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options =new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver =new ChromeDriver(options);
		}else if(BROWSER.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else {
			WebDriverManager.edgedriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(property.getDataFromPropertyFile("url"));
		webdriverUtility=new  WebDriverUtility(driver);
		screenshot=new TakeScreenshotUtility(driver);
		dbUtility=new DatabaseUtility();
		javaUtility=new JavaUtility();

	}
	@BeforeMethod(alwaysRun=true)
	public void loginToApplication() {
		Loginpage=new LoginPage(driver);
		desktop=new Addproductstocart(driver);
		registerpage=new RegisterPage(driver);
		product=new CartPage(driver);
		msg=new emailErrorMsgPage(driver);
		wishlist=new  removeWishListPage(driver);
		bookpage=new  BookPage(driver);
		jpage=new jewelleryPage(driver);



	}
	@AfterMethod(alwaysRun=true)
	public void logoutFromApplication() {
		System.out.println("logged out from the application");
	}
	@AfterClass(alwaysRun=true)
	public void tearDownTheBrowser() {
		//driver.quit();
	}
}


//public static WebDriver driver;
//	public static TakeScreenshotUtility uti;
//	@BeforeMethod
//	public static void demo() {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		
//		driver=new ChromeDriver(options);
//		driver.manage().window().maximize();
//		uti=new TakeScreenshotUtility(driver);
//		
//		}


