package org.cts.test.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Launch extends BaseClass {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		chromeBrowserLaunch();

		launchURL("https://adactinhotelapp.com/");

		driver.manage().window().maximize();

		LoginPagePojo l = new LoginPagePojo();

		InputPagePojo i = new InputPagePojo();

		ConfirmationPagePojo c = new ConfirmationPagePojo();

		InputPageTwoPojo p = new InputPageTwoPojo();

		OrderIdPagePojo o = new OrderIdPagePojo();

		sendKeys(l.getTxtUser(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven1\\ExcelData\\Adactin.xlsx", "Hotel", 1, 0));

		sendKeys(l.getTxtPassWord(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven1\\ExcelData\\Adactin.xlsx", "Hotel", 1, 1));

		click(l.getBtnLogin());

		selectVisibleText(i.getDdLocation(), "London");

		selectVisibleText(i.getDdHotel(), "Hotel Sunshine");

		selectVisibleText(i.getDdRoom(), "Double");

		selectValue(i.getDdRoomNos(), "1");

		sendKeys(i.getTxtCheckIn(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven1\\ExcelData\\Adactin.xlsx", "Hotel", 1, 2));

		sendKeys(i.getTxtCheckOut(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven1\\ExcelData\\Adactin.xlsx", "Hotel", 1, 3));

		selectVisibleText(i.getDdAdultRoom(), "2 - Two");

		selectVisibleText(i.getDdChildRoom(), "1 - One");

		click(i.getBtnSearch());

		click(c.getRdoBtn());

		click(c.getBtnContinue());

		sendKeys(p.getTxtFirstName(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven1\\ExcelData\\Adactin.xlsx", "Hotel", 1, 4));

		sendKeys(p.getTxtLastName(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven1\\ExcelData\\Adactin.xlsx", "Hotel", 1, 5));

		sendKeys(p.getTxtAddress(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven1\\ExcelData\\Adactin.xlsx", "Hotel", 1, 6));

		sendKeys(p.getTxtCreditCard(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven1\\ExcelData\\Adactin.xlsx", "Hotel", 1, 7));

		selectVisibleText(p.getDdCardType(), "VISA");

		selectVisibleText(p.getDdMonth(), "March");

		selectVisibleText(p.getDdYear(), "2021");

		sendKeys(p.getTxtCvvNo(), getDataFromExcel(
				"C:\\Users\\ADMIN\\eclipse-workspace\\Maven1\\ExcelData\\Adactin.xlsx", "Hotel", 1, 8));

		click(p.getBtnBookNow());

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println(getAttribute(o.getOrderId()));

	}

}
