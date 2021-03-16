package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alloptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sharath/Desktop/Hotel.html");
		 WebElement Slvlistbox = driver.findElement(By.id("SLV"));
		 Select s= new Select(Slvlistbox);
		 List<WebElement> alloptions = s.getOptions();
		 for(int i=0;i<alloptions.size();i++) {
			 System.out.println(alloptions.get(i).getText());
		 }
	driver.close();
	}

}
