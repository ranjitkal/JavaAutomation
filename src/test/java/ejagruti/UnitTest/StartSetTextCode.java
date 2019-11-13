package ejagruti.UnitTest;

import java.util.Hashtable;

import ejagruti.gfl.SeleniumOperations;
import ejagruti.gfl.SetTextCode;

public class StartSetTextCode
{
		
		public static void main(String args[]) throws Exception
		{
			
		    Object[] inputParameters1=new Object[2];
		    
		    inputParameters1[0]="//input[@id='firstval']"; 
			inputParameters1[1]="Ranjit";
		
		    Hashtable<String,Object>  output1=SetTextCode.Settext(inputParameters1);
				
		

	}


}
