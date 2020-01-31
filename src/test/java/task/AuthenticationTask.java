package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appobjetcs.AuthenticationAppObject;
import framework.utils.WaitElementFw;
import gerar.GerarGeral;

public class AuthenticationTask {

	private WebDriver driver;
	private AuthenticationAppObject AuthenticationApp;
	
	public AuthenticationTask(WebDriver driver) {
		this.driver = driver;
		this.AuthenticationApp = new AuthenticationAppObject(driver);
	}
	
	public void criarConta() throws InterruptedException {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("email_create"));
		AuthenticationApp.getEmailCreateFieldText().sendKeys(GerarGeral.generatorLetraMinuscula(10)+ "@teste.com");
		Thread.sleep(3000);
		AuthenticationApp.getCreateAccoutButton().click();
	}
	
	public void existirConta() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("email"));
		AuthenticationApp.getEmailFieldText().sendKeys("teste@teste.com");
		AuthenticationApp.getPasswordFieldText().sendKeys("teste");
		AuthenticationApp.getSignInButton().click();
	}
}
