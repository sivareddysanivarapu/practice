package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();// for accepting your connection is not private like pages
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);//these two lines are another form of above linke
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();// for browser
		c.merge(ch);// for merging browser with ssl pages
		WebDriver driver = new ChromeDriver(c);

	}

}
