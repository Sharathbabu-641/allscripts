package HandlingMouseActions;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/home/");
		WebElement Resource = driver.findElement(By.id("navbarDocumentation"));
		Actions a=new Actions(driver);
		a.moveToElement(Resource).perform();
		driver.findElement(By.partialLinkText("Contact")).click();
		WebElement ph = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/../p[2]"));
		System.out.println(ph.getText());
		driver.close();
	}
}