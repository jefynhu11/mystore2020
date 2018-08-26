package markings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomeMarkings {
	private final WebDriver driver;
	
	public HomeMarkings (WebDriver driver) {
		this.driver = driver;
	}
		
	public WebElement Produto() {
		return this.driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[2]/div/div[2]/h5/a"));
	}
		
	public WebElement Add() {
		return this.driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button"));
	}
	
	public WebElement Proceed() {
		return this.driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
	}
	
	public WebElement ProceedCorret() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
	}
	
	public WebElement Address() {
		return this.driver.findElement(By.id("email_create"));
	}
	
	public WebElement AcessCreate() {
		return this.driver.findElement(By.id("SubmitCreate"));
	}
	
	public WebElement Title() {
		return this.driver.findElement(By.id("id_gender1"));
	}
	
	public WebElement FirstName() {
		return this.driver.findElement(By.id("customer_firstname"));
	}
	
	public WebElement LastName() {
		return this.driver.findElement(By.id("customer_lastname"));
	}
	
	public WebElement Email() {
		return this.driver.findElement(By.id("email"));
	}
	
	public WebElement Password() {
		return this.driver.findElement(By.id("passwd"));
	}
	
	public Select Days() {
		Select selectDay = new Select(this.driver.findElement(By.id("days")));
		return selectDay;
	}
	
	public Select Months() {
		Select selectMonth = new Select(this.driver.findElement(By.id("months")));
		return selectMonth;
	}
	
	public Select Years() {
		Select selectYear = new Select(this.driver.findElement(By.id("years")));
		return selectYear;
	}
	
	public WebElement FName() {
		return this.driver.findElement(By.id("firstname"));
	}
	
	public WebElement LName() {
		return this.driver.findElement(By.id("lastname"));
	}
	
	public WebElement Company() {
		return this.driver.findElement(By.id("company"));
	}
	
	public WebElement Endereço() {
		return this.driver.findElement(By.id("address1"));
	}
	
	public WebElement Endereços() {
		return this.driver.findElement(By.id("address2"));
	}
	
	public WebElement City() {
		return this.driver.findElement(By.id("city"));
	}
	
	public Select State() {
		Select selectState = new Select(this.driver.findElement(By.id("id_state")));
		return selectState;
	}
	
	public WebElement Postal() {
		return this.driver.findElement(By.id("postcode"));
	}
	
	public Select Country() {
		Select selectCountry = new Select(this.driver.findElement(By.id("id_country")));
		return selectCountry;
	}
	
	public WebElement AddInf() {
		return this.driver.findElement(By.id("other"));
	}
	
	public WebElement HomePhone() {
		return this.driver.findElement(By.id("phone"));
	}
	
	public WebElement MobilePhone() {
		return this.driver.findElement(By.id("phone_mobile"));
	}
	
	public WebElement Assign() {
		return this.driver.findElement(By.id("alias"));
	}
	
	public WebElement Resgister() {
		return this.driver.findElement(By.id("submitAccount"));
	}
	
	public WebElement ProceedCheck() {
		return this.driver.findElement(By.name("processAddress"));
	}
	
	public WebElement TermsService() {
		return this.driver.findElement(By.id("cgv"));
	}
	
	public WebElement ProceedCheck1() {
		return this.driver.findElement(By.name("processCarrier"));
	}
	
	public WebElement MetodoPagamento() {
		return this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a"));
	}
	
	public WebElement Confirm() {
		return this.driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button"));
	}
}