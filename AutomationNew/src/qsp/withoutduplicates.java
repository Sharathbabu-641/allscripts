package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class withoutduplicates {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		HashSet<String> hs= new HashSet<String>();
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sharath/Desktop/Hotel.html");
		WebElement Mtrlistbox = driver.findElement(By.id("MTR"));
		Select s= new Select(Mtrlistbox);
		List<WebElement> alloptions = s.getOptions();
		for(int i=0;i<alloptions.size();i++) {
			hs.add(alloptions.get(i).getText());
		}
		for(String s1:hs) {
			System.out.println(s1);
		}
		driver.close();
	}
}