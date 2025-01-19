package TutotialsNinjas;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Hackathon_8192.CheckoutPage;
import Hackathon_8192.Login_Functionality;
import Hackathon_8192.Product_Search_And_Filter;
import Hackathon_8192.Registration;
import Hackathon_8192.display1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestRun {
WebDriver driver=null;
	
	@Given("set up")
	@BeforeClass
	public void set_up() {
		driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=common/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@When("Registration")
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
	@When("login")
	public void testValidLogin() throws InterruptedException {
    	Login_Functionality loginPage = new Login_Functionality(driver);
    	loginPage.Myaccount();
    	loginPage.LoginClick();
        loginPage.enterEmail("mishraalok1872001@gmail.com");
        loginPage.enterPassword("Mca@63874@");
        loginPage.clickLogin();
        Thread.sleep(3000);
    }
	@Then(" check Product is display")
	public void display() throws InterruptedException {
    	display1 dis=new display1(driver);
    	dis.dis();
    	dis.pro();
    	Thread.sleep(2000);
    	
    }
	@Then(" check search functionality")
	public void testSearchProduct() throws InterruptedException {
    	Product_Search_And_Filter productPage= new Product_Search_And_Filter(driver); 
        productPage.searchProduct("iPhone");
        
    }
	@Then("CheckOut product")
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
	@Then("quit the driver")
    public void tearDown() throws InterruptedException {
    	Thread.sleep(2000);
        driver.quit();
    }

}
