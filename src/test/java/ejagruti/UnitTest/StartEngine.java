package ejagruti.UnitTest;

import java.util.Hashtable;

import ejagruti.gfl.Parameter;
import ejagruti.gfl.SeleniumOperations;
import ejagruti.gfl.SetTextCode;
import ejagruti.pages.LoginPage;

public class StartEngine
{
	
	public static void main(String args[]) throws Exception
	{
		
        Parameter par=new Parameter("E:\\WorkSpace\\TestIng\\ejagruti\\src\\test\\resources\\PARAMETERS\\InputParameter.txt");
       // String output= par.Getparametervalue("username");
      // System.out.println(output);
		Object[] inputParameters=new Object[3];
		inputParameters[0]="IE";
		inputParameters[1]="E:\\WorkSpace\\TestIng\\ejagruti\\src\\test\\resources\\DRIVERS\\IEDriverServer.exe";
		inputParameters[2]="http://localhost:90/finsys/login.html";
	   // Hashtable<String,Object>  output=SeleniumOperations.LaunchApplication(inputParameters);
		SeleniumOperations seleobj=new SeleniumOperations();
		seleobj.LaunchApplication(inputParameters);
	
		LoginPage login=new LoginPage();
		inputParameters[0]=login.objusername;
		//System.out.println("objusername\t"+par.Getparametervalue("objusername"));
		inputParameters[1]=par.Getparametervalue("username");
		seleobj.SetText(inputParameters);
		
	  //Hashtable<String,Object>  outputUsername=SeleniumOperations.SetText(inputParameters);
		
		// password object
	   
	    inputParameters[0]=login.objpassword;
		inputParameters[1]=par.Getparametervalue("password");
	    seleobj.SetText(inputParameters);
		
		 inputParameters[0]=login.objLoginClcik;				 
         seleobj.Click(inputParameters);
	    //password calling
	   // Hashtable<String,Object>  outputpassword=SeleniumOperations.SetText(inputParameters);
	   // Object[] objLoginClcik=new Object[1];	
	  //  objLoginClcik[0]= "//*[@class='easyui-linkbutton l-btn l-btn-small easyui-fluid']";
	   // Hashtable<String,Object>  outputLoginClcik=SeleniumOperations.Click(objLoginClcik);
	  //  inputParameters[0]=login.objLoginClcik;
		
	   // Hashtable<String,Object>  outputLoginClick=SeleniumOperations.Click(inputParameters);
	    //click method calling
	/*   
	    Object[] objClickManageCompany=new Object[1];
	    objClickManageCompany[0]="//*[contains(text(),'Manage Company')]";
	    Hashtable<String,Object>  OutputClickManageCompany=SeleniumOperations.Click(objClickManageCompany);
	 
	   
	    //
      Object[] objSwtchFrame=new Object[1];
      objSwtchFrame[0]="//*[@id='actionid']";
	  //inputParameters9[0]="//*[@class='panel-title panel-with-icon' and contains()]";
	  Hashtable<String,Object>  outputSwtchFrame=SeleniumOperations.SwitchFrame(objSwtchFrame);
	    
	     Object[] objClicknew=new Object[1];
	     objClicknew[0]="//*[@class='l-btn-text' and contains(text(),'New')]";
	     Hashtable<String,Object>  Clicknewoutput=SeleniumOperations.Click(objClicknew);
	    
	        Object[] objCompanyname=new Object[2];
	        objCompanyname[0]= "//*[@name='name']";
	        objCompanyname[1]="Ranjit";
		    //username calling
		    Hashtable<String,Object>  outputCompanyname=SeleniumOperations.SetText(objCompanyname);
		    
		    
		    Object[] objcompanytype=new Object[2];
		    objcompanytype[0]= "//select[@id='companytype']";
		    objcompanytype[1]= "2";
		    Hashtable<String,Object>  outputcompanytype=SeleniumOperations.SelectDropDown(objcompanytype);
          
            Object[] objsubtype=new Object[2];
            objsubtype[0]="//select[@name='subtype']";
            objsubtype[1]= "2";
	   	    Hashtable<String,Object>  outputsubtype=SeleniumOperations.SelectDropDown(objsubtype);
 
		    Object[] objaddress=new Object[2];
		    objaddress[0]= "//*[@class='textbox-text validatebox-text textbox-prompt']";
		    objaddress[1]="baramati";
		    //username calling
		    Hashtable<String,Object>  outputaddress=SeleniumOperations.SetText(objaddress);
		    
		    
		    Object[] objphone=new Object[2];
		    objphone[0]= "/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[22]/td/div/div/div/form/table/tbody/tr[5]/td[2]/span/input[1]";
		    objphone[1]="02058968";
		    //username calling
		    Hashtable<String,Object>  outputphone=SeleniumOperations.SetText(objphone);
		    
		    
		    Object[] objemail=new Object[2];
		    objemail[0]= "//*[@class='easyui-validatebox validatebox-text validatebox-invalid' and @name='email']";
		    objemail[1]="cnranjit@gmail.com";
		    Hashtable<String,Object>  outputemail=SeleniumOperations.SetText(objemail);
		    
		    Object[] objpancard=new Object[2];
		    objpancard[0]= "//*[@class='easyui-validatebox validatebox-text validatebox-invalid' and @name='pan']";
		    objpancard[1]="AAAPL1234C";
		    Hashtable<String,Object>  outputpancard=SeleniumOperations.SetText(objpancard);
		    
		    
            Object[] objmobileno=new Object[2];
            objmobileno[0]= "/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[22]/td/div/div/div/form/table/tbody/tr[3]/td[2]/span/input[1]";
            objmobileno[1]="9956898552";
		    //username calling
		    Hashtable<String,Object>  outputmobileno=SeleniumOperations.SetText(objmobileno);
		    
		    Object[] objtinno=new Object[2];
		    objtinno[0]= "//*[@class='easyui-validatebox validatebox-text validatebox-invalid' and @name='tin']";
		    objtinno[1]="874587458745";
		    Hashtable<String,Object>  outputtinno=SeleniumOperations.SetText(objtinno);
		    
		    
		    
		    
		    Object[] objwebsite=new Object[2];
		    objwebsite[0]= "//*[@class='easyui-validatebox validatebox-text' and @name='website']";
		    objwebsite[1]="www.hello.com";
		    Hashtable<String,Object>  outputwebsite=SeleniumOperations.SetText(objwebsite);
		    
		    Object[] objcountry=new Object[2];
		    objcountry[0]= "//*[@id='countryid']";
		    objcountry[1]= "1";
		    Hashtable<String,Object>  outputcountry=SeleniumOperations.SelectDropDown(objcountry);
		    
		    Object[] objstate=new Object[2];
		    objstate[0]= "//*[@id='stateidlist']";
		    objstate[1]= "20";
		    Hashtable<String,Object>  outputstate=SeleniumOperations.SelectDropDown(objstate);
		    
		    Object[] objcity=new Object[2];
		    objcity[0]= "//*[@id='citylist']";
		    objcity[1]= "21";
		    Hashtable<String,Object>  outputcity=SeleniumOperations.SelectDropDown(objcity);
		  
		  
		    Object[] objempNo=new Object[2];
		    objempNo[0]= "/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[22]/td/div/div/div/form/table/tbody/tr[8]/td[2]/span/input[1]";
		    objempNo[1]="50";
		    //username calling
		    Hashtable<String,Object>  outputempNo=SeleniumOperations.SetText(objempNo);
		    
		    
		     Object[] objAddClick=new Object[1];
		     objAddClick[0]="/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[22]/td/div/div/div/form/div/a[1]";
		     Hashtable<String,Object>  outputAddClick=SeleniumOperations.Click( objAddClick);
		     
		   
	  
		    
		        Object[] objcompareCompany=new Object[2];
		        objcompareCompany[0]=  "/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[1]";
		        objcompareCompany[1]="Ranjit";
			    //username calling
			    Hashtable<String,Object>  outptcompareCompany=SeleniumOperations.ComparetableData(objcompareCompany);
		    */
	    
	}

}
