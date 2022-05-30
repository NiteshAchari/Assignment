package iFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrames {

	@Test(priority=1)
	public void SingleiFrame() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();  
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).clear();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
	
	    driver.switchTo().defaultContent();
	    
    	driver.findElement(By.linkText("Iframe with in an Iframe")).click();
    	driver.switchTo().frame(1);
    	
    	int size = driver.findElements(By.tagName("iframe")).size();                                                                                                          
	    System.out.println("Total Frames --" + size);
	    
	    driver.switchTo().frame(0);
	    
	    driver.findElement(By.xpath("//input[@type='text']")).click();
	    driver.findElement(By.xpath("//input[@type='text']")).clear();
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abcd");
    
	    driver.switchTo().defaultContent();
    }
	
}
