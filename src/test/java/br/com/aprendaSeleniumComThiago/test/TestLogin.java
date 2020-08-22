package br.com.aprendaSeleniumComThiago.test;

import org.junit.Test;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;
import br.com.aprendaSeleniumComThiago.page.PageLogin;


public class TestLogin extends CoreBaseTest{
	
	@Test 
	public void testeLogin() {
		PageLogin login = new PageLogin();
		driver.navigate().to("http://demo.guru99.com/test/login.html");
		login.fazerLogin("amanda@gmail.com", "1234aa");
		login.obterResposta();
	}

	
}

