package seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumsmalltopics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "test-output/chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.salesforce.com/in/");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int size=links.size();
		for(int i=0;i<size-1;i++) {
			System.out.println("link text is:" +links.get(i).getText());
		}
	}

}
