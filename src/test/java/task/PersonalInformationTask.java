package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import appobjetcs.PersonalInformationAppObject;
import framework.utils.WaitElementFw;

public class PersonalInformationTask {
	
	private WebDriver driver;
	private PersonalInformationAppObject personalInformationApp;
	
	public PersonalInformationTask(WebDriver driver) {
		this.driver = driver;
		this.personalInformationApp = new PersonalInformationAppObject(driver);
	}
	
	public void preenderDados() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("uniform-id_gender1"));
		personalInformationApp.getMrRadio().click();
		personalInformationApp.getFirstNameFieldText().sendKeys("Jeferson");
		personalInformationApp.getLastNameFieldText().sendKeys("Lopes Eugenio");
		personalInformationApp.getPasswordFieldText().sendKeys("testes");
		Select day = new Select(personalInformationApp.getDaysButton());
		day.selectByValue("15");
		Select month = new Select(personalInformationApp.getMonthButton());
		month.selectByValue("11");
		Select year = new Select(personalInformationApp.getYearButton());
		year.selectByValue("1992");
		personalInformationApp.getNewsletterCheckBox().click();
		personalInformationApp.getReceiveCheckBox().click();
		personalInformationApp.getCompanyFieldText().sendKeys("fulano");
		personalInformationApp.getAddressFielText().sendKeys("Assis Brasil");
		personalInformationApp.getAddress2FielText().sendKeys("Farrapos");
		personalInformationApp.getCityFieldText().sendKeys("Porto Alegre");
		Select state = new Select(personalInformationApp.getStateSelect());
		state.selectByVisibleText("Colorado");
		personalInformationApp.getPostalFieldText().sendKeys("00000");
		Select country = new Select(personalInformationApp.getCountrySelect());
//		country.selectByVisibleText("-");
		country.selectByValue("21");
		personalInformationApp.getAdditionalInformationFieldArea().sendKeys("Mensagem de teste");
		personalInformationApp.getPhoneFieldText().sendKeys("338645312");
		personalInformationApp.getMobilePhoneFieldText().sendKeys("978654123");
		personalInformationApp.getAssignAddressFieldText().clear();
		personalInformationApp.getAssignAddressFieldText().sendKeys("teste@teste.com");
		personalInformationApp.getRegisterButton().click();
	}

	public void validarDados() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("uniform-id_gender1"));
		personalInformationApp.getMrRadio().click();
		
		personalInformationApp.getFirstNameFieldText().sendKeys("Jeferson");
		Assert.assertEquals("Jeferson", personalInformationApp.getFirstNameFieldText().getAttribute("value"));
		
		personalInformationApp.getLastNameFieldText().sendKeys("Lopes Eugenio");
		Assert.assertEquals("Lopes Eugenio", personalInformationApp.getLastNameFieldText().getAttribute("value"));
		
		personalInformationApp.getPasswordFieldText().sendKeys("testes");
		Assert.assertEquals("testes", personalInformationApp.getPasswordFieldText().getAttribute("value"));
		
		Select day = new Select(personalInformationApp.getDaysButton());
		day.selectByValue("15");
		Select month = new Select(personalInformationApp.getMonthButton());
		month.selectByValue("11");
		Select year = new Select(personalInformationApp.getYearButton());
		year.selectByValue("1992");
		
//		personalInformationApp.getNewsletterCheckBox().click();
//		personalInformationApp.getReceiveCheckBox().click();
		
		Assert.assertEquals(personalInformationApp.getFirstNameFieldText().getAttribute("value"), personalInformationApp.getNameAddressFieldText().getAttribute("value"));
		Assert.assertEquals(personalInformationApp.getLastNameFieldText().getAttribute("value"), personalInformationApp.getLastNameAddressFieldText().getAttribute("value"));
		
//		personalInformationApp.getCompanyFieldText().sendKeys("fulano");
		
		personalInformationApp.getAddressFielText().sendKeys("Assis Brasil");
		Assert.assertEquals("Assis Brasil", personalInformationApp.getAddressFielText().getAttribute("value"));
		
//		personalInformationApp.getAddress2FielText().sendKeys("Farrapos");
		
		personalInformationApp.getCityFieldText().sendKeys("Porto Alegre");
		Assert.assertEquals("Porto Alegre", personalInformationApp.getCityFieldText().getAttribute("value"));
		
		Select state = new Select(personalInformationApp.getStateSelect());
		state.selectByValue("6");
		Assert.assertEquals("6", personalInformationApp.getStateSelect().getAttribute("value"));
		
		personalInformationApp.getPostalFieldText().sendKeys("00000");
		Assert.assertEquals("00000", personalInformationApp.getPostalFieldText().getAttribute("value"));
		
		Select country = new Select(personalInformationApp.getCountrySelect());
//		country.selectByVisibleText("-");
		country.selectByValue("21");
		Assert.assertEquals("21", personalInformationApp.getCountrySelect().getAttribute("value"));
		
//		personalInformationApp.getAdditionalInformationFieldArea().sendKeys("Mensagem de teste");
//		personalInformationApp.getPhoneFieldText().sendKeys("338645312");
		
		personalInformationApp.getMobilePhoneFieldText().sendKeys("978654123");
		Assert.assertEquals("978654123", personalInformationApp.getMobilePhoneFieldText().getAttribute("value"));
		
		personalInformationApp.getAssignAddressFieldText().clear();
		personalInformationApp.getAssignAddressFieldText().sendKeys("teste@teste.com");
		Assert.assertEquals("teste@teste.com", personalInformationApp.getAssignAddressFieldText().getAttribute("value"));
		
		personalInformationApp.getRegisterButton().click();
	}
	
}
