package Automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutomationTest {

    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://va-server02/CalcmenuWeb_Template_V91/index.aspx";
        driver.manage().window().maximize();
        //String expectedTitle = "Welcome: Mercury Tours";
        //String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
       //actualTitle = driver.getTitle();

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        /*if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
       } else {
            System.out.println("Test Failed");
        }*/
        
        driver.findElement(By.id("ctl00_cphDescription_SignIn1_txtUserName")).sendKeys("admin");
        driver.findElement(By.id("ctl00_cphDescription_SignIn1_txtPassword")).sendKeys("admin");
        driver.findElement(By.id("ctl00_cphDescription_SignIn1_lnkBtnSignIn")).click();
  
        // new frame
        WebElement frame = driver.findElement(By.name("header"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//*[@id=\"RadTabStrip1\"]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl09\"]/div/div/div/ul/li[1]")).click();
        driver.switchTo().defaultContent();
        
        WebElement frame1  = driver.findElement(By.id("main"));
    	driver.switchTo().frame(frame1);
    	driver.findElement(By.xpath("//*[@id=\"maintab\"]/div/div[1]/div[2]/div/div[2]/table[2]/tbody/tr[1]/td[2]/input")).sendKeys("EGSTest_1222");
    	driver.findElement(By.xpath("//*[@id=\"maintab\"]/div/div[1]/div[2]/div/div[2]/table[2]/tbody/tr[7]/td[2]/select")).sendKeys("01 Cat");
       
        //close Fire fox
       // driver.close();
       
    }

}