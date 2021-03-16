package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbAligned {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
WebDriver driver=new ChromeDriver()	;
driver.get("https://www.facebook.com/");
 int AlignEmail = driver.findElement(By.id("email")).getLocation().getX();
 int AlignPass = driver.findElement(By.id("pass")).getLocation().getX();
if(AlignEmail==AlignPass)
{
	System.out.println("Aligned correctly");
}
else
{
	System.out.println("Not aligned correctly");
}
driver.close();
}
}