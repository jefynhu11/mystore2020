package framework.utils;

import static framework.utils.DriverManagerFactoryFw.setDriver;

import org.openqa.selenium.WebDriver;

public class BaseTestFw {

	private WebDriver driver;
	
	public WebDriver getDriver() {
		this.driver = setDriver(DriverTypeFw.CHROME);
		return driver;
	}
}