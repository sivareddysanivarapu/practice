package seleniumpractice;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.monte.media.math.Rational;
import org.monte.media.Format;
import org.monte.screenrecorder.ScreenRecorder;
import static org.monte.media.AudioFormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;
import java.awt.*;

public class CapturingVideo {
	private static ScreenRecorder screenRecorder;
	public static void main(String args[]) throws IOException, AWTException {
	 
	 GraphicsConfiguration gconfig = GraphicsEnvironment
	 .getLocalGraphicsEnvironment()
	 .getDefaultScreenDevice()
	 .getDefaultConfiguration();

	 screenRecorder = new ScreenRecorder(gconfig,
	 new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey,
	 MIME_AVI),
	 new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,
	 ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	 CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	 DepthKey, (int)24, FrameRateKey, Rational.valueOf(15),
	 QualityKey, 1.0f,
	 KeyFrameIntervalKey, (int) (15 * 60)),
	 new Format(MediaTypeKey, MediaType.VIDEO,
	 EncodingKey,"black",
	 FrameRateKey, Rational.valueOf(30)), null);
	WebDriver driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
	 // Start Capturing the Video
	screenRecorder.start();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.navigate().to("http://www.calculator.net/");
	driver.manage().window().maximize();
	 // Click on Math Calculators
	driver.findElement(By.xpath(".//*[@id='menu']/div[3]/a")).click();
	// Click on Percent Calculators
	driver.findElement(By.xpath(".//*[@id='menu']/div[4]/div[3]/a")).click();
	 driver.findElement(By.id("cpar1")).sendKeys("10");
	 driver.findElement(By.id("cpar2")).sendKeys("50");

	driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr/td[2]/input")).click();
	 String result =driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();

	 File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(screenshot, new File("D:\\Selenium\\screenshots1.jpg"));
	// Print a Log In message to the screen
	 System.out.println(" The Result is " + result);

	// Close the Browser.
	 driver.close();

	 // Stop the ScreenRecorder
	 screenRecorder.stop();

	}
}