package framework.utils;

import static framework.utils.DriverManagerFactoryFw.quitDriver;
import static framework.utils.DriverManagerFactoryFw.setDriver;

import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;

public class BaseTestFw {

	private WebDriver driver;
	
	public WebDriver getDriver() {
		this.driver = setDriver(DriverTypeFw.CHROME);
		return driver;
	}
	
	@AfterAll
	public static void tearDown() {
		quitDriver();
	}
}