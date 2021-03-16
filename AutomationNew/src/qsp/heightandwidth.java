package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class heightandwidth {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
		driver.get("https://www.facebook.com/");
		int Height = driver.findElement(By.id("email")).getSize().getHeight();
		int width = driver.findElement(By.id("email")).getSize().getWidth();
		System.out.println("height="+Height);
		System.out.println("width="+ width);
		driver.close();
	}
}