package br.com.rsi.core;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ResultTest {
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void extentExecute(WebDriver getDriver) throws IOException {
		htmlReporter = new ExtentHtmlReporter("./reports/Cadastro.html");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Funcional Report");
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setEncoding("UTF-8");
		htmlReporter.config().setTimeStampFormat("20/02/2020 11:50");

		report = new ExtentReports();
		report.attachReporter(htmlReporter);
		report.setSystemInfo("Hostname", "LocalHost");
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Tester Name", "Luis Ferreira");
		report.setSystemInfo("Browser", "Firefox");
		List<Status> statusHierarchy = Arrays.asList(Status.FATAL, Status.FAIL, Status.ERROR, Status.WARNING,
				Status.SKIP, Status.PASS, Status.DEBUG, Status.INFO);
		report.config().statusConfigurator().setStatusHierarchy(statusHierarchy);

		ExtentTest test = report.createTest("Cadastro");
		test.assignAuthor("LUIS-FERREIRA");
		test.log(Status.INFO, "Deve cadastrar com sucesso");
		test.log(Status.PASS, "Titulo verificado");
		
		ExtentTest logger = report.createTest("Login");
		logger.assignAuthor("LUIS-FERREIRA");
		logger.log(Status.INFO, "Deve logar com sucesso");
		logger.log(Status.PASS, "Titulo verificado");
		
		report.flush();
	}
}
