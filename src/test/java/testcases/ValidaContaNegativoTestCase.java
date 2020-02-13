package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import framework.utils.ScreenshotFw;
import gerar.GeraGeral;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import task.AuthenticationTask;
import task.HomeTask;
import task.PersonalInformationTask;

@RunWith(JUnitParamsRunner.class)
public class ValidaContaNegativoTestCase extends BaseTestFw {

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
	private PersonalInformationTask personalInformationTask = new PersonalInformationTask(driver);
	
	@Before
	public void setUp() {
		this.driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@Test
	@FileParameters("src/test/resources/dados.csv")
	public void requiredConta(String email, String password) throws InterruptedException {
//		homeTask.login();
		authenticationTask.alreadyRegistered(email, password);
//		personalInformationTask.validarDados();
		Thread.sleep(3000);
	}
	
}
