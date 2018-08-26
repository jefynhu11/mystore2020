package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import actions.HomeAction;

public class HomeTest {
	private WebDriver driver;
	private HomeAction home;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		this.driver = new FirefoxDriver();
	    driver.get("http://automationpractice.com");
	  
	    this.home = new HomeAction(this.driver);
	}

	@Test
	public void test() throws InterruptedException {
		this.home.ProdutoButton();
		this.home.AddButton();
		Thread.sleep(2000);
		this.home.ProceedButton();
		this.home.ProceedCorret();
		this.home.Address();
		this.home.AcessCreate();
		Thread.sleep(2000);
		this.home.Title();
		this.home.FirstName();
		this.home.LastName();
		this.home.Email();
		this.home.Password();
		this.home.Days();
		this.home.Months();
		this.home.Years();
		this.home.Company();
		this.home.Endereço();
		this.home.Endereços();
		this.home.City();
		this.home.State();
		this.home.Postal();
		this.home.Country();
		this.home.AddInf();
		this.home.HomePhone();
		this.home.MobilePhone();
		this.home.Assign();
		this.home.Resgister();
		this.home.ProceedCheck();
		this.home.TermsService();
		this.home.ProceedCheck1();
		this.home.MetodoPagamento();
		this.home.Confirm();
	}
	
	@After
	public void sair() throws Exception {
		Thread.sleep(5000);
		this.driver.close();
	}
}