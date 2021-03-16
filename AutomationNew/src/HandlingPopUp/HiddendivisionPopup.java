package HandlingPopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddendivisionPopup {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement monthlb = driver.findElement(By.className("ui-datepicker-month"));
		Select s1= new Select(monthlb);
		s1.selectByVisibleText("Sep");
		WebElement yearlb = driver.findElement(By.className("ui-datepicker-year"));
		Select s2=new Select(yearlb);
		s2.selectByValue("1994");
		driver.findElement(By.linkText("28")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9035522641");
		driver.findElement(By.id("renew_policy_submit")).click();
		boolean v = driver.findElement(By.id("policynumberError")).isDisplayed();
				if(v==true)	{
					System.out.println("error message is displayed");
				}
				else {
					System.out.println("error message is not displayed");
				}
		driver.close();
		}
}