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
	
	public void adicionaCarrinho() {
//		informaProdutoAppObject.getSearchFieldText().sendKeys("lol");
//		informaProdutoAppObject.getQuantidadeFieldText().click();
//		WaitElementFw.visibilityOf(driver, informaProdutoAppObject.getCompartilharFacebook());
//		informaProdutoAppObject.getCompartilharFacebook().click();
//		informaProdutoAppObject.getQuantidadeFieldText().click();
		informaProdutoAppObject.getQuantidadeFieldText().clear();
		informaProdutoAppObject.getQuantidadeFieldText().sendKeys("2");
	}

}
