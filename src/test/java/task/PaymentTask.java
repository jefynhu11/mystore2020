package task;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		assertEquals("ORDER CONFIRMATION" , paymentApp.getCreditoMensagemSuccessText().getText());
	}
	
	public void pagamentoBoleto() {
		paymentApp.getPayByCheckButton().click();
		paymentApp.getIConfirmMyOrderButton().click();
		assertEquals("Your order on My Store is complete." , paymentApp.getBoletoMensagemSuccessText().getText());
	}
}
