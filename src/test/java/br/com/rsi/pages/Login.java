package br.com.rsi.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public void deveEfetuarLoginComSucesso(WebDriver getDriver) throws InterruptedException{
		getDriver.findElement(By.id("email")).sendKeys("Caio@gmail.com");
		getDriver.findElement(By.id("passwd")).sendKeys("12345");
		getDriver.findElement(By.id("SubmitLogin")).click();
		WebDriverWait wait = new WebDriverWait(getDriver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("info-account")));
		
		Assert.assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.", 
				getDriver.findElement(By.className("info-account")).getText());
	}
}
