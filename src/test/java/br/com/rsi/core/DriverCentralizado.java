package br.com.rsi.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverCentralizado {

	private static WebDriver driver;

	private DriverCentralizado() {}

	public static WebDriver getDriver() {
		if (driver == null) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}

