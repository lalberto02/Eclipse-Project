package ObjectRepository;

import org.openqa.selenium.WebDriver;

import ObjectRepository.BaseClass;

public class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;
	public  BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		BaseClass.bResult = true;
	}

}
