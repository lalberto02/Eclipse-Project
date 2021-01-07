package ObjectRepository;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CMWeb_ConfigurationPage extends BaseClass {
	private static WebElement Element;
    private static Alert alert;
    
	public CMWeb_ConfigurationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//configuration tab
    public static WebElement btnConfig() throws Exception {
    	Element = null;
    	try {
    		// change frame
    	    WebElement frame  = driver.findElement(By.name("header"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"RadTabStrip1\"]/div/ul/li[5]/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;	
    }
    
    // system tab
    public static WebElement btnSystem() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("main"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn0\"]/table/tbody/tr/td/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // merchandise tab
    public static WebElement btnMerchandise() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("main"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn2\"]/table/tbody/tr/td/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Recipe tab
    public static WebElement btnRecipe() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("main"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn3\"]/table/tbody/tr/td/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Menu tab
    public static WebElement btnMenu() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("main"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn4\"]/table/tbody/tr/td/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
 
    // account tab
    public static WebElement btnAccount() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    		WebElement frame  = driver.findElement(By.name("main"));
	    	driver.switchTo().frame(frame);
    		Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_mnu_mnuMainn1\"]/table/tbody/tr/td/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }

    
    // role button
    public static WebElement btnRoles() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl07_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Site button
    public static WebElement btnSite() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl01_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Keyword button
    public static WebElement btnKeyword() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl02_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Users button
    public static WebElement btnUsers() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ucDLN_Grid_ctl02_hypname\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    } 
    
    //  new button
    public static WebElement btnNew() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_ucCBtn1_lnkBtn\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    //  new keyword button
    public static WebElement btnNewKeyword() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame).switchTo().frame("ctl00_cphPageContent_configframe");
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplclearfix\"]/span[1]/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtRoleName
    public static WebElement txtRoleName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_tbxField2\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtName
    public static WebElement txtName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxName\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtEmail
    public static WebElement txtEmail() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxEmail\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtUsername
    public static WebElement txtUsername() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxUID\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtPassword
    public static WebElement txtPassword() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_tbxPWD\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtSiteName
    public static WebElement txtSiteName() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorSite_tbxName\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtParent
    public static WebElement txtParent() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[1]/div/div/div/select"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtEnglish
    public static WebElement txtEnglish() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[2]/div[1]/div/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtFrench
    public static WebElement txtFrench() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[2]/div[2]/div/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtGerman
    public static WebElement txtGerman() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[2]/div[3]/div/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtItalian
    public static WebElement txtItalian() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[2]/div/div[2]/div[4]/div/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Role type dropdown
    public static WebElement drpdwnRoleType() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_cmbRoleType\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // property role level checkbox
    public static WebElement chckboxPropertyLevel() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rdoProperty\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
        
    // site role type checkbox
    public static WebElement chckboxSiteLevel() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rdoSite\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // basic role type checkbox
    public static WebElement chckboxBasicLevel() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rdoBasic\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // user role type checkbox
    public static WebElement chckboxUserRole() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_chkRoles_3\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Check all button
    public static WebElement btnCheckAll() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_rtbRoleRights\"]/div/div/div/ul/li[1]/a/span/span/span/span"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
  
    // save Role button
    public static WebElement btnSaveRole() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditor_lnkBtnSave\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // save Site button
    public static WebElement btnSaveSite() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditorSite_lnkBtnSave\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // save user button
    public static WebElement btnSaveUser() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucEditUser_lnkBtnSave\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
 // save Keyword button
    public static WebElement btnSaveKeyword() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[1]/div/a[2]"));
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
    
    // Edit Role button 
    public static WebElement btnEdit() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_lnkBtnEdit\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Edit User button 
    public static WebElement btnEditUser() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_lnkbtnEdit\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtSearch
    public static WebElement txtSearch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_tbxSearch\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // txtSearchKeyword
    public static WebElement txtSearchKeyword() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame).switchTo().frame("ctl00_cphPageContent_configframe");
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplclearfix2\"]/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Keyword Button
    public static WebElement btnSearchKeyword() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplclearfix2\"]/button[1]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Search Button
    public static WebElement btnSearch() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_lnkBtnSearch\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Clear Button
    public static WebElement btnClear() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_lblClear\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // role checkbox
    public static WebElement chckboxRole() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_chkSelect\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // keyword checkbox
    public static WebElement chckboxKeyword() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"manageOptions\"]/div/div[4]/div/div/div[2]/div/ul/li/span/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // site checkbox
    public static WebElement chckboxSite() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_Grid_ctl03_chkselect\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // global sharing checkbox
    public static WebElement chckboxGlobal() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[3]/div[1]/label/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // HQ sharing checkbox
    public static WebElement chckboxHQ() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplrow2\"]/div[3]/div[1]/div/ul/li/div/div/ul/li/span/input"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // Inhheritable checkbox
    public static WebElement chckboxInheritable() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"cbInheritable\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // delete Button
    public static WebElement btnDelete() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_ucCBtn2_lnkBtn\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // delete keyword Button
    public static WebElement btnDeleteKeyword() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		/*driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame);*/
    	    	Element = driver.findElement(By.xpath("//*[@id=\"managetplclearfix\"]/span[3]/a"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
    
    // deactivate Button
    public static WebElement btnDeactivate() throws Exception {
    	Element = null;
    	try {
    		// change frame
    		driver.switchTo().defaultContent();
    	    WebElement frame  = driver.findElement(By.id("main"));
    	    	driver.switchTo().frame(frame).switchTo().frame("ctl00_cphPageContent_configframe");
    	    	Element = driver.findElement(By.xpath("//*[@id=\"ctl00_cphPageContent_ctl00_ucMenu_ucCBtnDeactivate_lnkBtn\"]"));
    	} catch (Exception e) {
    		throw(e);
    	}
    	return Element;
    }
        
    
}
