import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class ScreenShotExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\phase5-lib\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		java.io.File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		try {
		FileHandler.copy(src, new File ("E://Facebook.png"));
		System.out.println("Screenshot Saved Successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		driver.close();
		

	}

}
