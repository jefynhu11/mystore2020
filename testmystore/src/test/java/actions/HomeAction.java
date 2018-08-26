package actions;

import org.openqa.selenium.WebDriver;

import markings.HomeMarkings;

public class HomeAction {
	private WebDriver driver;
	private HomeMarkings home;
	
	public HomeAction (WebDriver driver) {
		this.home = new HomeMarkings(driver);
	}
	
	public void ProdutoButton() {
		this.home.Produto().click();
	}
	
	public void AddButton() {
		this.home.Add().click();
	}
	
	public void ProceedButton() {
		this.home.Proceed().click();
	}
	
	public void ProceedCorret() {
		this.home.ProceedCorret().click();
	}
	
	public void Address() {
		this.home.Address().sendKeys("jefe592@hotmail.com");
	}
	
	public void AcessCreate() {
		this.home.AcessCreate().click();
	}
	
	public void Title() {
		this.home.Title().click();
	}
	
	public void FirstName() {
		this.home.FirstName().sendKeys("Jeferson");
	}
	
	public void LastName() {
		this.home.LastName().sendKeys("Lopes");
	}
	
	public void Email() {
		this.home.Email().click();
	}
	
	public void Password() {
		this.home.Password().sendKeys("123456");
	}
	
	public void Days() {
		this.home.Days().selectByValue("3");
	}
	
	public void Months() {
		this.home.Months().selectByValue("11");		
	}
	
	public void Years() {
		this.home.Years().selectByValue("1992");
	}
	
	public void Company() {
		this.home.Company().sendKeys("Quadra");
	}
	
	public void Endereço() {
		this.home.Endereço().sendKeys("Setor 1 Quadra N");
	}
	
	public void Endereços() {
		this.home.Endereços().sendKeys("Setor 1 Quadra N");
		}
	
	public void City() {
		this.home.City().sendKeys("Canoas");
	}
	
	public void State() {
		this.home.State().selectByValue("6");
	}
	
	public void Postal() {
		this.home.Postal().sendKeys("00000");
	}
	
	public void Country() {
		this.home.Country().selectByValue("21");
	}
	
	public void AddInf() {
		this.home.AddInf().sendKeys("Entrega segurança");
	}
	
	public void HomePhone() {
		this.home.HomePhone().sendKeys("999999999");
	}
	
	public void MobilePhone() {
		this.home.MobilePhone().sendKeys("999999999");
	}
	
	public void Assign() {
		this.home.Assign().clear();
		this.home.Assign().sendKeys("jefe@hotmail.com");
	}
	
	public void Resgister() {
		this.home.Resgister().click();
	}
	
	public void ProceedCheck() {
		this.home.ProceedCheck().click();
	}
	
	public void TermsService() {
		this.home.TermsService().click();
	}
	
	public void ProceedCheck1() {
		this.home.ProceedCheck1().click();
	}
	
	public void MetodoPagamento() {
		this.home.MetodoPagamento().click();
	}
	
	public void Confirm() {
		this.home.Confirm().click();
	}

}
