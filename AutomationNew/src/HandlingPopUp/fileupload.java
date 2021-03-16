package HandlingPopUp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("C:\\Users\\sharath\\Desktop\\Resume.txt");
		File f =new File(".data/Resume.docx");
		String absolutepath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(absolutepath);
		driver.close();
		
}
}