package POM_GroceryProject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;



public class D_AddressAndPayment extends BaseClass {
	
	public D_AddressAndPayment() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='Delivery Address']")
	private WebElement selectaddress;
	
	@FindBy(xpath="//div[@data-toggle='modal']")
	private WebElement clickaddress;
	
	@FindBy(xpath="//select[@id='address_type']")
	private WebElement selectaddresstype;
	
	@FindBy(xpath="(//input[@name='first_name'])[1]")
	private WebElement firstname;
	@FindBy(xpath="(//input[@name='last_name'])[1]")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@name='mobile'])[1]")
	private WebElement conductno;
	
	@FindBy(xpath="(//input[@name='apartment'])[1]")
	private WebElement houseno;
	
	@FindBy(xpath="(//input[@name='address'])[1]")
	private WebElement Address;
	
	@FindBy(xpath="(//select[@name='state'])[1]")
	private WebElement state;
	
	@FindBy(xpath="(//select[@name='city'])[1]")
	private WebElement city;
	
	@FindBy(xpath="(//input[@name='zipcode'])[1]")
	private WebElement zipcode;
	
	@FindBy(xpath="(//button[text()='Save'])[3]")
	private WebElement save;
	
	@FindBy(xpath="(//div[@class='font20 fontSemiBold color20 mb-4'])[1]")
	private WebElement paymentmethod;
	
	@FindBy(xpath="(//select[@id='payment_type'])[1]")
	private WebElement clickpaymentmethod;
	
	@FindBy(xpath="//label[@for='visa_card']")
	private WebElement visa;
	
	@FindBy(xpath="//input[@name='card_no']")
	private WebElement cardno ;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement year;
	
	@FindBy(xpath="//input[@name='cvv']")
	private WebElement cvv;
	

public WebElement getselectAddress() {
		return selectaddress;
	}


	public WebElement getClickaddress() {
		return clickaddress;
	}


	public WebElement getSelectaddresstype() {
		return selectaddresstype;
	}


	public WebElement getFirstname() {
		return firstname;
	}


	public WebElement getLastname() {
		return lastname;
	}


	public WebElement getConductno() {
		return conductno;
	}


	public WebElement getHouseno() {
		return houseno;
	}


	public WebElement getAddress() {
		return Address;
	}


	public WebElement getState() {
		return state;
	}


	public WebElement getCity() {
		return city;
	}


	public WebElement getZipcode() {
		return zipcode;
	}


	public WebElement getSave() {
		return save;
	}


	public WebElement getPaymentmethod() {
		return paymentmethod;
	}


	public WebElement getClickpaymentmethod() {
		return clickpaymentmethod;
	}


	public WebElement getVisa() {
		return visa;
	}


	public WebElement getCardno() {
		return cardno;
	}


	public WebElement getMonth() {
		return month;
	}


	public WebElement getYear() {
		return year;
	}


	public WebElement getCvv() {
		return cvv;
	}


public void address(String homeaddress, String venkatesh,String selvaraj, String conduct_number, String house_no, String Addressdetails, String Zipcode, String tamilnadu, String madurai) throws InterruptedException {
	
	ElementClick(clickaddress);
	ElementDDtrribute(selectaddresstype, homeaddress);
	elementSendKeys(firstname, venkatesh);
	elementSendKeys(lastname, selvaraj);
	elementSendKeys(conductno, conduct_number);
	elementSendKeys(houseno, house_no);
	elementSendKeys(Address, Addressdetails);
	elementSendKeys(zipcode, Zipcode);
	ElementDDtrribute(state, tamilnadu);
	ElementDDtrribute(city, madurai);

//	Thread.sleep(4000);
	ElementClick(save);

	
}
public void payment(String clickpayment, String Cardno, String CVV, String Month, String Year) throws InterruptedException {
//	Thread.sleep(7000);
	ElementDDtrribute(clickpaymentmethod, clickpayment);
	elementSendKeys(cardno, Cardno);
	elementSendKeys(cvv, CVV);
	ElementDDtrribute(month, Month);
	ElementDDtrribute(year, Year);
	ElementClick(visa);
	
}

public String paymentmethod() {
	String elementGetText = ElementGetText(paymentmethod);
	return elementGetText;
}

public String  deliveryaddress() {
	String deliveryaddress = ElementGetText(selectaddress);
	return deliveryaddress;
}



}





	