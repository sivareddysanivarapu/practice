package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggDropdownApsrtc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.apsrtconline.in/oprs-web/");
		driver.findElement(By.xpath("//input[@name='source']")).click();
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys("GUNTU");
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@name='source']")).sendKeys(Keys.DOWN);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String s1 = "return document.getElementById(\"fromPlaceName\").value;";// by using this we can grab the hidden
																				// text in  box
		
        String text=(String) js.executeScript(s1);
	    System.out.println(text);
	}

}
