package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowhandleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://the-internet.herokuapp.com/");
				driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();
				driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
				Set<String> ids= driver.getWindowHandles();
				Iterator<String> iter=ids.iterator();
				String firstid=iter.next();
				String secondid=iter.next();
				driver.switchTo().window(secondid);
				System.out.println(driver.getTitle());
				driver.switchTo().window(firstid);
				String s=driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText();
				System.out.println(s);
				
				
	}

}
