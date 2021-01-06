package FunctionLibraries;

import ObjectRepository.CMWeb_MerchandisePage;
import ObjectRepository.CMWeb_RecipePage;

public class RecipeFunction {
	
	//Go to Merchandise tab
	public static void GoToRecipe(int iTestCaseRow) throws Exception{
		
		// Click Merchandise
		CMWeb_RecipePage.btnRecipe().click();
			// reporting validation
			// screenshot
		
	}
	
	// Fill up Recipe Main Page
		public static void CreateRecipeMain(int iTestCaseRow) throws Exception{
			
			//Click new recipe button
			CMWeb_RecipePage.btnNewRecipe().click();
					// reporting
			
			//Input Merchandise Name
			//	String sRecipeName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
				CMWeb_RecipePage.txtRecipeName().sendKeys("EGSTest_1228_Recipe");
						// Reporting
				
				//input Number
				if (CMWeb_RecipePage.txtNumber().isEnabled()) {
			//		String sNumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Number);
					CMWeb_RecipePage.txtNumber().sendKeys("RCP12282020");
				} else {
					// report
				}
				
			//select category
				//String sCategory = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Category);
				CMWeb_RecipePage.drpdownCategory().sendKeys("EGS");
							// Reporting	
				
			//select source
				//String sSource = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Source);
				CMWeb_RecipePage.drpdownSource().sendKeys("EGS");
							// Reporting	
				
			//Input Yield
				//	String sYield = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Yield);
					CMWeb_RecipePage.txtYield().clear();
					CMWeb_RecipePage.txtYield().sendKeys("25");
							// Reporting	
					
			//Select Yield
				//	String sYield2 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Yield2);
					//CMWeb_RecipePage.drpdownYield().sendKeys("serving");
							// Reporting	
					
			//Click calculate
					CMWeb_RecipePage.btnCalculate().click();
					if (CMWeb_RecipePage.btnYesCalculate().isDisplayed()) {
						CMWeb_RecipePage.btnYesCalculate().click();
					} else {
						//report
					}
					
		}
		
	// add ingredient and procedure
		public static void AddIngredientProcedure(int iTestCaseRow) throws Exception{
			
			// go to ingredient and procedure tab
			CMWeb_RecipePage.btnIngredientProd().click();
			
			//search ingredient
//			String sSearch = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_SearchName);
			CMWeb_RecipePage.txtSearchIngredient().sendKeys("Pomelo");
			CMWeb_RecipePage.btnSearch().click();
			
			//Enter Net Quantity
//			String sNetQTY = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_NetQTY);
			CMWeb_RecipePage.txtNetQty().sendKeys("15");
			
			// add ingredient
			CMWeb_RecipePage.btnAddIngredient().click();
		}
		
		// add Nutrient
		public static void AddNutrient(int iTestCaseRow) throws Exception{
			
			// go to nutrient tab
			CMWeb_RecipePage.btnNutrient().click();
			
			// input Imposed Nutrient
//			String sNutrient = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ImposedNutrient);
			CMWeb_RecipePage.txtImposedNutrient().clear();
			CMWeb_RecipePage.txtImposedNutrient().sendKeys("10");
			
		}
		
		// save merchandise
		public static void SaveRecipe(int iTestCaseRow) throws Exception{
			
			// Click save button
			CMWeb_RecipePage.btnSave().click();	
			//validation reporting screenshot
			Thread.sleep(5000);
			CMWeb_RecipePage.alertOkay().accept();
		}
		
		// search Recipe
		public static void SearchRecipe(int iTestCaseRow) throws Exception{
			
			// click list button
			CMWeb_RecipePage.btnList().click();
		//	CMWeb_RecipePage.alertLeave().accept();
		//	String sRecipeName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Name);
			CMWeb_RecipePage.txtSearchMerch().sendKeys("EGSTest_1228_Recipe");
			CMWeb_RecipePage.btnSearchMerch().click();
			
		}
		
		// view recent merchandise
		public static void ViewRecentRecipe(int iTestCaseRow) throws Exception{
			CMWeb_MerchandisePage.linkHistory().click();
			 //validation reporting and screenshot
			
		}
		

}
