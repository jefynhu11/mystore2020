package task;

import org.openqa.selenium.WebDriver;

import appobjetcs.ObtenhaHistoryAppObject;

public class ObtenhaHistoryTask {

	private WebDriver driver;
	private ObtenhaHistoryAppObject orderHistoryApp;
	
	public ObtenhaHistoryTask(WebDriver driver) {
		this.driver = driver;
		this.orderHistoryApp = new ObtenhaHistoryAppObject(driver);
	}
	
	public void obterPDF() {
		orderHistoryApp.getInvoicePDFButton().click();
	}
}
