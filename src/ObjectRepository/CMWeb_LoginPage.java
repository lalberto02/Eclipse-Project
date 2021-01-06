package ObjectRepository;

import org.openqa.selenium.*;
//import Utility.Log;


public class CMWeb_LoginPage extends BaseClass {
        private static WebElement element = null;
        
        public CMWeb_LoginPage(WebDriver driver){
        	super(driver);
    } 
        // Username 
        public static WebElement txtUserName() throws Exception{
        	try{
	            element = driver.findElement(By.id("ctl00_cphDescription_SignIn1_txtUserName"));
	           // Log.info("Username text box is found on the Login Page");
        	}catch (Exception e){
           		//Log.error("UserName text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
            }
        
        
     // Password 
        public static WebElement txtPassword() throws Exception{
        	try{
	        	element = driver.findElement(By.id("ctl00_cphDescription_SignIn1_txtPassword"));
	            //Log.info("Password text box is found on the Login page");
        	}catch (Exception e){
        		//Log.error("Password text box is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
        
     // Sign in button 
        public static WebElement btnSignIn() throws Exception{
        	try{
	        	element = driver.findElement(By.id("ctl00_cphDescription_SignIn1_lnkBtnSignIn"));
	           // Log.info("Sign-in button is found on the Login page");
        	}catch (Exception e){
        		//Log.error("Sign-In button is not found on the Login Page");
           		throw(e);
           		}
           	return element;
        }
}
