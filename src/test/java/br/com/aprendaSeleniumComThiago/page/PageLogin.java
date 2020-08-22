package br.com.aprendaSeleniumComThiago.page;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.aprendaSeleniumComThiago.core.CoreDriver;


public class PageLogin{

	protected WebDriver driver;
	public PageLogin() {
		this.driver = CoreDriver.getDriver();
		PageFactory.initElements(CoreDriver.getDriver(), this);
	}
	
	@FindBy (id = "email")
	private WebElement insertEmail;
	
	@FindBy (id = "passwd")
	private WebElement insertSenha;
	
	@FindBy (xpath = "//p[@class='submit']//span[1]")
	private WebElement clicarEntrar;
	
	@FindBy (xpath = "//h3[contains(text(),'Successfully Logged in...')]")
	private WebElement obterResposta;
	
	public void fazerLogin(String email, String senha) {
		insertEmail.sendKeys(email);
		insertSenha.sendKeys(senha);
		clicarEntrar.click();	
	}
	
	public void obterResposta() {
		Assert.assertEquals("Successfully Logged in...", obterResposta.getText());
	}
	
}
