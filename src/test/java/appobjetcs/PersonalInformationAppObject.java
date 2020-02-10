package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PersonalInformationAppObject {
	
	private WebDriver driver;
	
	public PersonalInformationAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getMrRadio() {
		return driver.findElement(By.id("uniform-id_gender1"));
	}
	
	public WebElement getMrsRadio() {
		return driver.findElement(By.id("uniform-id_gender2"));
	}

	public WebElement getFirstNameFieldText() {
		return driver.findElement(By.id("customer_firstname"));
	}
	
	public WebElement getLastNameFieldText() {
		return driver.findElement(By.id("customer_lastname"));
	}
	
	public WebElement getEmailFieldText() {
		return driver.findElement(By.id("email"));
	}

	public WebElement getPasswordFieldText() {
		return driver.findElement(By.id("passwd"));
	}
	
	public Select getDaySelect() {
		return new Select(driver.findElement(By.id("days")));
	}
	
//	public WebElement getDaysButton() {
//		return driver.findElement(By.id("days"));
//	}
	
	public Select getMonthSelect() {
		return new Select(driver.findElement(By.id("months")));
	}
	
//	public WebElement getMonthButton() {
//		return driver.findElement(By.id("months"));
//	}
	
	public Select getYearSelect() {
		return new Select(driver.findElement(By.id("years")));
	}
	
//	public WebElement getYearButton() {
//		return driver.findElement(By.id("years"));
//	}
	
	public WebElement getNewsletterCheckBox() {
		return driver.findElement(By.id("newsletter"));
	}
	
	public WebElement getReceiveCheckBox() {
		return driver.findElement(By.id("uniform-optin"));
	}
	
	public WebElement getNameAddressFieldText() {
		return driver.findElement(By.id("firstname"));
	}
	
	public WebElement getLastNameAddressFieldText() {
		return driver.findElement(By.id("lastname"));
	}
	
	public WebElement getCompanyFieldText() {
		return driver.findElement(By.id("company"));
	}
	
	public WebElement getAddressFielText() {
		return driver.findElement(By.id("address1"));
	}
	
	public WebElement getAddress2FielText() {
		return driver.findElement(By.id("address2"));
	}
	
	public WebElement getCityFieldText() {
		return driver.findElement(By.id("city"));
	}
	
	public Select getStateSelect() {
		return new Select(driver.findElement(By.id("id_state")));
	}
	
//	public WebElement getStateSelect() {
//		return driver.findElement(By.id("id_state"));
//	}
	
	public WebElement getPostalFieldText() {
		return driver.findElement(By.id("postcode"));
	}
	
	public Select getCountrySelect() {
		return new Select(driver.findElement(By.id("id_country")));
	}
	
//	public WebElement getCountrySelect() {
//		return driver.findElement(By.id("id_country"));
//	}
	
	public WebElement getAdditionalInformationFieldArea() {
		return driver.findElement(By.id("other"));
	}
	
	public WebElement getPhoneFieldText() {
		return driver.findElement(By.id("phone"));
	}
	
	public WebElement getMobilePhoneFieldText() {
		return driver.findElement(By.id("phone_mobile"));
	}
	
	public WebElement getAssignAddressFieldText() {
		return driver.findElement(By.id("alias"));
	}
	
	public WebElement getRegisterButton() {
		return driver.findElement(By.id("submitAccount"));
	}
	
	public WebElement getNameAccountText() {
		return driver.findElement(By.cssSelector("a.account span"));
	}

}
