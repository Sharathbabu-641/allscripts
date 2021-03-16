package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class emailtbxempty {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver()	;
		driver.get("https://www.facebook.com/");
		String s = driver.findElement(By.id("email")).getAttribute("value");
		if(s.length()==0) {
			System.out.println("email text box is empty");
		}
		else {
			System.out.println("email textbox is not empty");
		}
		driver.close();
	}
}
 