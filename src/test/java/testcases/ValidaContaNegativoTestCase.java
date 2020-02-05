package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import framework.utils.ScreenshotFw;
import gerar.GeraGeral;
import task.AuthenticationTask;
import task.HomeTask;
import task.PersonalInformationTask;

public class ValidaContaNegativoTestCase extends BaseTestFw {

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
	private PersonalInformationTask personalInformationTask = new PersonalInformationTask(driver);
	
	@Before
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}

	@After
	public void tearDown() {
		ScreenshotFw.takeViewpointShot(driver, "teste");
		driver.quit();
	}
	
	@Test
	public void requiredConta() {
		homeTask.login();
		authenticationTask.criarConta(GeraGeral.generatorLetraMinuscula(10)+ "@teste.com");
		personalInformationTask.validarDados();
	}
	
}
