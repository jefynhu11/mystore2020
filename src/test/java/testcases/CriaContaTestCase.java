package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import framework.utils.ScreenshotFw;
import gerar.GeraGeral;
import task.HomeTask;
import task.PersonalInformationTask;
import task.AuthenticationTask;

public class CriaContaTestCase extends BaseTestFw {

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
	private PersonalInformationTask personalInformationTask = new PersonalInformationTask(driver);
	
	@Before
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}

	@Test
	public void criarConta() {
		homeTask.HomeAccessLogin();
		authenticationTask.criarConta(GeraGeral.generatorLetraMinuscula(10)+ "@teste.com");
		personalInformationTask.preenderDados();
	}
	
}
