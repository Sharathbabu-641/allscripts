package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class insurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
	WebElement monthlb = driver.findElement(By.className("ui-datepicker-month"));
	Select s1=new Select(monthlb);
	s1.selectByIndex(8);
	WebElement yearlb = driver.findElement(By.className("ui-datepicker-year"));
	Select s2=new Select(yearlb);
	s2.selectByValue("1994");
	driver.findElement(By.xpath("//a[.=28]")).click();
	driver.findElement(By.id("alternative_number")).sendKeys("9035522641");
	driver.findElement(By.id("renew_policy_submit")).click();
	 String text = driver.findElement(By.id("policynumberError")).getText();
	 System.out.println(text
			 );
	driver.close();
	}
}