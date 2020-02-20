package br.com.rsi.suits;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.rsi.tests.CadastroTest;
import br.com.rsi.tests.LoginTest;

@RunWith(Suite.class)
@SuiteClasses({
	CadastroTest.class,
	LoginTest.class
})
public class Suits {
	
}
