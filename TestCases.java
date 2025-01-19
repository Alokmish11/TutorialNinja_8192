package Hackathon_8192;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class TestCases {

	WebDriver driver;
	
	 @BeforeClass
	    public void setUp() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   		
	   	}
           // Register
	        @Test
	        public void register() throws InterruptedException {
	        	Registration  rg = new Registration(driver);
			rg.account();
			rg.click_rejister();
			rg.fastName("Alok ");
			rg.lastName("Mishra");
			rg.mail("mishraalok1872001@gmail.com");
			rg.ph("8932945274");
			rg.password("Mca@63874@");
			rg.ConPassword("Mca@63874@");
			rg.redio();
			Thread.sleep(3000);
		
	   }
   
           //   valid Login_Functionality
	    @Test(priority = 1)
	    public void testValidLogin() throws InterruptedException {
	    	Login_Functionality loginPage = new Login_Functionality(driver);
	    	loginPage.Myaccount();
	    	loginPage.LoginClick();
	        loginPage.enterEmail("mishraalok1872001@gmail.com");
	        loginPage.enterPassword("Mca@63874@");
	        loginPage.clickLogin();
	        Thread.sleep(3000);
	    }
     
	    //   Product_Search_And_Filter
	    @Test(priority = 1)
	    public void testSearchProduct() throws InterruptedException {
	    	Product_Search_And_Filter productPage= new Product_Search_And_Filter(driver); 
	        productPage.searchProduct("iPhone");
	        Assert.assertTrue(driver.getPageSource().contains("iPhone"), "Search results do not contain the product.");
	        
	       
	        Thread.sleep(200);
	        
	    }
	    // display items
	    @Test
	    public void display() throws InterruptedException {
	    	display1 dis=new display1(driver);
	    	dis.dis();
	    	dis.pro();
	    	Thread.sleep(2000);
	    	
	    }
	   
	    //   CheckOut Process
	    @Test
	    public void testAddToCart() throws InterruptedException {
	    	
	    	CheckoutPage sea = new CheckoutPage(driver);
	    		sea.SearchItem("iphone");
	    		sea.SearchButton();
	    		sea.addToCart();
	    		sea.proceedToCheckout();
	    		sea.promoOpt();
	    		sea.applyPromoCode("HAIR20");
	    		sea.AddCoupn();
	    		Thread.sleep(2000);
	    		driver.quit();
			Thread.sleep(2000);
			
	    }
	   
	    @AfterClass
	    public void tearDown() throws InterruptedException {
	    	Thread.sleep(2000);
	        driver.quit();
	    }

	    
}
