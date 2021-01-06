package ObjectRepository;

import org.openqa.selenium.*;


public class CMWeb_MerchandisePage extends BaseClass {
    private static WebElement Element;
    private static Alert alert;
  
    
    public CMWeb_MerchandisePage (WebDriver driver){
    	super(driver);
} 
       
    // Merchandise Button
    public static WebElement btnMerch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	    WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"RadTabStrip1\"]/div/ul/li[1]/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // New Merch Button
    public static WebElement btnNewMerch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	    /*WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl09\"]/div/div/div/ul/li[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // List button
    public static WebElement btnList() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("header"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl09\"]/div/div/div/ul/li[2]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtMerchName
    public static WebElement txtMerchName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"maintab\"]/div/div[1]/div[2]/div/div[2]/table[2]/tbody/tr[1]/td[2]/input"));
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
    	    	Element = driver.findElement(By.xpath("//*[@id=\"maintab\"]/div/div[1]/div[2]/div/div[2]/table[2]/tbody/tr[7]/td[2]/select"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // branch dropdown
    public static WebElement drpdownBrand() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"maintab\"]/div/div[1]/div[2]/div/div[2]/table[2]/tbody/tr[6]/td[2]/select"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // supplier dropdown
    public static WebElement drpdownSupplier() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"maintab\"]/div/div[1]/div[2]/div/div[2]/table[2]/tbody/tr[8]/td[2]/select"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //txtWastage
    public static WebElement txtWastage() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"maintab\"]/div/div[1]/div[2]/div/div[2]/table[2]/tbody/tr[13]/td[2]/input[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //txtPrice
    public static WebElement txtPrice() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"maintab\"]/div/div[1]/div[2]/div/div[2]/table[2]/tbody/tr[16]/td[2]/div[1]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //Unit dropdown
    public static WebElement drpdownUnit() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"maintab\"]/div/div[1]/div[2]/div/div[2]/table[2]/tbody/tr[16]/td[2]/div[1]/select[1]"));
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
    	    	Element = driver.findElement(By.xpath("//*[@id=\"maintab\"]/div/div[1]/div[2]/div/div[2]/table[2]/tbody/tr[13]/td[2]/a[1]"));
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
    	    	Element = driver.findElement(By.xpath("//*[@id=\"maintab\"]/div/div[1]/div[2]/div/div[2]/table[2]/tbody/tr[2]/td[2]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Nutrient Tab
    public static WebElement btnNutrient() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"tabs\"]/li[4]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
 // Link button Nutrient Tab
    public static WebElement btnLink() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"nutrientTab\"]/div/div/div[1]/div[2]/div/div[2]/div[1]/a[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search button Nutrient Tab
    public static WebElement btnSearchNut() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"nutrientTab\"]/div/div/div[1]/div[2]/div/div[2]/div[3]/a[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
 // link Merchandise
    public static WebElement linkMerchandise() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"nutrientTab\"]/div/div/div[1]/div[2]/div/div[2]/div[3]/div[2]/table/tbody/tr/td[1]/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Merchandise Nutrient textbox
    public static WebElement txtSearchMerchNut() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"nutrientTab\"]/div/div/div[1]/div[2]/div/div[2]/div[3]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Allergen Button
    public static WebElement btnAllergen() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"tabs\"]/li[6]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Allergen checkbox 
    public static WebElement chckboxAllergenContains() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"allergen-template\"]/div/div/div[4]/table/tbody/tr[4]/td[4]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    public static WebElement chckboxAllergenNon() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"allergen-template\"]/div/div/div[4]/table/tbody/tr[7]/td[6]/input"));
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
    	    	Element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/input[1]"));
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
    
    // Search Merchandise textbox
    public static WebElement txtSearchMerch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.id("Text1"));
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
    	    	Element = driver.findElement(By.id("SearchButton"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Condition Dropdown
    public static WebElement drpdownSearchCondi() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.id("selNameFilter"));
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
    
    // Information Tab
    public static WebElement btnInformation() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"tabs\"]/li[8]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtIngredient
    public static WebElement txtIngredient() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/textarea[2]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtSpecification
    public static WebElement txtSpecification() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/textarea[3]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // sharing Tab
    public static WebElement btnSharing() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"tabs\"]/li[10]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Global Checkbox
    public static WebElement chckboxGlobal() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/table/tbody/tr/td[1]/div/div[1]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    
    
}
