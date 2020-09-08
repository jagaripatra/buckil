package pages;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
	public WebDriver driver = null;

	public By edtFirstName = By.id("Usr_Fname");
	public By edtLastName = By.id("Usr_Lname");
	public By edtUserName = By.id("user");
	public By edtEmail = By.id("Usr_Email");
	public By edtPassword = By.id("pass");
	public By edtConfirmPassword = By.id("confirm_password");
	public By btnRegister = By.xpath("(//*[@class='login-btn'])[3]");
	
	public String dtFirstName = "Zack";
	public String dtLastName = "Zack";
	public String dtUserName = "zackzack";
	public String dtEmail = "test@test.com";
	public String dtPassword = "12345678";
	public String dtConfirmPassword = "12345678";
	
	public Register(WebDriver driver) {
		this.driver=driver;
	}

	public void fillRegisterForm() {
		
		driver.findElement(edtFirstName).sendKeys(dtFirstName);
		driver.findElement(edtLastName).sendKeys(dtLastName);
		driver.findElement(edtUserName).sendKeys(dtUserName);
		driver.findElement(edtEmail).sendKeys(dtEmail);
		driver.findElement(edtPassword).sendKeys(dtPassword);
		driver.findElement(edtConfirmPassword).sendKeys(dtConfirmPassword);
	}
	
	public void clickRegister() {
		driver.findElement(btnRegister).click();
	}
}


