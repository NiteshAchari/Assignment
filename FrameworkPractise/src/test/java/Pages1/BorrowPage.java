package Pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BorrowPage {

	private static WebElement element= null;
	
	public static WebElement Application_type(WebDriver driver) {
	    element =driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div/ul/li/label"));
	    return element;
	    }
	
	public static WebElement Number_Of_Dependants (WebDriver driver) {
		element =driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div[2]/div/select"));
		return element;
		}
		
	public static WebElement Property_u_Would_Like_To_Buy (WebDriver driver) {
		element =driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div/div/div[3]/ul/li/label"));
		return element;
		}
	
	public static WebElement Annual_income_Before_tax (WebDriver driver) {
	    element =driver.findElement(By.xpath("//input[@value='0']"));
	    return element;
	    }
	
	public static WebElement Other_income_optional (WebDriver driver) {
		element =driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[2]/div/div[2]/div/input"));
		return element;
		}
	
	public static WebElement Monthly_living_expenses (WebDriver driver) {
		element =driver.findElement(By.id("expenses"));
		return element;
		}
	
	public static WebElement Current_homeloan_monthly_repayments (WebDriver driver) {
		element =driver.findElement(By.id("homeloans"));
		return element;
		}
	
	public static WebElement Other_loan_monthly_repayments (WebDriver driver) {
		element = driver.findElement(By.id("otherloans"));
		return element;
		}
	
	public static WebElement Other_monthly_commitments (WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='main-container']/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div/div[3]/div/div[4]/div/input"));
		return element;
		}
	
	public static WebElement Total_credit_card_limits (WebDriver driver) {
		element = driver.findElement(By.id("credit"));
		return element;
		}
	
	public static WebElement Workout_how_much_I_Could_Borrow (WebDriver driver) {
		element = driver.findElement(By.id("btnBorrowCalculater"));
		return element;
		}
	
	public static WebElement Borrow_Result (WebDriver driver) {
		element = driver.findElement(By.id("borrowResultTextAmount"));
		return element;
		}
}
