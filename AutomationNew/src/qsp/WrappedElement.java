package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WrappedElement {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sharath/Desktop/Hotel.html");
		WebElement Mtrlistbox = driver.findElement(By.id("MTR"));
		Select s= new Select(Mtrlistbox);
		WebElement alloptions = s.getWrappedElement();
		System.out.println(alloptions.getText());
		driver.close();
	}
}