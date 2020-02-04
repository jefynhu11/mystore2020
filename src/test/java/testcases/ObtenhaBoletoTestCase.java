package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import task.AuthenticationTask;
import task.HomeTask;
import task.MyAccountTask;
import task.ObtenhaHistoryTask;

public class ObtenhaBoletoTestCase extends BaseTestFw {

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
	private MyAccountTask myAccountTask = new MyAccountTask(driver);
	private ObtenhaHistoryTask orderHistoryTask = new ObtenhaHistoryTask(driver);
	
	@Before
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void test() {
		homeTask.login();
		authenticationTask.existirConta();
		myAccountTask.obterBoleto();
		orderHistoryTask.obterPDF();
	}
}