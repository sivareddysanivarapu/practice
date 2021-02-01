package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			Thread.sleep(6000);
			//driver.findElement(By.id("checkBoxOption1")).click();
			//driver.findElement(By.id("checkBoxOption1")).isSelected();
			//driver.findElement(By.id("checkBoxOption1")).click();
			
			

	}

}
