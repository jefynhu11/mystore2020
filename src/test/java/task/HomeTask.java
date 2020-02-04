package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appobjetcs.HomeAppObject;
import framework.utils.WaitElementFw;

public class HomeTask {

	private WebDriver driver;
	private HomeAppObject homeApp;
	
	public HomeTask(WebDriver driver) {
		this.driver = driver;
		this.homeApp = new HomeAppObject(driver);
	}

	public void login() {
		homeApp.getLoginButton().click();
	}
	
	public void obterProduto() {
		WaitElementFw.InvisibilityOf(driver, homeApp.getObterProdutoButton());
		homeApp.getObterProdutoButton().click();
	}
	
}
