package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageBuckil {
public WebDriver driver = null;
	
	public By lnkLogin = By.linkText("Sign in");
	public By lnkRegister = By.linkText("Register"); //By.xpath("//a[text()='Register']");
	
	public HomePageBuckil(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickLogin() {
		driver.findElement(lnkLogin).click();
	}
	
	public Register clickRegister() {
		System.out.println(driver.getTitle());
		WebElement elemReg = driver.findElement(lnkRegister);
		driver.findElement(lnkRegister).click();
		return new Register(driver);
	}
}

