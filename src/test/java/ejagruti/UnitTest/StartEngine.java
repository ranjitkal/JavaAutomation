package ejagruti.UnitTest;

import java.util.Hashtable;

import ejagruti.gfl.SeleniumOperations;
import ejagruti.gfl.SetTextCode;

public class StartEngine
{
	
	public static void main(String args[]) throws Exception
	{
		
		Object[] inputParameters=new Object[3];
		inputParameters[0]="IE";
		inputParameters[1]="E:\\WorkSpace\\TestIng\\ejagruti\\src\\test\\resources\\DRIVERS\\IEDriverServer.exe";
		inputParameters[2]="http://localhost:90/finsys/login.html";
		
	    Hashtable<String,Object>  output=SeleniumOperations.LaunchApplication(inputParameters);
	    
	    //   user name object 
	    Object[] inputParameters1=new Object[2];
	    inputParameters1[0]= "//*[ @placeholder='Username']";
		inputParameters1[1]="dummyfm";	
		
		// password object
	    Object[] inputParameters2=new Object[2];
	    inputParameters2[0]= "//*[ @placeholder='Password']";
	    inputParameters2[1]="passw0rd";
	    //username calling
	    Hashtable<String,Object>  output1=SeleniumOperations.SetText(inputParameters1);
	    //password calling
	    Hashtable<String,Object>  output2=SeleniumOperations.SetText(inputParameters2);
	    
	    //click method calling
	    Object[] inputParameters3=new Object[2];	
	    inputParameters3[0]= "//*[@class='easyui-linkbutton l-btn l-btn-small easyui-fluid']";
	    Hashtable<String,Object>  output3=SeleniumOperations.Click(inputParameters3);
	    	
	}

}
