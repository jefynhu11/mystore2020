package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AuthenticationAppObject {

	private WebDriver driver;
	
	public AuthenticationAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getEmailCreateFieldText() {
		return driver.findElement(By.id("email_create"));
	}
	
	public WebElement getCreateAccoutButton() {
		return driver.findElement(By.id("SubmitCreate"));
	}
	
	public WebElement getEmailFieldText() {
		return driver.findElement(By.id("email"));
	}
	
	public WebElement getPasswordFieldText() {
		return driver.findElement(By.id("passwd"));
	}
	
	public WebElement getSignInButton() {
		return driver.findElement(By.id("SubmitLogin"));
	}
}
