package com.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import TestMethods.ValidHomePage;

public class MyListener implements ITestListener {

	protected static ExtentReports reports;
	protected static ExtentTest test;

	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
		test = reports.startTest(result.getMethod().getMethodName());
		test.log(LogStatus.INFO, result.getMethod().getMethodName() + "test is started");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
		test.log(LogStatus.PASS, result.getMethod().getMethodName() + "test is passed");
	}

//	@SuppressWarnings("null")
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");

		test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed");

		String newPath = System.getProperty("user.dir") + "\\test-output\\Fail\\";
		File scrFile = ((TakesScreenshot) ValidHomePage.driver).getScreenshotAs(OutputType.FILE);

		try {

			FileUtils.copyFile(scrFile, new File(newPath + result.getName() + ".PNG"));
			String file = test.addScreenCapture(newPath + result.getMethod().getMethodName() + ".PNG");
			test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed", file);
			test.log(LogStatus.FAIL, result.getMethod().getMethodName() + "test is failed",
					result.getThrowable().getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");
		test.log(LogStatus.SKIP, result.getMethod().getMethodName() + "test is skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on test sucess within percentage");
	}

	public void onStart(ITestContext context) {
		System.out.println("on start");
		reports = new ExtentReports("IssueDetailreports.html");
	}

	public void onFinish(ITestContext context) {
		System.out.println("on finish");
		ValidHomePage.driver.close();
		reports.endTest(test);
		reports.flush();
	}
}
