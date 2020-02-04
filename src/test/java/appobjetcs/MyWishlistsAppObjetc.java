package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyWishlistsAppObjetc {
	
	private WebDriver driver;
	
	public MyWishlistsAppObjetc(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getNameFieldText() {
		return driver.findElement(By.name("name"));
	}
	
	public WebElement getSaveButton() {
		return driver.findElement(By.id("submitWishlist"));
	}

}
