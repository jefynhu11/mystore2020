package task;

import org.openqa.selenium.WebDriver;

import appobjetcs.SummaryAppObject;

public class SummaryTask {
	private WebDriver driver;
	private SummaryAppObject summaryTask;
	
	public SummaryTask(WebDriver driver) {
		this.driver = driver;
		this.summaryTask = new SummaryAppObject(driver);
	}
	
	public void resumoComprar() {
		summaryTask.getMenosProdutoButton().click();
		summaryTask.getProceedToCheckoutButton().click();
	}

}
