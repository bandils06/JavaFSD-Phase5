import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\phase5-lib\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shine.com/registration/");
	
		WebElement checkbox = driver.findElement(By.id("id_privacy"));
		if(checkbox.isSelected()) {
			System.out.println("Checkbox is Selected by default");
			System.out.println("Status: "+checkbox.isSelected());
		}
		else {
			System.out.println("Checkbox isn't Selected");
		}
		
		checkbox.click();
		System.out.println("Status: "+checkbox.isSelected());

		driver.close();
	}
}
