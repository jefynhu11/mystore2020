package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import task.AuthenticationTask;
import task.HomeTask;
import task.MyAccountTask;
import task.MyWishlistsTask;

public class ListaDesejoTestCase extends BaseTestFw{

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private AuthenticationTask AuthenticationTask = new AuthenticationTask(driver);
	private MyAccountTask myAccountTask = new MyAccountTask(driver);
	private MyWishlistsTask myWishlists = new MyWishlistsTask(driver);
	
	@Before
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}
	
	@After
	public void tearDown() {
//		driver.quit();
	}
	
	@Test
	public void test() {
		homeTask.login();
		AuthenticationTask.existirConta();
		myAccountTask.ListaDesejo();
		myWishlists.listaDesejo();
		
	}
}
