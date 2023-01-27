package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fourproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement pt1 = driver.findElement(By.id("alertButton"));
		
		
		((JavascriptExecutor)driver).executeScript("arguments[0]click()",pt1);
	
		pt1.accept();
	    //Alert alertButton = driver.switchTo().alert();
	    
	    
	}

}
