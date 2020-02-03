package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShippingAppObject {
	
	private WebDriver driver;
	
	public ShippingAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getTermsOfServiceButton() {
		return driver.findElement(By.id("cgv"));
	}
	
	public WebElement getContinueShoppingButton() {
		return driver.findElement(By.cssSelector("a.button-exclusive"));
	}

	public WebElement getProceedToCheckoutButton() {
		return driver.findElement(By.name("processCarrier"));
	}
}
