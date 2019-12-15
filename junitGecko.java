package MyFramework;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class junitGecko {
	public static WebDriver driver;
	
	@Test
	public void sampleTest() {
		//System.setProperty("webdriver.gecko.driver", "F:\\jars\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		 driver = new FirefoxDriver();

		driver.get("https://www.seleniumhq.org/");

		// System.setProperty("webdriver.gecko.driver","C:\Users\himanshu\workspace\seleniumproject\lib\gikodriver");

	}

	@Test
	public void nextMethod() {
		System.out.println("this is second method");

	}

	@Before
	public void login() {
		System.out.println("inside before");
	}

	@After
	public void logout() {
		System.out.println("inside after");
	}

	@BeforeClass
	public static void launch() {
		System.out.println("inside after class");
	}
	
	@AfterClass
	
	
		public static void terminate() {
			System.out.println("inside after class");
		driver.quit();
	}
	
	
}
