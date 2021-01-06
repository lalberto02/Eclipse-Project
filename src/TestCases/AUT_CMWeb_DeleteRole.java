package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import FunctionLibraries.LoginFunction;
import FunctionLibraries.ManagingRolesFunction;
import ObjectRepository.BaseClass;
import Utility.Utils;

public class AUT_CMWeb_DeleteRole {
	public WebDriver driver;
	private int iTestCaseRow;
//	private String sTestCaseName;
	
	@BeforeMethod
	  public void beforeMethod() throws Exception {
		    // Configuring Log4j logs, please see the following posts to learn about Log4j Logging
		    // http://www.toolsqa.com/test-case-with-log4j/
		    // http://www.toolsqa.com/log4j-logging/
		  	//DOMConfigurator.configure("log4j.xml");
		  	
		  	// Getting the Test Case name, as it will going to use in so many places
		  	// The main use is to get the TestCase row from the Test Data Excel sheet
		  	//sTestCaseName = this.toString();
		  	// From above method we get long test case name including package and class name etc.
		  	// The below method will refine your test case name, exactly the name use have used
	//	  	sTestCaseName = Utils.getTestCaseName(this.toString());
		  	
		  	// Start printing the logs and printing the Test Case name
			//Log.startTestCase(sTestCaseName);
			
			// Setting up the Test Data Excel file using Constants variables
			// For Constant Variables please see http://www.toolsqa.com/constant-variables/
			// For setting up Excel for Data driven testing, please see http://www.toolsqa.com/data-driven-testing-excel-poi/
	//		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Recipe");
			
			// Fetching the Test Case row number from the Test Data Sheet
			// This row number will be feed to so many functions, to get the relevant data from the Test Data sheet 
	//		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);
			
			// Launching the browser, this will take the Browser Type from Test Data Sheet 
			driver = Utils.OpenBrowser(iTestCaseRow);
			
			// Initializing the Base Class for Selenium driver
			// Now we do need to provide the Selenium driver to any of the Page classes or Module Actions
			// Will soon write a post on Base Class
			new BaseClass(driver);  
	        }
	// Start of the test script
	@Test
	  public void main() throws Exception {
		
		//UserLogin
		LoginFunction.Execute(iTestCaseRow);
		
		// Add Role
		ManagingRolesFunction.GoToConfiguration(iTestCaseRow);
		ManagingRolesFunction.GoToRolesTab(iTestCaseRow);
		ManagingRolesFunction.DeleteRole(iTestCaseRow);
		
		
		if(BaseClass.bResult==true){
			// If the value of boolean variable is True, then your test is complete pass and do this
			//Log.info("Successfull Login");
		}else{
			// If the value of boolean variable is False, then your test is fail, and you like to report it accordingly
			// This is to throw exception in case of fail test, this exception will be caught by catch block below
			throw new Exception("Test Case Failed because of Verification");
		}
	}
	
	  @AfterMethod
	  public void afterMethod() {
		    // Printing beautiful logs to end the test case
		   // Log.endTestCase(sTestCaseName);
		    // Closing the opened driver
		    //driver.close();
	  		}

}
