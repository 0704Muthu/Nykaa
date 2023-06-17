package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.base.TestBase;

public class BagPage extends TestBase {
	public BagPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//span[text()='Add to Bag'])[1]")
	private WebElement addToBag;
	@FindBy(xpath="//div[@class=\"css-0 e1ewpqpu1\"]")
	private WebElement order;
	
	
	@FindBy(xpath="//span[@class='cart-count']")
	private WebElement cart;

	@FindBy(xpath="//div[@class='css-e7m3y7 e2bqcji3']//span[@label='2']")
	private WebElement qty;

	@FindBy(xpath="//span[text()='Proceed']")
	private WebElement proceed;

	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login;

	@FindBy(xpath="//button[text()='Deliver here']")
	private WebElement deliver;
	//
	
	@FindBy(xpath="//div[@class='css-46b9vi efuv1qx0']//following::p[text()='Cash on delivery']")
	private WebElement cash;
	
	@FindBy(xpath="//button[text()='Place order']")
	private WebElement placeorder;
	
	
	@FindBy(name="otpValue")
	private WebElement otp;
	
	@FindBy(name="emailMobile")
	private WebElement mobile;
	

	@FindBy(id="submitVerification")
	private WebElement process;
	@FindBy(xpath="//span[@class='AccountText']")
	private WebElement account;
	@FindBy(xpath="//a[text()='My Orders']")
	private WebElement myOrder;
	@FindBy(xpath="(//span[@class='undefined']//following::span[text()='Order Details'])[1]")
	private WebElement details;
	
	@FindBy(xpath="//button[text()='Cancel Order']")
	private WebElement cancel;
	
	
	@FindBy(xpath="//span[text()='Select reason']")
	private WebElement reason;
	
	
	@FindBy(xpath="//div[text()='Wrong shade/size/colour ordered']")
	private WebElement wrongOrder;
	@FindBy(xpath="//button[text()='Cancel order']")
	private WebElement cancelOrder;
	
	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement confirm;
	
	
	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getReason() {
		return reason;
	}

	public WebElement getWrongOrder() {
		return wrongOrder;
	}

	public WebElement getCancelOrder() {
		return cancelOrder;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getMyOrder() {
		return myOrder;
	}

	public WebElement getDetails() {
		return details;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getProcess() {
		return process;
	}

	@FindBy(xpath="//input[@placeholder='Enter Mobile Number or Email']")
	private WebElement enter;
	@FindBy(xpath="//button[text()='verify']")
	private WebElement verify;
	
	public WebElement getVerify() {
		return verify;
	}

	public WebElement getOtp() {
		return otp;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEnter() {
		return enter;
	}

	

	public WebElement getOrder() {
		return order;
	}

	public WebElement getAddToBag() {
		return addToBag;
	}
	public WebElement getCart() {
		return cart;
	}
	public WebElement getQty() {
		return qty;
	}
	public WebElement getProceed() {
		return proceed;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getDeliver() {
		return deliver;
	}
	public WebElement getCash() {
		return cash;
	}
	public WebElement getPlaceorder() {
		return placeorder;
	}
	
	
	
	
	
}
