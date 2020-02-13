package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import task.AuthenticationTask;
import task.HomeTask;
import task.MyAccountTask;
import task.MyWishlistsTask;

@RunWith(JUnitParamsRunner.class)
public class ListaDesejoTestCase extends BaseTestFw{

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private AuthenticationTask authenticationTask = new AuthenticationTask(driver);
	private MyAccountTask myAccountTask = new MyAccountTask(driver);
	private MyWishlistsTask myWishlists = new MyWishlistsTask(driver);
	
	@Before
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}
	
	@Test
	@FileParameters("src/test/resources/dados.csv")
	public void listaDesejo(String email, String senha) {
		homeTask.homeAccessLogin();
		authenticationTask.alreadyRegistered(email, senha);
		myAccountTask.ListaDesejo();
		myWishlists.listaDesejo();
		
	}
}
