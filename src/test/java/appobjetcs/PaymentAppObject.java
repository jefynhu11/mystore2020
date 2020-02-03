package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentAppObject {
	
	private WebDriver driver;
	
	public PaymentAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getPayByBankWireButton() {
		return driver.findElement(By.cssSelector("a.bankwire"));
	}
	
	public WebElement getPayByCheckButton() {
		return driver.findElement(By.cssSelector("a.cheque"));
	}
	
	public WebElement getContinueShoppingButton() {
		return driver.findElement(By.cssSelector("a.button-exclusive"));
	}
	
	public WebElement getIConfirmMyOrderButton() {
		return driver.findElement(By.cssSelector("button.button-medium"));
	}

}
