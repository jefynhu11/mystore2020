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
import task.ShippingTask;
import task.SummaryTask;
import task.InformaProdutoTask;
import task.PaymentTask;

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

	@After
	public void tearDown() {
		ScreenshotFw.takeViewpointShot(driver, "teste");
		driver.quit();
	}
	
	@Test
	public void test() {
		homeTask.obterProduto();
		informaProdutoTask.adicionarCarrinho();
		summaryTask.resumoComprar();
		authenticantionTask.existirConta("testes@testes.com", "testes");
		addressTask.adicionarMensagem();
		shippingTask.taxaEntregar();
		paymentTask.pagamentoBoleto();
	}

}