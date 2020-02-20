package br.com.rsi.tests;

import static br.com.rsi.core.DriverCentralizado.getDriver;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import br.com.rsi.core.ResultTest;
import br.com.rsi.core.ReusoTest;
import br.com.rsi.pages.Login;
public class LoginTest extends ReusoTest {

	static Login page;
	static ResultTest result;

	@Before
	public void setUp() {
		page = new Login();
		result = new ResultTest();
	}

	@Test
	public void test() throws InterruptedException, IOException {
		page.deveEfetuarLoginComSucesso(getDriver());
		result.extentExecute(getDriver());
	}

}
