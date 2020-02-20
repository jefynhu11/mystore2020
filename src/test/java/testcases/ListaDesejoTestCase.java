package testcases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import task.AuthenticationTask;
import task.HomeTask;
import task.MyAccountTask;
import task.MyWishlistsTask;

public class ListaDesejoTestCase extends BaseTestFw{

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
	private MyAccountTask myAccountTask = new MyAccountTask(driver);
	private MyWishlistsTask myWishlists = new MyWishlistsTask(driver);
	
	@BeforeEach
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}

	@ParameterizedTest
	@CsvFileSource(resources = "/dados.csv")
	public void listaDesejo(String email, String senha) {
		homeTask.homeAccessLogin();
		authenticationTask.alreadyRegistered(email, senha);
		myAccountTask.ListaDesejo();
		myWishlists.listaDesejo();
		
	}
}
