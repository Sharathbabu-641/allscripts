package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sharath/Desktop/Hotel.html");
		 WebElement Mtrlistbox = driver.findElement(By.id("MTR"));
		 Select s= new Select(Mtrlistbox);
		 Thread.sleep(1000);
		 s.selectByIndex(0);
		 Thread.sleep(1000);
		 s.selectByValue("MD");
		 Thread.sleep(1000);
		 s.selectByVisibleText("Vada");
		 Thread.sleep(1000);
		 boolean v=s.isMultiple();
		 s.deselectByIndex(0);
		 Thread.sleep(1000);
		 s.deselectByValue("MD");
		 Thread.sleep(1000);
		 s.deselectByVisibleText("Vada");
		 Thread.sleep(1000);
		 driver.close();
}
}