package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		WebElement daylistBox = driver.findElement(By.id("day"));
		Select s=new Select(daylistBox);
		s.selectByValue("28");;
		WebElement monthlistbox = driver.findElement(By.id("month"));
		Select s1=new Select(monthlistbox);
		s1.selectByValue("9");
		WebElement Yearlistbox = driver.findElement(By.id("year"));
		Select s2=new Select(Yearlistbox);
		s2.selectByVisibleText("1994");
		driver.close();
		}
}
