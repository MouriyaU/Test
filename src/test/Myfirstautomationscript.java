package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myfirstautomationscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "c:\\Drivers\\chromedriver.exe");
 
		//System.setProperty("webdriver.edge.driver","c:\\Drivers\\msedgedriver.exe");
		
		///System.setProperty("webdriver.gecko.driver","c:\\Drivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new EdgeDriver();
		
		//WebDriver driver = new FirefoxDriver();
		 
		 driver.get("http://adactinhotelapp.com");
		 
		/* driver.navigate().to("http://google.com");
		 
		 driver.navigate().back();
		 
		 driver.navigate().forward();
		 
		 driver.navigate().refresh();
		 
		 driver.quit(); */
		 
		 driver.findElement(By.id("username"));
		 uName.sendkeys("Tpillai567");
		 //
		 
		 driver.findElement(By.id("password").sendkeys("Pillai112"));
		 
		 
		 //class
		 //driver.findElement(By.cssSelector(".login_register")).click();
		 
		 
		 //tag id
		 driver.findElement(By.cssSelector("input#login")).click();

		 //tagclass
		 
		 driver.findElement(By.cssSelector("input.login_button")).click();
		 
		 
		 //tag attribute
		 

		 
		 
		 driver.findElement(By.cssSelector("input[name=login]")).click();
		 
		 //type
		 driver.findElement(By.cssSelector("input.login_button[type=submit]")).click();
		 
		 
		 //value
		 
		 
		 driver.findElement(By.cssSelector("input.login_button[type=login]")).click();
		 
		 //Click on forgot password
		 
		 driver.findElement(By.cssSelector(null))
		 
		 /*
		  * 
		  * 
		  */
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 		
		 
		 
		 
	}

}
