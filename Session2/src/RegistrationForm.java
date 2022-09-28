import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\phase5-lib\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
		
		//name
		WebElement name = driver.findElement(By.id("id_name"));
		name.sendKeys("Hrithik Bandil");
		//email
		WebElement email = driver.findElement(By.id("id_email"));
		email.sendKeys("gmailnoob@gmail.com");
		//mobile
		WebElement mob = driver.findElement(By.id("id_cell_phone"));
		mob.sendKeys("7983561059");
		//password
		WebElement pass = driver.findElement(By.id("id_password"));
		pass.sendKeys("Abcd@1234");

		//button
		WebElement button = driver.findElement(By.cssSelector("#registerButton"));
		button.click();
	}
}
