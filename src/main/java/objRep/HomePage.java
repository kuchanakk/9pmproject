package objRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonmetods.TestBase;

public class HomePage extends TestBase{
	
	
	public HomePage(WebDriver driver) {
		
	this.driver = driver;	
	}
	
	public static WebElement popitems() {
		
		return driver.findElement(By.linkText("POPULAR ITEMS"));
		
	}
	
	public static WebElement tabletlink() {
		
		return driver.findElement(By.id("details_16"));
	}
	
	public static WebElement laptoplink() {
		
		return driver.findElement(By.id("details_10"));
	}
	
	public static WebElement spklink() {
		
		return driver.findElement(By.id("details_21"));
	}
	
	public static WebElement elemnttext() {
		
		return driver.findElement(By.xpath("//*[@id=\"Description\"]/h1"));
	}

}
