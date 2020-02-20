package br.com.rsi.tests;

import static br.com.rsi.core.DriverCentralizado.getDriver;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import br.com.rsi.core.ReusoTest;
import br.com.rsi.pages.CadastroPage;

public class CadastroTest extends ReusoTest {

	static CadastroPage page;

	@Before
	public void inicia(){
		page = new CadastroPage();
	}

	@Test
	public void deveEfetuarCadastro() throws InterruptedException, IOException{
		page.deveCadastrarComSucesso(getDriver());
	}
}
