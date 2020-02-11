package task;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.github.javafaker.Faker;

import appobjetcs.PersonalInformationAppObject;
import framework.utils.WaitElementFw;

public class PersonalInformationTask {
	
	private WebDriver driver;
	private PersonalInformationAppObject personalInformationApp;
	Faker faker = new Faker();
	
	public PersonalInformationTask(WebDriver driver) {
		this.driver = driver;
		this.personalInformationApp = new PersonalInformationAppObject(driver);
	}

	String nome = faker.name().firstName();
	String sobrenome = faker.name().lastName();
	String senha = faker.internet().password();
	String address = faker.address().fullAddress();
	String city = faker.address().city();
	String MobilePhone = faker.phoneNumber().cellPhone();
	
	public void preenderDados() {
		WaitElementFw.visibilityOfElementLocated(driver, By.id("customer_firstname"));
//		ArrayList<DadosCSV> informaDados = new ArrayList<DadosCSV>();
//		informaDados.add(new DadosCSV(personalInformationApp.getFirstNameFieldText().sendKeys(nome),
//										personalInformationApp.getLastNameFieldText().sendKeys(sobrenome),
//											personalInformationApp.getPasswordFieldText().sendKeys(senha)));
		try {
//			FileWriter fileW = new FileWriter("dados.csv");
//			BufferedWriter buff = new BufferedWriter(fileW);
			PrintWriter pw = new PrintWriter("C:\\Users\\jeferson.lopes\\Desktop\\dados.csv");
			
//			buff.write("nome: " + nome);
//			buff.newLine();
//			buff.write("sobrenome: " + sobrenome);
//			buff.newLine();
//			buff.write("senha: " + senha);
//			buff.close();
			pw.println("nome: " + nome);
			pw.println("sobrenome: " + sobrenome);
			pw.println("senha: " + senha);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		personalInformationApp.getFirstNameFieldText().sendKeys(nome);
		personalInformationApp.getLastNameFieldText().sendKeys(sobrenome);
		personalInformationApp.getPasswordFieldText().sendKeys(senha);
		personalInformationApp.getAddressFielText().sendKeys(address);
		personalInformationApp.getCityFieldText().sendKeys(city);
		personalInformationApp.getStateSelect().selectByVisibleText("Colorado");
		personalInformationApp.getPostalFieldText().sendKeys("00000");
		personalInformationApp.getCountrySelect().selectByValue("21");
		personalInformationApp.getAdditionalInformationFieldArea().sendKeys("Mensagem de teste");
		personalInformationApp.getMobilePhoneFieldText().sendKeys(MobilePhone);
		personalInformationApp.getAssignAddressFieldText().clear();
		personalInformationApp.getAssignAddressFieldText().sendKeys("teste@teste.com");
		personalInformationApp.getRegisterButton().click();
		Assert.assertEquals(nome + " " + sobrenome, personalInformationApp.getNameAccountText().getText());
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
		
		personalInformationApp.getDaySelect().selectByValue("15");
//		Select day = new Select(personalInformationApp.getDaysButton());
//		day.selectByValue("15");
		personalInformationApp.getMonthSelect().selectByValue("11");
//		Select month = new Select(personalInformationApp.getMonthButton());
//		month.selectByValue("11");
		personalInformationApp.getYearSelect().selectByValue("1992");
//		Select year = new Select(personalInformationApp.getYearButton());
//		year.selectByValue("1992");
		
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
		
		personalInformationApp.getStateSelect().selectByValue("6");
//		Select state = new Select(personalInformationApp.getStateSelect());
//		state.selectByValue("6");
//		Assert.assertEquals("6", personalInformationApp.getStateSelect().getAttribute("value"));
		
		personalInformationApp.getPostalFieldText().sendKeys("00000");
		Assert.assertEquals("00000", personalInformationApp.getPostalFieldText().getAttribute("value"));
		
		personalInformationApp.getCountrySelect().selectByValue("21");
//		Select country = new Select(personalInformationApp.getCountrySelect());
//		country.selectByVisibleText("-");
//		country.selectByValue("21");
//		Assert.assertEquals("21", personalInformationApp.getCountrySelect().getAttribute("value"));
		
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
