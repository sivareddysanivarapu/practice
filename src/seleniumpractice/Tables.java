package seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22761/ind-vs-aus-2nd-odi-australia-tour-of-india-2020");
				WebElement tabl=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));//address of indian batting innings scorecard i.e upper card
				int rowcount=tabl.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();//to know no of rows present in a table
				System.out.println(rowcount);
				int count=tabl.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();//we need scores of batsman the scores present on 3rd column
	            System.out.println(count);
	            for(int i=0;i<count-2;i++) {//we take count-2 we do not extra extra rows like extras and total
	            	String s=tabl.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();//to get the text present in a 3rd column
	            	System.out.println(s);
	            }
	           System.out.println( driver.findElement(By.xpath("///div[text()='Extras']/following-sibling::div")).getText());//for printing the extras value
	           System.out.println(driver.findElement(By.xpath("///div[text()='Total']/following-sibling::div")).getText());//for printing the total value
	}

}
