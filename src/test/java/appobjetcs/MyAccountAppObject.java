package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountAppObject {

	private WebDriver driver;
	
	public MyAccountAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getOrderHistoryButton() {
		return driver.findElement(By.cssSelector("a[title='Orders']"));
	}
	
	public WebElement getMyCreditButton() {
		return driver.findElement(By.cssSelector("a[title='Credit slips']"));
	}
	
	public WebElement getMyAddressesButton() {
		return driver.findElement(By.cssSelector("a[title='Addresses']"));
	}
	
	public WebElement getMyPersonalButton() {
		return driver.findElement(By.cssSelector("a[title='Information']"));
	}
	
	public WebElement getMyWishlistsButton() {
		return driver.findElement(By.cssSelector("a[title='My wishlists']"));
	}
	
}
