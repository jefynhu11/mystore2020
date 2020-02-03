package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddressesAppObject {

	private WebDriver driver;
	
	public AddressesAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAdicionaMensagemAreaText() {
		return driver.findElement(By.name("message"));
	}
	
	public WebElement getAdicionaAddressButton() {
		return driver.findElement(By.cssSelector("p>a[title='Add']"));
	}
	
	public WebElement getContinueShoppingButton() {
		return driver.findElement(By.cssSelector("p>a[title='Previous']"));
	}
	
	public WebElement getProceedToCheckoutButton() {
		return driver.findElement(By.name("processAddress"));
	}
}
