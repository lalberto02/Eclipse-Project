package FunctionLibraries;

import ObjectRepository.CMWeb_LoginPage;
import Utility.Constant;
import Utility.ExcelUtils;



public class LoginFunction {
	 public static void Execute(int iTestCaseRow) throws Exception{
		
		 // insert username
		 String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
		 CMWeb_LoginPage.txtUserName().sendKeys(sUserName);
		 // reporting
		 //Log.info("Admin is entered in UserName text box" );
		 
		 // insert password
		 String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		 CMWeb_LoginPage.txtPassword().sendKeys(sPassword);
		 // reporting
		 //Log.info("Password is entered in UserName text box" );
		 
		 // click sign in
		 CMWeb_LoginPage.btnSignIn().click();
		// Log.info("Sign in Button was clicked");
		 		 
		 // report
		 //Reporter.log("SignIn Action is successfully perfomred");
		 
	 }

}
