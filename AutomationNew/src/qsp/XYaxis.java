package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XYaxis {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
WebDriver driver=new ChromeDriver()	;
driver.get("https://www.facebook.com/");
 int x = driver.findElement(By.id("email")).getLocation().getX();
 int y = driver.findElement(By.id("email")).getLocation().getY();
 System.out.println("X Axis="+x);
 System.out.println("Y axis="+y);
 driver.close();
 }
}