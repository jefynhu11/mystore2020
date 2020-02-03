package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import appobjetcs.AuthenticationAppObject;
import framework.utils.WaitElementFw;
import gerar.GeraGeral;

public class AuthenticationTask {

	private WebDriver driver;
	private AuthenticationAppObject AuthenticationApp;
	
	public AuthenticationTask(WebDriver driver) {
		this.driver = driver;
		this.AuthenticationApp = new AuthenticationAppObject(driver);
	}
	
	public void criarConta() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("email_create"));
		AuthenticationApp.getEmailCreateFieldText().sendKeys(GeraGeral.generatorLetraMinuscula(10)+ "@teste.com");
		AuthenticationApp.getCreateAccoutButton().click();
	}
	
	public void existirConta() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("email"));
		AuthenticationApp.getEmailFieldText().sendKeys("testes@testes.com");
		AuthenticationApp.getPasswordFieldText().sendKeys("testes");
		AuthenticationApp.getSignInButton().click();
	}
}
