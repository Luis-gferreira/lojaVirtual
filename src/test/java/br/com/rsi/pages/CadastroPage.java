package br.com.rsi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPage {

	public void  deveCadastrarComSucesso(WebDriver getDriver) throws InterruptedException{
		getDriver.findElement(By.id("email_create")).sendKeys("Caio@gmail.com");
		getDriver.findElement(By.id("SubmitCreate")).click();
		WebDriverWait wait = new WebDriverWait(getDriver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender1")));
		
		getDriver.findElement(By.id("id_gender1")).click();
		getDriver.findElement(By.id("customer_firstname")).sendKeys("Caio");
		getDriver.findElement(By.id("customer_lastname")).sendKeys("Silva");
		getDriver.findElement(By.id("passwd")).sendKeys("12345");
		getDriver.findElement(By.id("days")).sendKeys("1");
		getDriver.findElement(By.id("months")).sendKeys("May");
		getDriver.findElement(By.id("years")).sendKeys("1985");
		getDriver.findElement(By.id("company")).sendKeys("Blue Boll");
		getDriver.findElement(By.id("address1")).sendKeys("FLORIDA CITY, NW 14TH ST, 542");
		getDriver.findElement(By.id("address2")).sendKeys("Orlando, FL");
		getDriver.findElement(By.id("city")).sendKeys("Arcadia");
		getDriver.findElement(By.id("id_state")).sendKeys("Florida");
		getDriver.findElement(By.id("postcode")).sendKeys("33034");
		getDriver.findElement(By.id("id_country")).sendKeys("United States");
		getDriver.findElement(By.id("phone")).sendKeys("1 321-677-0444");
		getDriver.findElement(By.id("phone_mobile")).sendKeys("1 855-444-1334");
		getDriver.findElement(By.id("alias")).sendKeys("");
		getDriver.findElement(By.id("submitAccount")).click();
		getDriver.findElement(By.className("logout")).click();
	}
}
