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
	
	public void adicionaCarrinho() throws InterruptedException {
//		WaitElementFw.visibilityOf(driver, informaProdutoAppObject.getCompartilharFacebook());
		informaProdutoAppObject.getQuantidadeFieldText().clear();
		informaProdutoAppObject.getQuantidadeFieldText().sendKeys("2");
		informaProdutoAppObject.getCorProdutoButton().click();
		informaProdutoAppObject.getAddToCartButton().click();
//		Thread.sleep(2000);
		WaitElementFw.visibilityOf(driver, informaProdutoAppObject.getProceedToCheckoutButton());
		informaProdutoAppObject.getProceedToCheckoutButton().click();
	}

}
