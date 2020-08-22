package br.com.aprendaSeleniumComThiago.test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import br.com.aprendaSeleniumComThiago.core.CoreBaseTest;
import br.com.aprendaSeleniumComThiago.page.PageBasicFormDemo;
import br.com.aprendaSeleniumComThiago.page.PageDeleteCustomer;
import br.com.aprendaSeleniumComThiago.page.PageHomeSeleniumEasy;
import br.com.aprendaSeleniumComThiago.util.Property;
import br.com.aprendaSeleniumComThiago.util.Utils;

public class TestDeleteCustomer extends CoreBaseTest{
	
	
	@Test
	public void deleteCustomer() {
		PageDeleteCustomer deleteCustomer=new PageDeleteCustomer();
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		deleteCustomer.insertId("123456");
		deleteCustomer.clicar();
		//deleteCustomer.validarAlerta();
	}
	
}

