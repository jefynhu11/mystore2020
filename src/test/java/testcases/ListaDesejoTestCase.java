package testcases;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import framework.utils.ScreenshotFw;
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
	
	@Before
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}
	
	@Test
	public void test() {
		homeTask.homeAccessLogin();
		authenticationTask.alreadyRegistered("testes@testes.com", "testes");
		myAccountTask.ListaDesejo();
		myWishlists.listaDesejo();
		
	}
}
