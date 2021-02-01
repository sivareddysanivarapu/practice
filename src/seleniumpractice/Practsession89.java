package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Practsession89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		List<WebElement> totallinks=driver.findElements(By.xpath("//a"));//we use list because findelements returns list of links present in a page anchor tag represents links
		int links=totallinks.size();//to know no of links
		System.out.println(links);
		List<WebElement> webelements=driver.findElements(By.xpath("//*"));//* represents any type of tagname and useful to know no of webelemnt in apage
		int elements=webelements.size();
		System.out.println(elements);
		
				
	}

}
