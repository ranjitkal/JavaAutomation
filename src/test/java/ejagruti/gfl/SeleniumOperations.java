package ejagruti.gfl;



import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SeleniumOperations {
	
	
	
	public static WebDriver driver=null;//--to perform web UI operations
	public static WebDriverWait wait=null;//---to achieve explicit wait
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();//---to return output
	/**
	 * Purpose: Used to Launch the Application for the given Browser
	 * @param : object[] 
	 * Accepts 3 Parameters : String strBrowserName, String WebDriverExePath,String strURL
	 * @return
	 * @throws Exception
	 */
	
	// Method Luanch Application
	public static Hashtable<String,Object> LaunchApplication(Object[] inputParameters) throws Exception { 
		
		try
		{
			outputParameters.clear();
			String strBrowserName=(String)inputParameters[0]; 
			String WebDriverExePath=(String)inputParameters[1];
			String strURL=(String)inputParameters[2];
			if (strBrowserName.equalsIgnoreCase("FF"))
			{
				System.setProperty("webdriver.gecko.driver",WebDriverExePath);
				driver = new FirefoxDriver();
				driver.navigate().to(strURL);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
				
			}
			else if(strBrowserName.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",WebDriverExePath);
				driver = new ChromeDriver();
				driver.navigate().to(strURL);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
			}
			
			else if(strBrowserName.equalsIgnoreCase("IE"))
			{
				System.setProperty("webdriver.ie.driver",WebDriverExePath);
				driver = new InternetExplorerDriver();
				driver.navigate().to(strURL);
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			}	
			//----used for explicit wait
			wait=new WebDriverWait(driver, 60);
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("Message", "Action:LaunchApplication,Input Given:"+inputParameters.toString());
		}
		catch(Exception e)
		{
			throw e;
		}
		return outputParameters;
	}
	
	// Method Set Text
	
private static WebElement GetRunTimeObject(String xPath)
	
	{
		 
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
	}



	public static Hashtable<String,Object> SetText(Object[] inputParameters) throws Exception
	{ 

		String xPathLocator=(String)inputParameters[0];
		String valueToEnter=(String)inputParameters[1];

		

		
		try
		{
			
			WebElement obj=GetRunTimeObject(xPathLocator);
			 obj.clear();
			 obj.sendKeys(valueToEnter);
			
			outputParameters.put("STATUS","PASS");
			outputParameters.put("Message","Action: SetText,Input Given:"+inputParameters.toString());
		}catch(Exception e)
		{
			throw e;
		}
		return outputParameters;
	}
		
	// Method Click Button And Link
	public static Hashtable<String,Object> Click(Object[] inputParameters) throws Exception
	{ 

		String xPathLocator=(String)inputParameters[0];
		

		
		try
		{
			
			WebElement obj=GetRunTimeObject(xPathLocator);
		   	obj.click();
        	
			
			outputParameters.put("STATUS","PASS");
			outputParameters.put("Message","Action: Click,Input Given:"+inputParameters.toString());
		}catch(Exception e)
		{
			throw e;
		}
		return outputParameters;
	}
		
		
	//Method Comapre Actual Result With Excepted Result
	
	public static Hashtable<String,Object> compare(Object[] inputParameters) throws Exception
	{ 

		String xPathLocator=(String)inputParameters[0];
		

		
		try
		{
			
			WebElement obj=GetRunTimeObject(xPathLocator);
			

			System.out.println("Assert equals method validation");
			
			Assert.assertEquals(obj, driver.getTitle());
            
			outputParameters.put("STATUS","PASS");
			outputParameters.put("Message","Action: compare,Input Given:"+inputParameters.toString());
		}catch(Exception e)
		{
			throw e;
		}
		return outputParameters;
	}
	
	
	
	// Method Click Button And Link

		public static Hashtable<String,Object> SwitchFrame(Object[] inputParameters) throws Exception
		{ 

			String xPathLocator=(String)inputParameters[0];
			

			
			try
			{
				
				WebElement obj=GetRunTimeObject(xPathLocator);
				driver.switchTo().defaultContent();
				driver.switchTo().frame(obj);
				
				outputParameters.put("STATUS","PASS");
				outputParameters.put("Message","Action: SwitchFrame,Input Given:"+inputParameters.toString());
			}catch(Exception e)
			{
				throw e;
			}
			return outputParameters;
		}
			
		
		public static Hashtable<String,Object> SelectDropDown(Object[] inputParameters) throws Exception
		{ 

			String xPathLocator=(String)inputParameters[0];
			String value=(String)inputParameters[1];
			int i=Integer.parseInt(value);

			
			try
			{
				
				WebElement obj=GetRunTimeObject(xPathLocator);
				Select select = new Select(obj);
				select.selectByIndex(i);

				outputParameters.put("STATUS","PASS");
				outputParameters.put("Message","Action: SelectDropDown,Input Given:"+inputParameters.toString());
			}catch(Exception e)
			{
				throw e;
			}
			return outputParameters;
		}

		
		public static Hashtable<String,Object> ComparetableData(Object[] inputParameters) throws Exception
		{ 

			String xPathLocator=(String)inputParameters[0];
			String company=(String)inputParameters[1];
			
			
			try
			{
				
				WebElement obj=GetRunTimeObject(xPathLocator);
				Assert.assertEquals(company, obj.getText());
				
				
				outputParameters.put("STATUS","PASS");
				outputParameters.put("Message","Action: ComparetableData,Input Given:"+inputParameters.toString());
			}catch(Exception e)
			{
				throw e;
			}
			return outputParameters;
		}
		
		

			
		
	}
	
	
	

