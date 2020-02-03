package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appobjetcs.InformaProdutoAppObject;
import framework.utils.WaitElementFw;

public class InformaProdutoTask {
	
	private WebDriver driver;
	private InformaProdutoAppObject informaProdutoAppObject;
	
	public InformaProdutoTask(WebDriver driver) {
		this.driver = driver;
		this.informaProdutoAppObject = new InformaProdutoAppObject(driver);
	}
	
	public void adicionarCarrinho() {
		WaitElementFw.visibilityOfElementLocated(driver, By.cssSelector("p[id='quantity_wanted_p'] > input"));
		informaProdutoAppObject.getQuantidadeFieldText().clear();
		informaProdutoAppObject.getQuantidadeFieldText().sendKeys("2");
		informaProdutoAppObject.getCorProdutoButton().click();
		informaProdutoAppObject.getAddToCartButton().click();
		WaitElementFw.visibilityOf(driver, informaProdutoAppObject.getProceedToCheckoutButton());
		informaProdutoAppObject.getProceedToCheckoutButton().click();
	}

}
