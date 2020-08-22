package br.com.aprendaSeleniumComThiago.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;
import br.com.aprendaSeleniumComThiago.page.PageBasicFormDemo;
import br.com.aprendaSeleniumComThiago.page.PageHomeSeleniumEasy;
import br.com.aprendaSeleniumComThiago.util.Property;
import br.com.aprendaSeleniumComThiago.util.Utils;

public class TestSimpleBasicForm extends CoreBaseTest{
	
	
	@Test
	public void realizarPrimeiroTest() {
		//PageHomeSeleniumEasy homeSeleniumEasy = new PageHomeSeleniumEasy();
		//PageBasicFormDemo basicFormDemo = new PageBasicFormDemo();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("recursividade");
		driver.findElement(By.name("q")).submit();
		Assert.assertEquals("recursividade", driver.findElement(By.xpath("//*[@id=\"taw\"]/div[2]/div/p/a/b/i")).getText());
	}
		
		//homeSeleniumEasy.acessarTestSelenium("BASIC EXAMPLES TO START WITH SELENIUM");
		//Utils.takeScreenshot(driver, "realizarPrimeiroTeste", "1 - Acesso Pagina SimpleForm");
		//basicFormDemo.preencherMensagem("Thiago");
		//Utils.takeScreenshot(driver, "realizarPrimeiroTeste", "2 - preechendo texto");
		//basicFormDemo.clickEnviarMensagem();
		//Utils.takeScreenshot(driver, "realizarPrimeiroTeste", "3 - click");
		//basicFormDemo.validaMensagem("Thiago");
		//Utils.takeScreenshot(driver, "realizarPrimeiroTeste", "4 - validacao");//
	}

