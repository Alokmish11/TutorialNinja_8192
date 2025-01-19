package Hackathon_8192;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Product_Search_And_Filter {
	 WebDriver driver;
	 public Product_Search_And_Filter(WebDriver driver) {
	        this.driver = driver;
	    }

	     By searchField = By.xpath("//input[@placeholder='Search']");
	     By searchButton = By.xpath("//button[@class='btn btn-default btn-lg']");
	     By filterCategory = By.id("input-category");
	     By filterPrice = By.id("input-price");
	     By sortDropdown = By.id("input-sort");

	    public void searchProduct(String productName) {
	        driver.findElement(searchField).sendKeys(productName);
	        driver.findElement(searchButton).click();
	    }

	    public void applyFilter(String category, String price) {
	        driver.findElement(filterCategory).sendKeys(category);
	        driver.findElement(filterPrice).sendKeys(price);
	    }

	    public void sortBy(String sortOption) {
	        driver.findElement(sortDropdown).sendKeys(sortOption);
	    }
	}


