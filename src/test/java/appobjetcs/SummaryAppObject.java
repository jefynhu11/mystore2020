package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SummaryAppObject {

	private WebDriver driver;
	
	public SummaryAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNumeroProdutoFieldText() {
		return driver.findElement(By.cssSelector("input.cart_quantity_input"));
	}
	
	public WebElement getMenosProdutoButton() {
		return driver.findElement(By.cssSelector("a.button-minus"));
	}
	
	public WebElement getMaisProdutoButton() {
		return driver.findElement(By.cssSelector("a.button-plus"));
	}
	
	public WebElement getDeleteProdutoButton() {
		return driver.findElement(By.cssSelector("a.cart_quantity_delete"));
	}
	
	public WebElement getContinueShoppingButton() {
		return driver.findElement(By.cssSelector("a.button-exclusive"));
	}
	
	public WebElement getProceedToCheckoutButton() {
		return driver.findElement(By.cssSelector("p>a.button-medium"));
	}
}
