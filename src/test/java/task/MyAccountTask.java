package task;

import org.openqa.selenium.WebDriver;

import appobjetcs.MyAccountAppObject;

public class MyAccountTask {

	private WebDriver driver;
	private MyAccountAppObject myAccountApp;
	
	public MyAccountTask(WebDriver driver) {
		this.driver = driver;
		this.myAccountApp = new MyAccountAppObject(driver);
	}
	
	public void obterBoleto() {
		myAccountApp.getOrderHistoryButton().click();		
	}
	
	public void ListaDesejo() {
		myAccountApp.getMyWishlistsButton().click();
	}
}
