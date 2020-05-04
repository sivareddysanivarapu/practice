package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click(); //by using wrapping technique
	   // driver.findElement(By.xpath("//span[text()='From']")).clear();//for clearing the initial suggestion
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("MUM");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='fromCity']")).sendKeys(Keys.ENTER);
		//Thread.sleep(5000);
	    //driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("MUM");//for searching the mumbai
	    //driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(Keys.ENTER);//after typing mum it shows suggestion mumbai, for selecting we need to enter
	    
	    


}
}