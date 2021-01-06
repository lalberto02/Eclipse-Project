package ObjectRepository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMWeb_RecipePage extends BaseClass {
	private static WebElement Element;
    private static Alert alert;
    
	public CMWeb_RecipePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 // Recipe Button
    public static WebElement btnRecipe() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	    WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"RadTabStrip1\"]/div/ul/li[2]/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // New Recipe Button
    public static WebElement btnNewRecipe() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	   /* WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl11\"]/div/div/div/ul/li[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtRecipeName
    public static WebElement txtRecipeName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table[2]/tbody/tr[1]/td[2]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
  //txtNumber
    public static WebElement txtNumber() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table[2]/tbody/tr[2]/td[2]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // category dropdown
    public static WebElement drpdownCategory() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table[2]/tbody/tr[4]/td[2]/select"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // source dropdown
    public static WebElement drpdownSource() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		//driver.switchTo().defaultContent();
    	    //WebElement frame  = driver.findElement(By.id("main"));
    	    //	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table[2]/tbody/tr[5]/td[2]/select"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
	
    //txtYield
    public static WebElement txtYield() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table[2]/tbody/tr[8]/td[2]/input[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // yield dropdown
    public static WebElement drpdownYield() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		//driver.switchTo().defaultContent();
    	    //WebElement frame  = driver.findElement(By.id("main"));
    	    //	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table[2]/tbody/tr[8]/td[2]/select"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //Calculate button
    public static WebElement btnCalculate() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"main-template\"]/div[1]/div[2]/table[2]/tbody/tr[8]/td[2]/span[2]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //Calculate yes button
    public static WebElement btnYesCalculate() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"modal-main-confirm\"]/div[3]/button[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //Ingredients and procedure button
    public static WebElement btnIngredientProd() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ingredient\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Recipe Ingredient textbox
    public static WebElement txtSearchIngredient() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ingredient-control-panel\"]/tbody/tr[2]/td/table/tbody/tr/td[2]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //Search button
    public static WebElement btnSearch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ingredient-control-panel\"]/tbody/tr[3]/td/table/tbody/tr/td[2]/span[3]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Net QTY textbox
    public static WebElement txtNetQty() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ingredient-table\"]/tbody/tr/td[1]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //Add ingredient button
    public static WebElement btnAddIngredient() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"lnkInclude\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //Nutrient button
    public static WebElement btnNutrient() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"nutrition\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Imposed Nutrient textbox
    public static WebElement txtImposedNutrient() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"nutrition-template\"]/div/div[2]/div[1]/table/tbody/tr[1]/td[6]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Save Button
    public static WebElement btnSave() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/input[2]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Ok Alert
    public static Alert alertOkay() throws Exception {
    	alert = null;
    	try {
    		alert = driver.switchTo().alert();
    	} catch (Exception e) {
    		throw(e);
    	}
    	return alert;
    }
    
 // Ok Alert
    public static Alert alertLeave() throws Exception {
    	alert = null;
    	try {
    		alert = driver.switchTo().alert();
    	} catch (Exception e) {
    		throw(e);
    	}
    	return alert;
    }
    
    // List button
    public static WebElement btnList() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("header"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl11\"]/div/div/div/ul/li[2]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Merchandise textbox
    public static WebElement txtSearchMerch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.id("txRecipe"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Merchandise Button
    public static WebElement btnSearchMerch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/div/div/div/div[1]/div[1]/button[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // History Merchandise
    public static WebElement linkHistory() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageDescription_ucDLHistory_Grid_ctl00_lnkBtnName\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
}
