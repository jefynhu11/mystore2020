package task;

import org.openqa.selenium.WebDriver;

import appobjetcs.PaymentAppObject;

public class PaymentTask {

	private WebDriver driver;
	private PaymentAppObject paymentApp;
	
	public PaymentTask(WebDriver driver) {
		this.driver = driver;
		this.paymentApp = new PaymentAppObject(driver);
	}
	
	public void pagamentoCredito() {
		paymentApp.getPayByBankWireButton().click();
		paymentApp.getIConfirmMyOrderButton().click();
	}
	
	public void pagamentoBoleto() {
		paymentApp.getPayByCheckButton().click();
		paymentApp.getIConfirmMyOrderButton().click();
	}
}
