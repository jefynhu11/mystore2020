package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
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

	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void criarConta() throws InterruptedException {
		homeTask.login();
		authenticationTask.criarConta();
		personalInformationTask.preenderDados();
	}
	
}
