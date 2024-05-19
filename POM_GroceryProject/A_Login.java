package POM_GroceryProject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;



public class A_Login extends BaseClass{
	
	@FindBy(id="email")
	private WebElement txtemail;
	
	@FindBy(id="pass")
	private WebElement txtpass;
	
	@FindBy(xpath="//button[text()='Login']")
	private WebElement btnlogin;
	
	


	public WebElement getTxtemail() {
		return txtemail;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public void login(String email, String password) throws IOException {
		elementSendKeys(txtemail, email);
		elementSendKeys(txtpass, password);
		ElementClick(btnlogin);
		
		
	}
	
	public A_Login() {
		PageFactory.initElements(driver, this);
		
	}
	
		
	}

		
	
