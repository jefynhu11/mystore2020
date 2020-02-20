package testcases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import gerar.GeraGeral;
import task.AuthenticationTask;
import task.HomeTask;
import task.PersonalInformationTask;

public class CriaContaTestCase extends BaseTestFw {

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
	private PersonalInformationTask personalInformationTask = new PersonalInformationTask(driver);
	
	@BeforeEach
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}
 
	@Test
	public void criarConta() {
		homeTask.homeAccessLogin();
		authenticationTask.criarConta(GeraGeral.generatorLetraMinuscula(10)+ "@teste.com");
		personalInformationTask.preenderDados();
	}
	
}
