package POM_GroceryProject;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import BaseClass.BaseClass;



public class F_FinalPom extends BaseClass {
	@BeforeClass
	public static void beforeclass() throws InterruptedException {
		browserLaunch();
		maximize();
		getURL("https://omrbranch.com/");
		implicitWait();

	}

	@Test
	public void clicklogin() throws IOException, InterruptedException {
		A_Login BT = new A_Login();
		BT.login(getCellValueof("JunitGrocery", 2, 1), getCellValueof("JunitGrocery", 2, 2));
		B_SearchProduct sp = new B_SearchProduct();
		Assert.assertEquals("Verify the welcome message", getCellValueof("JunitGrocery", 2, 3),
				sp.getWelcomeUsername());
    	sp.Searchproduct(getCellValueof("JunitGrocery", 2, 4));
		Assert.assertEquals("Verify the search msg", getCellValueof("JunitGrocery", 2, 4), sp.getSearchProuct());
		C_VariantPage vp=new C_VariantPage();
		vp.clickvariantpage();
		Assert.assertEquals("verify MyCart", getCellValueof("JunitGrocery", 2, 5), vp.getMyCart());
	}
		@Test
		public void addressandpayment() throws IOException, InterruptedException {
			D_AddressAndPayment ap=new D_AddressAndPayment();
			 ap.address(getCellValueof("JunitGrocery", 5, 10), 
					 getCellValueof("JunitGrocery", 5, 3),
					 getCellValueof("JunitGrocery", 5, 4),
					 getCellValueof("JunitGrocery", 5, 5), 
					 getCellValueof("JunitGrocery", 5, 6), 
					 getCellValueof("JunitGrocery", 5, 7), 
					 getCellValueof("JunitGrocery", 5, 8), 
					 getCellValueof("JunitGrocery", 8, 5), 
					 getCellValueof("JunitGrocery", 8, 6));
			 Assert.assertEquals("verify delivery", getCellValueof("JunitGrocery", 2, 7), ap.deliveryaddress());
			ap.payment(getCellValueof("JunitGrocery", 5, 9),
					getCellValueof("JunitGrocery", 5, 1),
					getCellValueof("JunitGrocery", 5, 2),
					getCellValueof("JunitGrocery", 8, 2),
					getCellValueof("JunitGrocery", 8, 3));
			Assert.assertEquals("verify paymentmethod", getCellValueof("JunitGrocery", 2, 6), ap.paymentmethod());
			E_PlaceOrder po=new E_PlaceOrder();
			po.placeorder1();
			po.setOneCellValue("JunitGrocery", 8, 4, po.orderno());
		
		
		}
		
}

