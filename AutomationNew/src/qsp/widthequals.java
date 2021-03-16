package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class widthequals {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
WebDriver driver=new ChromeDriver()	;
driver.get("https://www.facebook.com/");
int WidthEmail = driver.findElement(By.id("email")).getSize().getWidth();
int WidthPass = driver.findElement(By.id("pass")).getSize().getWidth();
if(WidthEmail==WidthPass)
{
	System.out.println("Pass");
}
else
{
	System.out.println("fail");
}
driver.close();
}
}