package omrbranch;
                                                               //SELENIUM USING MAVEN BUILD MANAGEMENT TOOL
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Grocery {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//Login
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("email")).sendKeys("venkateshsel99@gmail.com ");
		driver.findElement(By.id("pass")).sendKeys("Selva@kamali1");
		driver.findElement(By.xpath("//button[@value='login']")).click();
		
		//Print Welcome UserName
		WebElement element = driver.findElement(By.xpath("//a[@data-testid='username']"));
		String text = element.getText();
		System.out.println(text);
		driver.findElement(By.id("search")).sendKeys("nuts");
		driver.findElement(By.xpath("//button[@data-testid='searchbtn']")).click();
		WebElement element2 = driver.findElement(By.xpath("//h5[@class='sectionTitle font35 font-weight-bold color11']"));
		String text2 = element2.getText();
		System.out.println(text2);
		driver.findElement(By.xpath("(//a[text()='Add'])[1]")).click();
		driver.findElement(By.id("cart-21")).click();
		WebElement gotocart = driver.findElement(By.xpath(" //a[text()=' Go To Cart ']"));
		Thread.sleep(3000);
		gotocart.click();
		
		//Print My Cart
		WebElement element3 = driver.findElement(By.xpath("//h5[text()='My Cart']"));
		String text3 = element3.getText();
		System.out.println(text3);
		
		//Print Delivery Address
		WebElement element4 = driver.findElement(By.xpath("//div[text()='Delivery Address']"));
		String text4 = element4.getText();
		System.out.println(text4);
		
		//Enter Basic Details
		driver.findElement(By.xpath("//div[@data-target='#addressModal']")).click();
		WebElement AddressType = driver.findElement(By.xpath("//select[@id='address_type']"));
		Select select=new Select(AddressType);
		select.selectByIndex(1);
		driver.findElement(By.xpath("(//input[@name='first_name'])[1]")).sendKeys("venkatesh");
		driver.findElement(By.xpath("(//input[@name='last_name'])[1]")).sendKeys("selva");
		driver.findElement(By.xpath("(//input[@name='mobile'])[1]")).sendKeys("7598348238");
		driver.findElement(By.xpath("(//input[@name='apartment'])[1]")).sendKeys("W/15");
		driver.findElement(By.xpath("(//input[@name='address'])[1]")).sendKeys("omr,chennai");
		WebElement element6 = driver.findElement(By.xpath("//select[@class='form-control height50 state']"));
		Select select2=new Select(element6);
		select2.selectByValue("1");
		WebElement city = driver.findElement(By.xpath("//select[@name='city']"));
		Select select8=new Select(city);
		select8.selectByValue("1");
		driver.findElement(By.xpath("//input[@name='zipcode']")).sendKeys("600119");
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		
		//ScrollDown
		WebElement scrolldown = driver.findElement(By.xpath("//div[@class='font20 fontSemiBold colorTheme mt-4  mb-2']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		//Print PaymentMethod
		WebElement element7 = driver.findElement(By.xpath("  //div[text()='  Payment Method ']"));
		String text5 = element7.getText();
		System.out.println(text5);
		Thread.sleep(3000);
		
		//Enter Payment Details
		WebElement element8 = driver.findElement(By.xpath("//select[@id='payment_type']"));
		Select select3=new Select(element8);
		select3.selectByValue("debit_card");
		driver.findElement(By.xpath("//label[@for='visa_card']")).click();
		driver.findElement(By.xpath("//input[@name='card_no']")).sendKeys("5555555555552222");
		WebElement element9 = driver.findElement(By.xpath("//select[@id='month']"));
		Select select4=new Select(element9);
		select4.selectByValue("February");
	    WebElement element10 = driver.findElement(By.xpath("//select[@id='year']"));
	    Select select5=new Select(element10);
	    select5.selectByValue("2025");
	    driver.findElement(By.xpath("//input[@name='cvv']")).sendKeys("234");
	    driver.findElement(By.xpath("//button[@id='placeOrder']")).click();
	    driver.findElement(By.id("email")).sendKeys("venkateshsel99@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Selva@kamali1");
		driver.findElement(By.xpath("//button[@value='login']")).click();
	    driver.findElement(By.xpath("//a[@data-testid='username']")).click();
	    driver.findElement(By.xpath("//a[text()='My Account']")).click();
	    driver.findElement(By.xpath("//a[text()='orders']")).click();
	    Thread.sleep(3000);
	    
	    //Order Details
	    WebElement orderno = driver.findElement(By.xpath("//p[@data-testid='order_no1']"));
	    String text6 = orderno.getText();
	    System.out.println(text6);
	    WebElement ordernumber = driver.findElement(By.xpath("(//span[@class='font16 ml-2'])[1]"));
	    String text7 = ordernumber.getText();
	    System.out.println(text7);
	    
	}
}
//driver.findElement(By.xpath("//a[@class='cart_btn']")).click();