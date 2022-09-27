import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	public static void main(String[] args) {
		//Step 1: Declare a path
		String path = "E:\\phase5-lib\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		//Step 2: Initialize the webdriver
		// Requires selenium server version 3.5.0 (jar & server zip files)
		
		WebDriver driver = new ChromeDriver();
		
		//Step3: give the base url
		
		String url = "http://www.google.com";
		driver.get(url);
		driver.close();
		
		System.out.println("Driver working properly...");
	}
	
	
}
