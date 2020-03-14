package firstProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass1 {

	public static void main(String[] args) {
		
		// Webdriver path
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver_win32\\chromedriver.exe");
		
		//driver object
		WebDriver driver = new ChromeDriver();
		
		//Open google.com
		driver.get("http://www.google.com/");
		
		//Print current url
		System.out.println(driver.getCurrentUrl());
		
		//Get current page title
		System.out.println(driver.getTitle());
		
		driver.close();
		

	}

}
