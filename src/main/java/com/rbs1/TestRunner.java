package com.rbs1;

import java.io.File;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features ="C:\\Users\\ASHRAF\\Desktop\\Selenium\\ExtCucuExamples\\Features",
glue={"com.rbs1"},  plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})
public class TestRunner extends AbstractTestNGCucumberTests {
	@BeforeClass
	public static void setup() {
		//hhhlkjk
		ExtentProperties extentProperties = ExtentProperties.INSTANCE;
		extentProperties.setReportPath("output/myreport.html");
	}

	@AfterClass
	public static void teardown() {
		Reporter.loadXMLConfig(new File("C:\\Users\\ASHRAF\\Desktop\\Selenium\\ExtCucuExamples\\extentConfig.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");


	}
	@AfterClass
	public static void teardown2() {
		Reporter.loadXMLConfig(new File("C:\\Users\\ASHRAF\\Desktop\\Selenium\\ExtCucuExamples\\extentConfig.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");


	}
	@AfterClass
	public static void teardown5() {
		Reporter.loadXMLConfig(new File("C:\\Users\\ASHRAF\\Desktop\\Selenium\\ExtCucuExamples\\extentConfig.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");


	}
	@AfterClass
	public static void teardown11() {
		Reporter.loadXMLConfig(new File("C:\\Users\\ASHRAF\\Desktop\\Selenium\\ExtCucuExamples\\extentConfig.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");


	}
	@AfterClass
	public static void teardown15() {
		Reporter.loadXMLConfig(new File("C:\\Users\\ASHRAF\\Desktop\\Selenium\\ExtCucuExamples\\extentConfig.xml"));
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");
		Reporter.setSystemInfo("os", "Mac OSX");
		Reporter.setTestRunnerOutput("Sample test runner output message");


	}


	}