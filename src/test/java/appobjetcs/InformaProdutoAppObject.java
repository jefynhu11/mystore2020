package appobjetcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformaProdutoAppObject {

	private WebDriver driver;
	
	public InformaProdutoAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSearchFieldText() {
		return driver.findElement(By.id("search_query_top"));
	}
	
	public WebElement getObterNomeText() {
		return driver.findElement(By.cssSelector("h1[itemprop='name']"));
	}
	
	public WebElement getQuantidadeFieldText() {
//		return driver.findElement(By.id("quantity_wanted"));
		return driver.findElement(By.cssSelector("p[id='quantity_wanted_p'] > input"));
	}
	
	public WebElement getCorProdutoButton() {
		return driver.findElement(By.id("color_8"));
	}
	
	public WebElement getAddToCartButton() {
		return driver.findElement(By.name("Submit"));
	}
	
	public WebElement getProceedToCheckoutButton() {
		return driver.findElement(By.cssSelector("a.button-medium"));
	}
	
	public WebElement getCompartilharFacebook() {
		return driver.findElement(By.cssSelector("p.socialsharing_product > button.btn-facebook"));
	}
}
