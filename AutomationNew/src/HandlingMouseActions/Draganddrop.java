package HandlingMouseActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://dhtmlgoodies.com/submitted-scripts/i-google-link-drag-drop/index.html");
		WebElement source = driver.findElement(By.xpath("h1[.='Block 1']"));
		WebElement destination = driver.findElement(By.xpath("h1[.='Block 4']"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, destination).perform();
		driver.close();
	}

}
