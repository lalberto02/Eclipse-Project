package FunctionLibraries;

import ObjectRepository.CMWeb_ConfigurationPage;
import Utility.Constant;
import Utility.ExcelUtils;

public class ManagingKeywordFunction {

	public static void GoToMerchandiseTab(int iTestCaseRow) throws Exception{
		// Click Merchandise Button
		CMWeb_ConfigurationPage.btnMerchandise().click();
	}
	
	public static void GoToRecipeTab(int iTestCaseRow) throws Exception{
		// Click Recipe Button
		CMWeb_ConfigurationPage.btnRecipe().click();
	}
	
	public static void GoToMenuTab(int iTestCaseRow) throws Exception{
		// Click Menu Button
		CMWeb_ConfigurationPage.btnMenu().click();
	}
	
	public static void GoToKeyword(int iTestCaseRow) throws Exception{
		// Click Keyword Button
		CMWeb_ConfigurationPage.btnKeyword().click();
	}
	
	public static void AddNewKeyword(int iTestCaseRow) throws Exception{
		// Click New Button
		CMWeb_ConfigurationPage.btnNewKeyword().click();
		
		// input parent name
		 String sParent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Parent);
		CMWeb_ConfigurationPage.txtParent().sendKeys(sParent);
		
		// input English Keyword
		 String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtEnglish().sendKeys(sEnglish);
		
		// input French Keyword
		String sFrench = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_French);
		CMWeb_ConfigurationPage.txtFrench().sendKeys(sFrench);
		
		// input German Keyword
		String sGerman = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_German);
		CMWeb_ConfigurationPage.txtGerman().sendKeys(sGerman);
		
		// input Italian Keyword
		String sItalian = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Italian);
		CMWeb_ConfigurationPage.txtItalian().sendKeys(sItalian);
		
		//tick inheritable
		CMWeb_ConfigurationPage.chckboxInheritable().click();
		
		// tick sharing
		String sSharing = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Sharing);
		if (sSharing.equals("Global")) {
			CMWeb_ConfigurationPage.chckboxGlobal().click();
		} else if (sSharing.equals("HQ")) {
			CMWeb_ConfigurationPage.chckboxHQ().click();
		}	
	}
	
	// save keyword
	public static void SaveKeyword(int iTestCaseRow) throws Exception{
		
		// Click save button
		CMWeb_ConfigurationPage.btnSaveKeyword().click();	
		//validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
		Thread.sleep(5000);
		CMWeb_ConfigurationPage.alertOkay().accept();
	}
	
	// Edit Keyword
	public static void EditKeyword(int iTestCaseRow) throws Exception{

			// change Parent
			String sParent = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Parent);
			CMWeb_ConfigurationPage.txtParent().sendKeys(sParent);
			
			// Change German Translation
			String sGerman = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_German);
			CMWeb_ConfigurationPage.txtGerman().clear();
			CMWeb_ConfigurationPage.txtGerman().sendKeys(sGerman);
			
		}
	
	// Search Keyword
	public static void SearchKeyword(int iTestCaseRow) throws Exception{
		
		//search role
	    String sEnglish = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_English);
		CMWeb_ConfigurationPage.txtSearchKeyword().sendKeys(sEnglish);
		CMWeb_ConfigurationPage.btnSearchKeyword().click();
	
		// tick keyword to edit
		CMWeb_ConfigurationPage.chckboxKeyword().click();
		
	}
	
	// Delete keyword
	public static void DeleteKeyword(int iTestCaseRow) throws Exception{
			
			// click delete button
			CMWeb_ConfigurationPage.btnDeleteKeyword().click();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
			Thread.sleep(5000);
			CMWeb_ConfigurationPage.alertOkay().accept();
				
			}	

	
}
