package org.cts.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputPageTwoPojo extends BaseClass {
	public InputPageTwoPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "first_name")
	private WebElement txtFirstName;
	@FindBy(name = "last_name")
	private WebElement txtLastName;
	@FindBy(name = "address")
	private WebElement txtAddress;
	@FindBy(name = "cc_num")
	private WebElement txtCreditCard;
	@FindBy(name = "cc_type")
	private WebElement ddCardType;
	@FindBy(name = "cc_exp_month")
	private WebElement ddMonth;
	@FindBy(name = "cc_exp_year")
	private WebElement ddYear;
	@FindBy(name = "cc_cvv")
	private WebElement txtCvvNo;
	@FindBy(name = "book_now")
	private WebElement btnBookNow;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCard() {
		return txtCreditCard;
	}

	public WebElement getDdCardType() {
		return ddCardType;
	}

	public WebElement getDdMonth() {
		return ddMonth;
	}

	public WebElement getDdYear() {
		return ddYear;
	}

	public WebElement getTxtCvvNo() {
		return txtCvvNo;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

}
