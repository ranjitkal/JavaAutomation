package ejagruti.gfl;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SetTextCode
{
	
	public static WebDriver driver=null;//--to perform web UI operations
	public static WebDriverWait wait=null;//---to achieve explicit wait
	public static Hashtable<String,Object> outputParameters1=new Hashtable<String,Object>();
	private static WebElement GetRunTimeObject(String xPath)
	
	{
		 
		return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPath)));
	}
	public static Hashtable<String,Object> Settext(Object[] inputParameters1) throws Exception
	{ 

		String xPathLocator=(String)inputParameters1[0];
		String valueToEnter=(String)inputParameters1[1];

		
		try
		{
			
			WebElement obj=GetRunTimeObject(xPathLocator);
			obj.clear();
			obj.sendKeys(valueToEnter);
			
			outputParameters1.put("STATUS","PASS");
			outputParameters1.put("Message","Action: SetText,Input Given:"+inputParameters1.toString());
		}catch(Exception e)
		{
			throw e;
		}
		return outputParameters1;
	}
		

}
