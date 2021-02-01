package seleniumpractice;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;

public class CloudTestSaucelabs {

	public static final String USERNAME = "sivareddy_1996..";

	public static final String ACCESS_KEY = "5e8b0b9a-6ede-45f9-a3af-a214cc997a2b";

	public static final String URL = "https://sivareddy_1996..:5e8b0b9a-6ede-45f9-a3af-a214cc997a2b@ondemand.us-west-1.saucelabs.com:443/wd/hub";
//the above url is present in saucelabs site in account > user settings
	public static void main(String[] args) throws MalformedURLException {

// TODO Auto-generated method stub

		DesiredCapabilities caps = DesiredCapabilities.chrome();//desired capoab.. is a class used o connect VM in saucelabs

		caps.setCapability("platform", "Windows 7");//these are called VM prerequisties

		caps.setCapability("version", "51.0");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);// we use remote webdriver because driver is present in VM not in local machine

		driver.get("http://google.com");

		System.out.println(driver.getTitle());

	}

}
