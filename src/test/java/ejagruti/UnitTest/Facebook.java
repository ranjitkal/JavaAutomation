/**package ejagruti.UnitTest;

import java.util.Hashtable;

import ejagruti.gfl.SeleniumOperations;
import ejagruti.gfl.SetTextCode;

public class Facebook
{
	
	public static void main(String args[]) throws Exception
	{
		
		Object[] inputParameters=new Object[3];
		inputParameters[0]="IE";
		inputParameters[1]="E:\\WorkSpace\\TestIng\\ejagruti\\src\\test\\resources\\DRIVERS\\IEDriverServer.exe";
		//inputParameters[2]="http://localhost:90/finsys/login.html";
		inputParameters[2]="https://www.facebook.com/";
		
	    Hashtable<String,Object>  output=SeleniumOperations.LaunchApplication(inputParameters);
	   
		    //   user name object 
		    Object[] inputParameters12=new Object[2];
		    inputParameters12[0]= "//*[ @id='email']";
			inputParameters12[1]="ranjitkalgavkar@gmail.com";	
			
			// password object
		    Object[] inputParameters13=new Object[2];
		    inputParameters13[0]= "//*[ @id='pass']";
		    inputParameters13[1]="prianu";
		    //username calling
		    Hashtable<String,Object>  output12=SeleniumOperations.SetText(inputParameters12);
		    //password calling
		    Hashtable<String,Object>  output13=SeleniumOperations.SetText(inputParameters13);
		    
		    
		    Object[] inputParameters14=new Object[1];
		    inputParameters14[0]="//*[@id='loginbutton]";
		    Hashtable<String,Object>  output4=SeleniumOperations.Click(inputParameters14);
		    
		    
	    
	}

}
**/