package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;

public class ManagingRolesFunction {
	
	public static void GoToConfiguration(int iTestCaseRow) throws Exception{
		// click configuration tab
		CMWeb_ConfigurationPage.btnConfig().click();
		
	}
	
	public static void GoToRolesTab(int iTestCaseRow) throws Exception{
		// Click Roles Button
		CMWeb_ConfigurationPage.btnRoles().click();
	}
	
	public static void AddNewRole(int iTestCaseRow) throws Exception{
		// Click New Button
		CMWeb_ConfigurationPage.btnNew().click();
		
		// Input Role Name
		//	String sRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtRoleName().sendKeys("Test_Lois");
		
		// Select Role Type
		//	String sRoleType = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RoleType);
		CMWeb_ConfigurationPage.drpdwnRoleType().sendKeys("Visitor");
		
		// Select Role Level
		// sRoleLevel = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RoleLevel);
		String sRoleLevel = "Site";
		if (sRoleLevel.equals("Property")) {
			CMWeb_ConfigurationPage.chckboxPropertyLevel().click();		
		} else if
			(sRoleLevel.equals("Site")) {
			CMWeb_ConfigurationPage.chckboxSiteLevel().click();
		} else if
			(sRoleLevel.equals("Basic")) {
			CMWeb_ConfigurationPage.chckboxBasicLevel().click();
		} 
		
		// click check all for all tabs
		CMWeb_ConfigurationPage.btnCheckAll().click();
		
	}
	
	// save role
	public static void SaveRole(int iTestCaseRow) throws Exception{
		
		// Click save button
		CMWeb_ConfigurationPage.btnSaveRole().click();	
		//validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
	}
	
	// Edit role
	public static void EditRole(int iTestCaseRow) throws Exception{
			
			//search role
		   // String sRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearch().sendKeys("Test_Automation");
			CMWeb_ConfigurationPage.btnSearch().click();
		
			// Click Edit button
			CMWeb_ConfigurationPage.btnEdit().click();
			
			// change role name
			//	String sNewRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NewName);
			CMWeb_ConfigurationPage.txtRoleName().clear();
			CMWeb_ConfigurationPage.txtRoleName().sendKeys("Test_Lois");
			
		}
	
	// Clear Search
	public static void ClearSearch(int iTestCaseRow) throws Exception{
			//Click clear
			CMWeb_ConfigurationPage.btnClear().click();
			
		}
		
	// Delete role
	public static void DeleteRole(int iTestCaseRow) throws Exception{
				
			//search role
//			String sRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearch().sendKeys("Test_Lois");
			CMWeb_ConfigurationPage.btnSearch().click();
			
			// Click Role Checkbox to delete
			CMWeb_ConfigurationPage.chckboxRole().click();
				
			// click delete button
			CMWeb_ConfigurationPage.btnDelete().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
				
			}	

}
