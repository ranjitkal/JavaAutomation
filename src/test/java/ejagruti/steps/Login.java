package ejagruti.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login
{
  // When user opens the "IE" browser
	@When ("^user opens the \"(.*)\" browser$")
	public void OpenBrowser(String input1)
	{
		System.out.println(" When user opens the \"IE\" browser");
	}
	
	@And ("^user enters the url \"(.*)\"$")
    public void  applicationUrl(String input2)
    {
    	System.out.println("And user enters the url \"http://localhost:90/finsys\"");
    }
    
	
	  @Given ("^user is on the application login page$")
	  public void logipage()
	  {
		  System.out.println("  Given user is on the application login page");
	  }
    @When ("^user enters \"(.*)\" as username$")
    public void enterUsername(String input3)
    {
    	System.out.println("When user enters \"dummyfm\" as username");
    }

    @And ("^user enters \"(.*)\" as password$")
    public void enterPassword(String input3)
    {
    	System.out.println(" And user enters \"passw0rd\" as password");
    }
    
   @And ("^user clicks on login button$")
    public void clickLoginButton()
    {
    	System.out.println("And user clicks on login button");

    }
   @Then ("^user is on the application home page$")
 	public void homepage()
 	{
 		System.out.println();
 	}
 	
 	@And ("^user gets the message starting with \"(.*)\" on the top$")
     public void getMessage(String input6)
     {
    	 
    	 System.out.println(" And user gets the message starting with \"Welcome\" on the top\r\n");
     }
     
 	

}