package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbLogo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String logo = driver.findElement(By.xpath("//img[@alt='Facebook']")).getTagName();
		if(logo.equals("img")) {
			System.out.println("tagname is img");
		}
		else {
			System.out.println("tagname is not img");
		}
			driver.close();
	}
}
