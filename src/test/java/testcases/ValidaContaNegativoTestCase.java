package testcases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import task.AuthenticationTask;
import task.HomeTask;
import task.PersonalInformationTask;

public class ValidaContaNegativoTestCase extends BaseTestFw {

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
	private PersonalInformationTask personalInformationTask = new PersonalInformationTask(driver);
	
	@BeforeEach
	public void setUp() {
		this.driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/dados.csv")
	public void requiredConta(String email, String password) throws InterruptedException {
//		homeTask.login();
		authenticationTask.alreadyRegistered(email, password);
//		personalInformationTask.validarDados();
		Thread.sleep(3000);
	}
	
}
