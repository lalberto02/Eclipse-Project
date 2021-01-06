package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;

public class ManagingKeywordFunction {

	public static void GoToMerchandiseTab(int iTestCaseRow) throws Exception{
		// Click Users Button
		CMWeb_ConfigurationPage.btnMerchandise().click();
	}
	
	public static void GoToKeyword(int iTestCaseRow) throws Exception{
		// Click Users Button
		CMWeb_ConfigurationPage.btnKeyword().click();
	}
	
	public static void AddNewKeyword(int iTestCaseRow) throws Exception{
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		
		// input parent name
		// sParent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Parent);
		CMWeb_ConfigurationPage.txtParent().sendKeys("Test_Automation");
		
		
	}
}
