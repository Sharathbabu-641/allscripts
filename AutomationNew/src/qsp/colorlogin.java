package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class colorlogin {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
		driver.get("https://demo.actitime.com/");
		String logincolor = driver.findElement(By.id("loginButton")).getCssValue("color");
System.out.println(logincolor);
driver.close();
}
}