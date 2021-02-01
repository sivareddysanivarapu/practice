package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggDropdownAssignmentandCoordinates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement coordinates =driver.findElement(By.xpath("//img[@class='logoClass']"));
		//points class is used to get x and y coordinates of element.
		Point classname = coordinates.getLocation();
        int xcoordinate = classname.getX();
        System.out.println("Element's Position from left side" +xcoordinate +" pixels.");
        int ycoordinate = classname.getY();
        System.out.println("Element's Position from top"+ ycoordinate +" pixels.");
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String s1 = "return document.getElementById(\"autocomplete\").value;";
		String value = (String) js.executeScript(s1);
		System.out.println(value);

	}
}