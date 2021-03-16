package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbfontfamily {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
		driver.get("https://www.facebook.com/");
		String fontsize = driver.findElement(By.xpath("//a[.='Forgotten password?']")).getCssValue("font-size");
		System.out.println(fontsize);
		driver.close();
}
}