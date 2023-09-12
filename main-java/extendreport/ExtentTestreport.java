package extendreport;

import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;

import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import com.relevantcodes.extentreports.LogStatus;

import com.relevantcodes.extentreports.model.Test;
import com.testng.Annotations;




public  class ExtentTestreport  implements IReporter {
	private ExtentReports report;
	
	public void generatereport(List<XmlSuite> xmlsuite,List<ISuite> suite,String outputDirecry) {
		
		report=new ExtentReports(outputDirecry + File.separator +"Extent.html",true);
		
		for (ISuite iSuite : suite) {
			Map<String,ISuiteResult > result= iSuite.getResults();
			for(ISuiteResult r:result.values()) {
				ITestContext context=r.getTestContext();
				
				buildTestNodes(context.getPassedTests(),LogStatus.PASS);
				buildTestNodes(context.getPassedTests(),LogStatus.SKIP);
				buildTestNodes(context.getPassedTests(),LogStatus.FAIL);
				
			}
		}
		report.flush();
		report.close();
	}

	private void buildTestNodes(IResultMap tests, LogStatus status) {
		ExtentTest test;

		if (tests.size() > 0) {
		for (ITestResult result : tests.getAllResults()) {
		test = report.startTest(result.getMethod().getMethodName());

		test.setStartedTime(getTime(result.getStartMillis()));
		test.setEndedTime( getTime(result.getEndMillis()));

		for (String group : result.getMethod().getGroups())
		test.assignCategory(group);

		String message = "Test"+ status.toString().toLowerCase();

		if (result.getThrowable() != null)
		message = result.getThrowable().getMessage();

		test.log(status, message);

		report.endTest(test);
		}
		}
		}


	private Date getTime(long startMillis) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		cal.setTimeInMillis(startMillis);
		
		
		return cal.getTime();
	}

	
	

	
}


