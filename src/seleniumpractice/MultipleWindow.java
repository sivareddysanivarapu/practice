package seleniumpractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup");
	driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();//multiple window
	//driver.findElement(By.xpath("//span[contains(text(),'Google Account')]")).click();
System.out.println(driver.getTitle());//in this it prints parent window title only  not child window
Set<String> ids   = driver.getWindowHandles();//this windowhandles method returns the ids of open windows
Iterator<String> it=ids.iterator();//we use iterator because set contains diff values
String parentid=it.next();
String childid=it.next();
//String grandchild=it.next();
System.out.println(childid);
driver.switchTo().window(childid);//i want to switch to child window i.e 2nd window
}}
