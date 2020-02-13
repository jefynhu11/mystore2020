package framework.utils;

import static framework.utils.DriverManagerFactoryFw.quitDriver;
import static framework.utils.DriverManagerFactoryFw.setDriver;

import org.junit.After;
import org.openqa.selenium.WebDriver;

public class BaseTestFw {

	private WebDriver driver;
	
	public WebDriver getDriver() {
		this.driver = setDriver(DriverTypeFw.CHROME);
		return driver;
	}
	
	@After
	public void tearDown() {
//		quitDriver();
	}
}