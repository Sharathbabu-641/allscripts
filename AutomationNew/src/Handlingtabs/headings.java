package Handlingtabs;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class headings {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("(//div[@class='menu_icon'])[4]")).click();
		driver.findElement(By.xpath("//a[contains(.,'About your actiTIME')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Read Service Agreement')]")).click();
		List<WebElement> title = driver.findElements(By.tagName("u"));
		for(WebElement text:title) {
			System.out.println(text.getText());
		}
		Set<String> alltabs = driver.getWindowHandles();
		Iterator<String> itr=alltabs.iterator();
		String parenttab = itr.next();
		String childtab = itr.next();
		driver.switchTo().window(childtab);
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(parenttab);
		driver.close();
	}
}