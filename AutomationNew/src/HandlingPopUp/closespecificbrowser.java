package HandlingPopUp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closespecificbrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		System.out.println("enter the title of the browser to be closed");
		Scanner sc=new Scanner(System.in);
		String Expectedtitle = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			String actualtitle = driver.getTitle();
			if(actualtitle.equals(Expectedtitle)) {
				driver.close();
			}
		}
	}

}
