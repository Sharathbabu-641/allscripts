package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceAligned {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		int departdate = driver.findElement(By.id("ctl00_mainContent_view_date1")).getLocation().getY();
		int returndate = driver.findElement(By.id("ctl00_mainContent_view_date2")).getLocation().getY();
		if(departdate==returndate) {
			System.out.println("aligned properly");
		}
		else {
			System.out.println("not aligned properly");
		}
		driver.close();
	}

}
