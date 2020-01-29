package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import task.HomeTask;
import task.InformaProdutoTask;
import task.SignInTask;

public class RequiredTestCase extends BaseTestFw {

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private SignInTask signInTask = new SignInTask(driver);
	
	@Before
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void requiredConta() throws InterruptedException {
		homeTask.login();
		Thread.sleep(3000);
		signInTask.criarConta();
		Thread.sleep(3000);
		

	}
	
}
