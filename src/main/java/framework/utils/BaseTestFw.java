package framework.utils;

import static framework.utils.DriverManagerFactoryFw.quitDriver;
import static framework.utils.DriverManagerFactoryFw.setDriver;

import org.openqa.selenium.WebDriver;

public class BaseTestFw {

	private static WebDriver driver;
	
	public WebDriver getDriver() {
		this.driver = setDriver(DriverTypeFw.CHROME);
		return driver;
	}
}