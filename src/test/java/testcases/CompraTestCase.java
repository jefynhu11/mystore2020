package testcases;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import framework.utils.BaseTestFw;
import task.HomeTask;
import task.InformaProdutoTask;

public class CompraTestCase extends BaseTestFw{

	private WebDriver driver = getDriver();
	private HomeTask homeTask = new HomeTask(driver);
	private InformaProdutoTask informaProdutoTask = new InformaProdutoTask(driver); 
	
	@Before
	public void setUp() {
		this.driver.get("http://automationpractice.com");
	}

	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void test() throws InterruptedException {
		homeTask.obterProduto();
		Thread.sleep(2000);
		informaProdutoTask.adicionarCarrinho();
		Thread.sleep(2000);
		
//		String text = informaProdutoTask.adicionaCarrinho();
//		System.out.println(text);
	}

}
