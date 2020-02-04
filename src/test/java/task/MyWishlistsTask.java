package task;

import org.openqa.selenium.WebDriver;

import appobjetcs.MyWishlistsAppObjetc;

public class MyWishlistsTask {
	
	private WebDriver driver;
	private MyWishlistsAppObjetc myWishlists = new MyWishlistsAppObjetc(driver);
	
	public MyWishlistsTask(WebDriver driver) {
		this.driver = driver;
		this.myWishlists = new MyWishlistsAppObjetc(driver);
	}
	
	public void listaDesejo() {
		myWishlists.getNameFieldText().sendKeys("teste");
		myWishlists.getSaveButton().click();
	}

}
