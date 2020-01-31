package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import appobjetcs.PersonalInformationAppObject;
import framework.utils.WaitElementFw;

public class PersonalInformationTask {
	
	private WebDriver driver;
	private PersonalInformationAppObject personalInformationApp;
	
	public PersonalInformationTask(WebDriver driver) {
		this.driver = driver;
		this.personalInformationApp = new PersonalInformationAppObject(driver);
	}
	
	public void informarDados() {
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

}
