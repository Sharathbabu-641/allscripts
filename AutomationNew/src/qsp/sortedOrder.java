package qsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sortedOrder {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
	ArrayList<String> al= new ArrayList<String>();
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/sharath/Desktop/Hotel.html");
		 WebElement Mtrlistbox = driver.findElement(By.id("MTR"));
		 Select s= new Select(Mtrlistbox);
		 List<WebElement> alloptions = s.getOptions();
		 for(int i=0;i<alloptions.size();i++) {
			 al.add(alloptions.get(i).getText());
		 }
	Collections.sort(al);
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	driver.close(); 
	}
}
