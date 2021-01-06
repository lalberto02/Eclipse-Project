package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;

public class ManagingSiteFunction {
	
	public static void GoToAccount(int iTestCaseRow) throws Exception{
		// click configuration tab
		CMWeb_ConfigurationPage.btnAccount().click();
		
	}
	
	public static void GoToSiteTab(int iTestCaseRow) throws Exception{
		// Click Roles Button
		CMWeb_ConfigurationPage.btnSite().click();
	}
	
	// Edit Site
	public static void EditSite(int iTestCaseRow) throws Exception{
			
			//search role
		   // String sSiteName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearch().sendKeys("Test_Automation");
			CMWeb_ConfigurationPage.btnSearch().click();
		
			// Click Edit button
			CMWeb_ConfigurationPage.btnEdit().click();
			
			// change role name
			//	String sNewSiteName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewName);
			CMWeb_ConfigurationPage.txtSiteName().clear();
			CMWeb_ConfigurationPage.txtSiteName().sendKeys("Test_Lois");		
		}
	
	// save Site
	public static void SaveSite(int iTestCaseRow) throws Exception{
		
		// Click save button
		CMWeb_ConfigurationPage.btnSaveSite().click();	
		//validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
	}
	
	// Delete Site
	public static void DeleteSite(int iTestCaseRow) throws Exception{
					
		//search role
//		String sSiteName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtSearch().sendKeys("Test_Lois");
		CMWeb_ConfigurationPage.btnSearch().click();
				
		// Click Role Checkbox to delete
		CMWeb_ConfigurationPage.chckboxSite().click();
					
		// click delete button
		CMWeb_ConfigurationPage.btnDelete().click();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
	}
					

}
