package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import framework.utils.ScreenshotFw;
import task.AddressesTask;
import task.AuthenticationTask;
import task.HomeTask;
import task.InformaProdutoTask;
import task.PaymentTask;
import task.ShippingTask;
import task.SummaryTask;

public class CompraTestCase extends BaseTestFw{

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private InformaProdutoTask informaProdutoTask = new InformaProdutoTask(driver);
	private SummaryTask summaryTask = new SummaryTask(driver);
	private AuthenticationTask authenticantionTask = new AuthenticationTask(driver);
	private AddressesTask addressTask = new AddressesTask(driver);
	private ShippingTask shippingTask = new ShippingTask(driver);
	private PaymentTask paymentTask = new PaymentTask(driver);
	
	@Before
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}

//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	WebElement element = driver.findElement(By.id("elementosForm:nome"));
//	js.executeScript("arguments[0].style.border = arguments[1]", element, "solid 4px red");
	
	@Test
	public void comprarProduto() {
		homeTask.obterProduto();
		informaProdutoTask.adicionarCarrinho();
		summaryTask.resumoComprar();
		authenticantionTask.alreadyRegistered("testes@testes.com", "teste");
//		addressTask.adicionarMensagem();
//		shippingTask.taxaEntregar();
//		paymentTask.pagamentoBoleto();
	}

}