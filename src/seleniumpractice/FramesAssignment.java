package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers&Zars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		//after clicking it contains frame inside frame, so first we need to enter outer frame and enter into inner
		WebElement ele=driver.findElement(By.xpath("//frame[@name='frame-top']"));//it is outer frame
		driver.switchTo().frame(ele);////first switching into outer frame
		driver.switchTo().frame(1);//after entering into outer frame then enter into inner frame with index 1
	System.out.println(	driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());
		
	}

}
