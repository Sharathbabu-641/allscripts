package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartripassignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.id("FromTag")).sendKeys("Bangalore");
		driver.findElement(By.id("ToTag")).sendKeys("Goa");
		driver.findElement(By.xpath("(//i[@class='icon ir datePicker'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='nextMonth '])")).click();
		driver.findElement(By.xpath("//a[@class='nextMonth '])")).click();
		driver.findElement(By.xpath("(//a[.='25'])[2]")).click();
		driver.findElement(By.id("SearchBtn")).click();
		List<WebElement> allflights = driver.findElements(By.xpath("//img[not(@id)]"));
		List<WebElement> alldepartures = driver.findElements(By.xpath("//img[not(@id)]/../../../../..div[2]/div/div[1]/p"));
		String Flightname;
		for(int i=0;i<allflights.size()-1;i++)
			 Flightname = allflights.get(i).getAttribute("alt");
			Object departuretime = alldepartures.get(i).getText();
}
}