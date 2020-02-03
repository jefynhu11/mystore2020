package task;

import org.openqa.selenium.WebDriver;

import appobjetcs.ShippingAppObject;

public class ShippingTask {
	
	private WebDriver driver;
	private ShippingAppObject shippingApp;
	
	public ShippingTask(WebDriver driver) {
		this.driver = driver;
		this.shippingApp = new ShippingAppObject(driver);
	}
	
	public void taxaEntregar() {
		shippingApp.getTermsOfServiceButton().click();
		shippingApp.getProceedToCheckoutButton().click();
	}
	

}
