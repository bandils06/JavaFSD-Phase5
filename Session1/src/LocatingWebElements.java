import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWebElements {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\phase5-lib\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// locating web elements
		// by id
		WebElement email_id = driver.findElement(By.id("email"));
		WebElement email_name = driver.findElement(By.name("email"));

		System.out.println("Email by ID and Name: "+email_id.equals(email_name));
		
		//find link text
		WebElement link=driver.findElement(By.linkText("Forgotten password?"));
		link.click();
		
		//find by relative path(Xpath)
//		WebElement email_xpath=driver.findElement(By.xpath("//*[@id=\"email\"]"));
//		System.out.println("Email from Xpath and ID: "+email_id.equals(email_xpath));
		
		//find by full xpath
//		WebElement email_fullXpath = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
//		System.out.println("Email from Full Xpath and ID: "+email_id.equals(email_fullXpath));
		
		//Find by selector (css selector)
//		WebElement email_cssSelector = driver.findElement(By.cssSelector("#email"));
//		System.out.println("Email by CSS Selector and ID: "+email_cssSelector.equals(email_id));
 		
		//List of WebElements
//		List<WebElement> list = (List<WebElement>) driver.findElement(By.cssSelector("input.inputtext"));
//		
//		for(WebElement e:list) {
//			System.out.println("List of WebElements: "+e.getAttribute("placeholder"));
//		}
		
		//Find by tag
//		WebElement password = driver.findElement(By.cssSelector("input[name=pass]"));
//		System.out.println("Password using Tag: "+password.getAttribute("placeholder"));
		
		try {
			Thread.sleep(2000);
			driver.close();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
