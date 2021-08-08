package org.cts.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPagePojo extends BaseClass {
	public ConfirmationPagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement rdoBtn;
	@FindBy(name = "continue")
	private WebElement btnContinue;

	public WebElement getRdoBtn() {
		return rdoBtn;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

}
