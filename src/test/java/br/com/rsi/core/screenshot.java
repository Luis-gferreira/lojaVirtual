package br.com.rsi.core;

import static br.com.rsi.core.DriverCentralizado.getDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {

	@Rule
	public TestName testName = new TestName();
	@Test
	public static void deveCapturarTela(WebDriver getDriver) throws IOException {

		TakesScreenshot sst = (TakesScreenshot)getDriver();
		File arquivo = sst.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("screenshorts/" +
				 TestName.class.getName() + ".png"));
	}
}
