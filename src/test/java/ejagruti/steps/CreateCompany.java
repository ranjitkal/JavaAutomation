package ejagruti.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCompany 
{
	
	
	
	@And ("^User Click on New Icon which is at the Top of displayed List.$")
	
	public void clickNew()
	{
	  System.out.println("And User Click on New Icon which is at the Top of displayed List.");
	}
	
	@Then ("^user is on the Application create company page.$")
	  public void creteCompany()
	  {
		  System.out.println("Then user is on the Application create company page.");
	  }
	  
	 @When ("^user enters \"(.*)\" as companyname.$")
		  public void enterCompanyName(String input4)
		  {
			  System.out.println("When user enters \"Ejagruti.pvt.ltd\" as companyname.");
		  }
	@And ("^user select dropdownlist  \"(.*)\" as companytype.^")
		  public void selectCompanytype(String input5)
		  {
			  System.out.println(" And user select dropdownlist  \"IT\" as companytype.");
		  }
   @And ("^user select dropdownlist  \"(.*)\" as company SUB type.$")
          public void selectCompanySubType(String input6)
          {
        	  System.out.println("  And user select dropdownlist  \"SERVICE\" as company SUB type.");
          }
   @And ("^user enters \"(.*)\" as address.$")
          public void enterAddress(String input7)
          {
        	  System.out.println("  And user enters \"office number 10,icon building ,baner,pune\" as address");
          }
   @And ("^user enters \"(.*)\" as phone.$")
          public void enterPhoneNumber(String input8)
          {
        	  System.out.println("  And user enters \"02054585\" as phone");
          }
   @And ("^user enters \"(.*)\" as Email.$")
         public void enterEmail(String input9)
         {
        	 System.out.println("  And user enters \"ejagruti@gmail.com\" as Email");
         }
   @And ("^user enters \"(.*)\" as pan details$")
         public void Enterpandetails(String input10)
         {
        	 System.out.println("  And user enters \"AAAPL1234C\" as pan details");
         }
   @And ("^user enters \"(.*)\" as Tin Details$")
         public void EnterTinDetails(String input11)
         {
        	 System.out.println("  And user enters \"874587458745\" as Tin Details");
         }
    @And ("^user enters \"(.*)\" as Mobile number$")
         public void enterMobile(String input12)     
         {
        	 System.out.println("  And user enters \"8989858585\" as Mobile number");
         }
     @And ("^user select dropdownlist  \"(.*)\" as Country.$")
        public void selectCompany(String input13)
        {
        	System.out.println("  And user select dropdownlist  \"India\" as Country.");

        }
     @And ("^user select dropdownlist  \"(.*)\" as state.$")
       public static void selectState(String input14)
       {
    	   System.out.println("  And user select dropdownlist  \"Maharashtra\" as state.");
       }
    @And ("^user select dropdownlist  \"(.*)\" as city.$")
       public void selectCity(String input15)
       {
    	   System.out.println("  And user select dropdownlist  \"Pune\" as city.");
       }
    @And ("^user enters \"(.*)\" as total emplyoee.$")
       public void enterTotalEmployee(String input16) 
       {
    	   System.out.println("  And user enters \"20\" as total emplyoee.");
       }
   @And ("^user clicks on Save button.$")
       public void clickSave()
       {
    	   System.out.println("  And user clicks on Save button.");
       }
   @Then ("^user see newly created company on the Top Of displayed Company List.$")
       public void checkCompany()
       {
    	   System.out.println("  Then user see newly created company on the Top Of displayed Company List.");
       }
   @ And ("^user gets the message New Company is created successfully.$")

       public void getMessage()
       {
    	   System.out.println("  And user gets the message New Company is created successfully.");
       }
       
       
}
