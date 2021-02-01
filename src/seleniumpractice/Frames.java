package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		WebElement e=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(e);//by using this we can enter into a frame
		//driver.findElement(By.xpath("//div[@id='draggable']")).click();
        Actions a= new Actions(driver);//we can acheive drag and drop by using actions
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();//this drag and drop method requires two sources i.e address of draggable object and droppable object
}
}