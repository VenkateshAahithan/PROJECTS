package POM_GroceryProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;



public class E_PlaceOrder extends BaseClass {
	public E_PlaceOrder() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='placeOrder']")
	private WebElement placeorder;
	
	@FindBy(xpath="//p[@class='font18 color20 fontSemiBold mb-0'][1]")
	private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getPlaceorder() {
		return placeorder;
	}
	public  void placeorder1() {
		ElementClick(placeorder);
	}
	public String orderno() throws InterruptedException {
		Thread.sleep(7000);
		String on = ElementGetText(orderno);
		return on;
	}
	
	

}
