package br.com.aprendaSeleniumComThiago.page;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.aprendaSeleniumComThiago.core.CoreDriver;


public class PageDeleteCustomer{

	protected WebDriver driver;
	public PageDeleteCustomer() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}

	@FindBy (xpath = "//input[@name='cusid']")
	private WebElement id;
	
	@FindBy (xpath = "//input[@name='submit']")
	private WebElement submit;
	
	
	public void insertId(String valor) {
		id.sendKeys(valor);
	}
	
	
	public void clicar() {
		submit.click();
	}
	
	
	public void validarAlerta() {
		Alert alerta=driver.switchTo().alert();
		Assert.assertEquals("Do you really want to delete this Customer?", alerta.getText());
		alerta.accept();
		Assert.assertEquals("Customer Successfully Delete!", alerta.getText());
		alerta.accept();
		
	}
	
}
