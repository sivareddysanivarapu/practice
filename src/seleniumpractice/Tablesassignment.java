package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablesassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement table = driver.findElement(By.xpath("//table[@id='product']"));
		int rowcount = table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println(rowcount);
		int columncount = table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		System.out.println(columncount);
		for (int i = 1; i < rowcount; i++) {
			if (i == 2) {

				String value = table.findElements(By.xpath("//table[@id='product']/tbody/tr")).get(i).getText();
				System.out.println(value);
			}
		}
	}

}
