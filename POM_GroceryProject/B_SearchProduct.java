package POM_GroceryProject;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;



public class B_SearchProduct extends BaseClass{
	@FindBy(xpath="(//li[@class='dropdown']//a)[1]")
	private WebElement welcomeUsername;
	
	@FindBy(xpath="//input[@id='search']")
	private WebElement enterdatasearch;
	
	public String getWelcomeUsername() {
		String elementGetText = ElementGetText(welcomeUsername);
		return elementGetText;
	}
	public WebElement getSearch() {
		
		return enterdatasearch;
	}
	public String getSearchProuct() {
		String elementGetAttribute = ElementGetAttribute(enterdatasearch, "value");
		return elementGetAttribute;

	}
	
	
public void Searchproduct( String enterdata) {
	
	elementSendKeysenterkeys(enterdatasearch, enterdata);
}


public B_SearchProduct() {
	PageFactory.initElements(driver, this);
}
}
