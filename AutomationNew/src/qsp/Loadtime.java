package qsp;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loadtime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	try {
		driver.get("https://demo.actitime.com/");
		System.out.println("page is loaded within 10 sec");
	}
	catch (Exception e) {
		System.out.println("Page is not loaded within 10 sec");
	}
	driver.close();
	}
}
