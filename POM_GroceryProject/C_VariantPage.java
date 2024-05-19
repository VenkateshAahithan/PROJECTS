package POM_GroceryProject;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;



public class C_VariantPage extends BaseClass {
	
	@FindBy(xpath="((//a[text()='Add'])[1])")
	private WebElement Add;
	
	@FindBy(xpath="(//button[text()='Add'])[1]")
	private WebElement sizevariant;
	
	@FindBy(xpath="//a[text()=' Go To Cart ']")
	private WebElement Gotocart;
	

	@FindBy(xpath="//h5[text()='My Cart']")
	private WebElement MyCart;
	
	

	public WebElement getAdd() {
		return Add;
	}

	public WebElement getSizevariant() {
		return sizevariant;
	}

	public WebElement getGotocart() {
		return Gotocart;
	}

	public String getMyCart() {
	String mycart = ElementGetText(MyCart);
	return mycart;
	}
	
	public void clickvariantpage() throws InterruptedException {
		ElementClick(Add);
		ElementClick(sizevariant);Thread.sleep(5000);
		ElementClick(Gotocart);
		
		
	}


	public C_VariantPage() {
		PageFactory.initElements(driver, this);
		
	}
	

}
