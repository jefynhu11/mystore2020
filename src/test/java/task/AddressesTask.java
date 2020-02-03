package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appobjetcs.AddressesAppObject;
import framework.utils.WaitElementFw;

public class AddressesTask {

	private WebDriver driver;
	private AddressesAppObject addressApp;
	
	public AddressesTask(WebDriver driver) {
		this.driver = driver;
		this.addressApp = new AddressesAppObject(driver);
	}
	
	public void adicionarMensagem() {
		addressApp.getAdicionaMensagemAreaText().sendKeys("Não fica sem caixa e com segurança");
		addressApp.getProceedToCheckoutButton().click();
	}
	
	public void adicionaAddress() {
		addressApp.getAdicionaAddressButton().click();
	}
	
	public void continuaShopping() {
		addressApp.getContinueShoppingButton().click();
	}
	
	
}
