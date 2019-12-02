package ejagruti.gfl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import java.util.*;

public class Parameter 
	{
       private static String filePath;
       public Parameter(String strFilePath)
       {
          filePath = strFilePath;
  	   }
public  String Getparametervalue(String parameterName)
		{
			String currentparameterValue ="";
			String currentparameterName = "";
		try
		{
			File file = new File(filePath);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String st;
			String ParameterNameToFind = parameterName;
			boolean parameterFound = false;
			
			while((st = br.readLine()) != null)
			{
			//System.out.println("Read file"+st);
			
			if(!st.startsWith("#") && ! st.trim().equals("") && st.contains("="))
				{
					String[] words = st.split("=");
					
					currentparameterName = "";
					
					currentparameterValue = "";
					
				if(words.length == 2)
				{
					
					currentparameterName = words[0] + "";
					currentparameterValue = words[1] + "";
				}
				
				
				if(ParameterNameToFind.trim().toUpperCase().equals(currentparameterName.trim().toUpperCase()))
				{
					parameterFound = true;
					//System.out.println("parameterName : " + currentparameterName);
					//System.out.println("parameterValue : " + currentparameterValue);
					break;
				}
			
		}
			}
			br.close();
			
			if(!parameterFound)
			{
			currentparameterValue = null;
			}
			
			}
		catch(Exception Ex)
		{
		System.out.println("Error occured : " + Ex.getLocalizedMessage());
		}
		
		return currentparameterValue;
		
		}

}
