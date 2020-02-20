package br.com.rsi.core;

import static br.com.rsi.core.DriverCentralizado.getDriver;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;


public class ReusoTest {

	@Before
	public void inicializa() {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=identity");
		
	}

	@After
	public void finalizaTudo() throws IOException {
		screenshot.deveCapturarTela(getDriver());
		DriverCentralizado.killDriver();

	}

}
