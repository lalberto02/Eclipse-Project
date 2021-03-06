package FunctionLibraries;

import ObjectRepository.CMWeb_MerchandisePage;
import Utility.Constant;
import Utility.ExcelUtils;

public class MerchadiseFunction {

	//Go to Merchandise tab
	public static void GoToMerchandise(int iTestCaseRow) throws Exception{
		
		// Click Merchandise
		CMWeb_MerchandisePage.btnMerch().click();
			// reporting validation
			// screenshot
		
	}
	
	// Fill up Merchandise Main Page
	public static void CreateMerchandiseMain(int iTestCaseRow) throws Exception{
		
		//Click new merchandise button
		CMWeb_MerchandisePage.btnNewMerch().click();
				// reporting
		
		//Input Merchandise Name
		String sMerchName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_MerchandisePage.txtMerchName().sendKeys(sMerchName);
				// Reporting
		
		//input Number
		if (CMWeb_MerchandisePage.txtNumber().isEnabled()) {
			String sNumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Number);
			CMWeb_MerchandisePage.txtNumber().sendKeys(sNumber);
		} else {
			// report
		}
		
		//select brand
		String sBrand = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Brand);
		CMWeb_MerchandisePage.drpdownBrand().sendKeys(sBrand);
			// Reporting
		
		//select category
		String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Category);
		CMWeb_MerchandisePage.drpdownCategory().sendKeys(sCategory);
				// Reporting
		
		//select supplier
		String sSupplier = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Supplier);
		CMWeb_MerchandisePage.drpdownSupplier().sendKeys(sSupplier);
		
		//Input Wastage
		String sWastage = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Wastage);
		CMWeb_MerchandisePage.txtWastage().clear();
		CMWeb_MerchandisePage.txtWastage().sendKeys(sWastage);
		
		//Click calculate
		CMWeb_MerchandisePage.btnCalculate().click();
		
		//Input Price
		String sPrice = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Price);
		CMWeb_MerchandisePage.txtPrice().clear();
		CMWeb_MerchandisePage.txtPrice().sendKeys(sPrice);
		
		//select Unit
		String sUnit = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Unit);
		CMWeb_MerchandisePage.drpdownUnit().sendKeys(sUnit);
		
		//Screenshot
		
	}
	
	// Link Nutrient to Merchandise
	public static void LinkNutrientMerchandise(int iTestCaseRow) throws Exception{
		
		//go to nutrient tab
		CMWeb_MerchandisePage.btnNutrient().click();
				// Reporting
		
		// Link Merchandise
		CMWeb_MerchandisePage.btnLink().click();
		String sSearch = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SearchName);
		CMWeb_MerchandisePage.txtSearchMerchNut().sendKeys(sSearch);
		CMWeb_MerchandisePage.btnSearchNut().click();
		CMWeb_MerchandisePage.linkMerchandise().click();
		
		//reporting screenshot
	}
	
	// Add allergen to Merchandise
	public static void AddAllergensMerchandise(int iTestCaseRow) throws Exception{
		
		// click allergen tab
		CMWeb_MerchandisePage.btnAllergen().click();
		CMWeb_MerchandisePage.chckboxAllergenContains().click();
		CMWeb_MerchandisePage.chckboxAllergenNon().click();
		
		// reporting screenshot
	}
	
	// save merchandise
	public static void SaveMerchandise(int iTestCaseRow) throws Exception{
		
		// Click save button
		CMWeb_MerchandisePage.btnSave().click();	
		//validation reporting screenshot
		Thread.sleep(5000);
		CMWeb_MerchandisePage.alertOkay().accept();
	}
	
	// search merchandise
	public static void SearchMerchandise(int iTestCaseRow) throws Exception{
		
		// click list button
		CMWeb_MerchandisePage.btnList().click();
		String sMerchName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
		CMWeb_MerchandisePage.txtSearchMerch().sendKeys(sMerchName);
		CMWeb_MerchandisePage.drpdownSearchCondi().sendKeys("and");
		CMWeb_MerchandisePage.btnSearchMerch().click();
		
	}
	
	// view recent merchandise
	public static void ViewRecentMerchandise(int iTestCaseRow) throws Exception{
		CMWeb_MerchandisePage.linkHistory().click();
		 //validation reporting and screenshot
		
	}
	
	// populate information tab (Ingredient and Specific determination)
	public static void PopulateInformationMerchandise(int iTestCaseRow) throws Exception{
		
		CMWeb_MerchandisePage.btnInformation().click();
		String sIngredient = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Ingredient);
		CMWeb_MerchandisePage.txtIngredient().sendKeys(sIngredient);
		String sDetermination = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Determination);
		CMWeb_MerchandisePage.txtSpecification().sendKeys(sDetermination);
		 //validation reporting and screenshot
		
	}
	
	//tick global sharing
	public static void GlobalSharingMerchandise(int iTestCaseRow) throws Exception{
		
		CMWeb_MerchandisePage.btnSharing().click();
		CMWeb_MerchandisePage.chckboxGlobal().click();
		
	}
}


