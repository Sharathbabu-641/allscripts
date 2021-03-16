package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbprintlogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
		driver.get("https://www.facebook.com/");
		String logintext = driver.findElement(By.id("u_0_b")).getText();
		System.out.println(logintext);
		driver.close();
	}
}
