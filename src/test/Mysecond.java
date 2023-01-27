package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mysecond {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
	    username.sendKeys("mouriya1");
	    
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("Login@1234");
	    
	    driver.findElement(By.cssSelector("input#login")).click();
	    
	    new Select(driver.findElement(By.className("search_combobox"))).selectByVisibleText("Melbourne");
	    new Select(driver.findElement(By.cssSelector("#hotels.search_combobox"))).selectByVisibleText("Hotel Sunshine");
	    
	    driver.findElement(By.id("Submit")).click();
	    driver.findElement(By.id("radiobutton_1")).click();
	    
	    driver.findElement(By.linkText("Booked Itinerary")).click();
	    
	    
	    
	   
	    
		 
	}

}
