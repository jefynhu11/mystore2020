package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ObtenhaHistoryAppObject {

	private WebDriver driver;
	
	public ObtenhaHistoryAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getInvoicePDFButton() {
		return driver.findElement(By.cssSelector("tr.first_item td.history_invoice a.link-button"));
	}
}
