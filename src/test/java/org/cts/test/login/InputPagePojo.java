package org.cts.test.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputPagePojo extends BaseClass {
	public InputPagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement ddLocation;
	@FindBy(id = "hotels")
	private WebElement ddHotel;
	@FindBy(id = "room_type")
	private WebElement ddRoom;
	@FindBy(id = "room_nos")
	private WebElement ddRoomNos;
	@FindBy(name = "datepick_in")
	private WebElement txtCheckIn;
	@FindBy(name = "datepick_out")
	private WebElement txtCheckOut;
	@FindBy(name = "adult_room")
	private WebElement ddAdultRoom;
	@FindBy(name = "child_room")
	private WebElement ddChildRoom;
	@FindBy(name = "Submit")
	private WebElement btnSearch;

	public WebElement getDdLocation() {
		return ddLocation;
	}

	public WebElement getDdHotel() {
		return ddHotel;
	}

	public WebElement getDdRoom() {
		return ddRoom;
	}

	public WebElement getDdRoomNos() {
		return ddRoomNos;
	}

	public WebElement getTxtCheckIn() {
		return txtCheckIn;
	}

	public WebElement getTxtCheckOut() {
		return txtCheckOut;
	}

	public WebElement getDdAdultRoom() {
		return ddAdultRoom;
	}

	public WebElement getDdChildRoom() {
		return ddChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

}
