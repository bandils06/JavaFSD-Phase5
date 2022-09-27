import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// Step 1: Declare a path
		String path = "E:\\phase5-lib\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);

		// Step 2: Initialize the webdriver
		// Requires selenium server version 3.5.0 (jar & server zip files)

		WebDriver driver = new ChromeDriver();

		// Step3: give the base url

		String url = "http://www.facebook.com";
		driver.get(url);
		
		//maximise the window
		driver.manage().window().maximize();

		//To get title of page
		System.out.println("Title: " + driver.getTitle());
		
		WebElement email = driver.findElement(By.id("email"));
		System.out.println(email.getAttribute("placeholder"));
		email.sendKeys("hrithik@gmail.com");
		
		WebElement pass=driver.findElement(By.name("pass"));
		System.out.println(pass.getAttribute("placeholder"));
		pass.sendKeys("12345678");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
//		driver.close();

		System.out.println("Driver working properly...");
	}
}
