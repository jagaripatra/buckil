package core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public static WebDriver driver = null;
	public static Properties prop = null;
	public static boolean isAdmin = false;
	
	static {
		try {
			FileInputStream fis = new FileInputStream(new File("D:\\DESIGN_STUDIO\\studio_workspace\\Buckil\\resources\\config.properties"));
			prop = new Properties();
			try {
				prop.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void getDriver() {
		
		String browserName = prop.getProperty("browser");
		
		String URL = prop.getProperty("url");
		
		if(isAdmin) {
			URL = prop.getProperty("url")+"/admin";
		}
		
		
		if(driver == null) {
			if (browserName.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"D:\\DESIGN_STUDIO\\studio_workspace\\Buckil\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.contains("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						"D:\\DESIGN_STUDIO\\studio_workspace\\Buckil\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}
				
		driver.get(URL);
	}
}
