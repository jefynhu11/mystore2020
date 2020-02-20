package testcases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
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
	
	@BeforeEach
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/dados.csv")
	public void obterBoleto(String email, String senha) {
		homeTask.homeAccessLogin();
		authenticationTask.alreadyRegistered(email, senha);
		myAccountTask.obterBoleto();
		orderHistoryTask.obterPDF();
	}
}
