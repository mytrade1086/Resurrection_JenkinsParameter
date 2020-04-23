package Resurrection_JenkinsParameter.Resurrection_JenkinsParameter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class TestCaseOne {

	WebDriver driver;

	public void demoRun() throws InterruptedException {
		String strBrowser = System.getProperty("browser");
		String strOS = System.getProperty("os"); // prints
		System.out.println("Printing browser= " + strBrowser);
		System.out.println("Printing browser= " + strOS);

		if (strBrowser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "H:\\eclipseWin10Clean\\Project1\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://www.rediff.com");
			Thread.sleep(5000);
			driver.quit();
		}
		
		
		if (strBrowser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "H:\\eclipseWin10Clean\\Project1\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://www.rediff.com");
			Thread.sleep(5000);
			driver.quit();
		}
		
		
		
		
	}
}

//run this as mvn test -Dbrowser=chrome -Dos=win10
//Output
//Printing browser= chrome
//Printing browser= win10
