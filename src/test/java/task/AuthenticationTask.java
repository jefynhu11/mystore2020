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
	
	public void criarConta(String email) {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("email_create"));
		AuthenticationApp.getEmailCreateFieldText().sendKeys(email);
		AuthenticationApp.getCreateAccoutButton().click();
	}
	
	public void existirConta(String email, String password) {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("email"));
		AuthenticationApp.getEmailFieldText().sendKeys(email);
		AuthenticationApp.getPasswordFieldText().sendKeys(password);
		AuthenticationApp.getSignInButton().click();
	}
}
