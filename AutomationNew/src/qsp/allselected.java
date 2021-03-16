package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allselected {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/sharath/Desktop/Hotel.html");
		 WebElement Slvlistbox = driver.findElement(By.id("SLV"));
		 Select s= new Select(Slvlistbox);
		 List<WebElement> allselectedoptions = s.getAllSelectedOptions();
		 int count = allselectedoptions.size();
		 for(int i=0;i<count;i++) {
			 System.out.println(allselectedoptions.get(i).getText());
		 }
		 driver.close();
	}
}
