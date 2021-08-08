package org.cts.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderIdPagePojo extends BaseClass{
	public OrderIdPagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='order_no']")
	private WebElement orderId;

	public WebElement getOrderId() {
		return orderId;
	}

}
