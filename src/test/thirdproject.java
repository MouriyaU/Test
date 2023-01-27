package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class thirdproject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("chocolate");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//scroll down-JSexecutor
		JavascriptExecutor executorjs =(JavascriptExecutor)driver; 
		
		executorjs.executeScript("window.scrollBy(0,700)");
		
		//String text = driver.findElement(By.cssSelector("a-size-base-plus a-color-base a-text-normal")).getText();
		
		//System.out.println(text);
		
		
		 System.out.println(driver.findElement(By.cssSelector("span.a-size-base-plus a-color-base a-text-normal")).getText());
		
		
		//System.out.println(results.size());
		
		//System.out.println(results.get(0).gettext());
	}

}
