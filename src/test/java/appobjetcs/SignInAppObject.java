package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInAppObject {

	private WebDriver driver;
	
	public SignInAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getCreateAccoutFieldText() {
		return driver.findElement(By.id("email_create"));
	}
}
