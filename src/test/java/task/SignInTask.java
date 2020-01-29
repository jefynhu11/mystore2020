package task;

import org.openqa.selenium.WebDriver;

import appobjetcs.SignInAppObject;

public class SignInTask {

	private WebDriver driver;
	private SignInAppObject signInApp;
	
	public SignInTask(WebDriver driver) {
		this.driver = driver;
		this.signInApp = new SignInAppObject(driver);
	}
	
	public void criarConta() {
		signInApp.getCreateAccoutFieldText().sendKeys("asdqwe@asdqwe.com");
	}
}
