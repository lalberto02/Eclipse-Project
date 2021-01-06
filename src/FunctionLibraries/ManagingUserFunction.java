package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;

public class ManagingUserFunction {

	
	public static void GoToUsersTab(int iTestCaseRow) throws Exception{
		// Click Users Button
		CMWeb_ConfigurationPage.btnUsers().click();
	}
	
	public static void AddNewUser(int iTestCaseRow) throws Exception{
		// Click New Button
		CMWeb_ConfigurationPage.btnNew().click();
		
		//input name
		//	String sName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_ConfigurationPage.txtName().sendKeys("Lois");
		
		//enter email address
		//String sEmail = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Email);
		CMWeb_ConfigurationPage.txtEmail().sendKeys("loisnicole.alberto@eg-software.com");
		
		// enter username
		//String sUser = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_User);
		CMWeb_ConfigurationPage.txtUsername().sendKeys("TestUser1");
		
		// enter password
		//String sPass = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Pass);
		CMWeb_ConfigurationPage.txtPassword().sendKeys("TestUser1");
		
		// select role
		CMWeb_ConfigurationPage.chckboxUserRole().click();
		
	}
	
	// save user
	public static void SaveUser(int iTestCaseRow) throws Exception{
		
		// Click save button
		CMWeb_ConfigurationPage.btnSaveUser().click();	
		//validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
	}
	
	// Edit User
	public static void EditUser(int iTestCaseRow) throws Exception{
			
			//search role
		   // String sRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearch().sendKeys("Lois");
			CMWeb_ConfigurationPage.btnSearch().click();
		
			// Click Edit button
			CMWeb_ConfigurationPage.btnEditUser().click();
			
			// change user username
			//String sUser = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_User);
			CMWeb_ConfigurationPage.txtUsername().clear();
			CMWeb_ConfigurationPage.txtUsername().sendKeys("Test_01");
		}
	
	// Delete User
	public static void DeleteUser(int iTestCaseRow) throws Exception{
				
			//search role
		   // String sRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearch().sendKeys("Lois");
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
	
	// Deactivate User
	public static void DeactivateUser(int iTestCaseRow) throws Exception{
				
			//search role
		   // String sRoleName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_ConfigurationPage.txtSearch().sendKeys("Lois");
			CMWeb_ConfigurationPage.btnSearch().click();
			
			// Click Role Checkbox to delete
			CMWeb_ConfigurationPage.chckboxRole().click();
				
			// click delete button
			CMWeb_ConfigurationPage.btnDeactivate().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();		
			}	
}
