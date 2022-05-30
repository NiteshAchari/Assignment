package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Pages1.BorrowPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BorrowingAmountTest {

	public class SuccessfulEstimate {

		
		  @Test
		  public void testUntitledTestCase() throws Exception {
		    
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();  
			  
			 //Open the web browser
		    driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		   
		    BorrowPage.Application_type(driver).click();
		    
		    BorrowPage.Number_Of_Dependants(driver).click();
		    
		    BorrowPage.Property_u_Would_Like_To_Buy(driver).click();
		  
		    BorrowPage.Annual_income_Before_tax(driver).click();
		    BorrowPage.Annual_income_Before_tax(driver).clear();
		    BorrowPage.Annual_income_Before_tax(driver).sendKeys("80,000");
		    
		    BorrowPage.Other_income_optional(driver).click();
		    BorrowPage.Other_income_optional(driver).clear();
		    BorrowPage.Other_income_optional(driver).sendKeys("10,000");
		    
		    BorrowPage.Monthly_living_expenses(driver).click();
		    BorrowPage.Monthly_living_expenses(driver).clear();
		    BorrowPage.Monthly_living_expenses(driver).sendKeys("500");
		    
		    BorrowPage.Current_homeloan_monthly_repayments(driver).click();
		    BorrowPage.Current_homeloan_monthly_repayments(driver).clear();
		    BorrowPage.Current_homeloan_monthly_repayments(driver).sendKeys("0");
		    
		    BorrowPage.Other_loan_monthly_repayments(driver).click();
		    BorrowPage.Other_loan_monthly_repayments(driver).clear();
		    BorrowPage.Other_loan_monthly_repayments(driver).sendKeys("100");
		    
		    BorrowPage.Other_monthly_commitments(driver).click();
		    BorrowPage.Other_monthly_commitments(driver).clear();
		    BorrowPage.Other_monthly_commitments(driver).sendKeys("0");
		    
		    BorrowPage.Total_credit_card_limits(driver).click();
		    BorrowPage.Total_credit_card_limits(driver).clear();
		    BorrowPage.Total_credit_card_limits(driver).sendKeys("10,000");
		    
		    BorrowPage.Workout_how_much_I_Could_Borrow(driver).click();
		  
		 String a = BorrowPage.Borrow_Result(driver).getAttribute("value");
		   
		Assert.assertEquals(a, "528,000");
		  }

		}

	
	
}
