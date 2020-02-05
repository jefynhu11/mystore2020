package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeAppObject {
	
	private WebDriver driver;
	
	public HomeAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getSearchProdutoFieldText() {
		return driver.findElement(By.id("search_query_top"));
	}
	
	public WebElement getLoginButton() {
		return driver.findElement(By.cssSelector("a.login"));
	}
	
	public WebElement getObterProdutoButton() {
//		return driver.findElement(By.cssSelector("#homefeatured li.ajax_block_product div div div a[title='Blouse']"));
		return driver.findElement(By.cssSelector("#homefeatured li.ajax_block_product a.product_img_link img[title='Blouse']"));
//		return driver.findElement(By.cssSelector("#homefeatured li:nth-child(2) div.left-block"));
//		return driver.findElement(By.cssSelector("#homefeatured li:nth-child(2) div.left-block a.quick-view"));
	}
}
