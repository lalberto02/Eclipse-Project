package FunctionLibraries;
//import org.testng.Reporter;

//import ObjectRepository.Home_Page;
import ObjectRepository.CMWeb_LoginPage;
//import Utility.Constant;
//import Utility.ExcelUtils;
//import Utility.Log;
//import Utility.Utils;


public class LoginFunction {
	 public static void Execute(int iTestCaseRow) throws Exception{
		
		 // insert username
		 //String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
		 CMWeb_LoginPage.txtUserName().sendKeys("admin");
		 // reporting
		 //Log.info("Admin is entered in UserName text box" );
		 
		 // insert password
		 //String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		 CMWeb_LoginPage.txtPassword().sendKeys("admin");
		 // reporting
		 //Log.info("Password is entered in UserName text box" );
		 
		 // click sign in
		 CMWeb_LoginPage.btnSignIn().click();
		// Log.info("Sign in Button was clicked");
		 		 
		 // report
		 //Reporter.log("SignIn Action is successfully perfomred");
		 
	 }

}
