package ejagruti.pages;

public class AddCompany
{
	
	public static String objClickManageCompany="//*[contains(text(),'Manage Company')]";
	
	public static String objSwtchFrame="//*[@id='actionid']";

	public static String objClicknew="//*[@class='l-btn-text' and contains(text(),'New')]";

	public static String objCompanyname= "//*[@name='name']";

	public static String objcompanytype= "//select[@id='companytype']";

	public static String objsubtype="//select[@name='subtype']";

	public static String objaddress= "//*[@class='textbox-text validatebox-text textbox-prompt']";

	public static String objphone= "/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[22]/td/div/div/div/form/table/tbody/tr[5]/td[2]/span/input[1]";

	public static String objemail= "//*[@class='easyui-validatebox validatebox-text validatebox-invalid' and @name='email']";

	public static String objpancard= "//*[@class='easyui-validatebox validatebox-text validatebox-invalid' and @name='pan']";

	public static String objmobileno= "/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[22]/td/div/div/div/form/table/tbody/tr[3]/td[2]/span/input[1]";

	public static String objtinno= "//*[@class='easyui-validatebox validatebox-text validatebox-invalid' and @name='tin']";

	public static String objwebsite= "//*[@class='easyui-validatebox validatebox-text' and @name='website']";

	public static String objcountry= "//*[@id='countryid']";
   
	public static String objstate= "//*[@id='stateidlist']";

	public static String objcity= "//*[@id='citylist']";

	public static String objempNo= "/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[22]/td/div/div/div/form/table/tbody/tr[8]/td[2]/span/input[1]";

	public static String objAddClick="/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[22]/td/div/div/div/form/div/a[1]";
	
	public static String objcompareCompany="/html/body/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[1]";

}
