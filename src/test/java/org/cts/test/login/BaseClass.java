package org.cts.test.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	static WebDriver driver;

	// chromeBrowserLaunch
	public static WebDriver chromeBrowserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumChrome\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;

	}

	// firefoxBrowserLaunch
	public static WebDriver firefoxBrowserLaunch() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumFirefox\\Driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
	}

	// internetExplorerLaunch
	public static WebDriver internetExplorerLaunch() {
		System.setProperty("webdriver.ie.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumInternetExplorer\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		return driver;
	}

	// launchURL
	public static void launchURL(String url) {
		driver.get(url);
	}

	// sendKeys
	public static void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	// click
	public static void click(WebElement element) {
		element.click();
	}

	// getText
	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// getAttribute
	public static String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}

	// maximizeBrowser
	public static void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	// Actions methods

	// mouseOverAction
	public static void mouseOverAction(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}

	// mouseDragAndDrop
	public static void DragAndDrop(WebElement sourceElement, WebElement targetElement) {
		Actions a = new Actions(driver);
		a.dragAndDrop(sourceElement, targetElement).perform();
	}

	// mouseDoubleClick
	public static void mouseDoubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

	// mouseRightClick
	public static void mouseRightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}

	// QuitWindow
	public static void quitWindow() {
		driver.quit();
	}

	// CloseWindow
	public static void closeWindow() {
		driver.close();
	}
	// Robot Methods

	// KeyPressUp
	public static void KeyPressUp() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	// KeyPressDown
	public void KeyPressDown() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	// KeyPressEnter
	public void KeyPressEnter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	// Select methods
	// selectByIndex
	public static void selectIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	// selectByValue
	public static void selectValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	// selectByVisibleText
	public static void selectVisibleText(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	// deselectByIndex
	public static void deselectIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}

	// deselectByValue
	public static void deselectValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	// deselectByVisibleText
	public static void deselectVisibleText(WebElement element, String text) {
		Select s = new Select(element);
		s.deselectByVisibleText(text);
	}

	// deselectAll
	public static void deselectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	// getOptions
	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String text = options.get(i).getText();
			System.out.println(text);
		}
	}

	// isMultiple
	public static void name(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	// getAllSelectedOptions
	public static void getAllSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			String text = allSelectedOptions.get(i).getText();
			System.out.println(text);

		}
	}

	// getFirstSelectedOption
	public static void getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);

	}

	// JavascriptExecutor methods
	// setAttribute
	public static void SetAttributeJS(WebElement element, String valueToSetAttribute) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', 'valueToSetAttribute')", element);
	}

	// getAttribute
	public static void getAttributeJS(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Object object = js.executeScript("returnarguments[0].getAttribute('value')", element);
		String text = (String) object;
		System.out.println(text);
	}

	// scrollUp
	public static void scrollUp(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView(true)", element);
	}

	// scrollDown
	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollIntoView(false)", element);
	}

	// highLight
	public static void highLight(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','background:lightgreen;border:solidgreen')", element);
	}
	//excelRead

	public static String getDataFromExcel(String location, String shName, int rowNum, int cellNum) throws IOException {
		String value = null;
		File f = new File(location);
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(shName);
		Row r = s.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int type = c.getCellType();
		if (type == 1) {
			value = c.getStringCellValue();
		} else if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
				value = sdf.format(date);
			} else {
				double numericValue = c.getNumericCellValue();
				long l = (long) numericValue;
				value = String.valueOf(l);
			}

		}
		return value;

	}
	//excelWrite
	public static void writeExcel(String loc, int row, int cell, String value,String SheetName)
			throws IOException, InvalidFormatException {

		File f = new File(loc);
		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet(SheetName);
		Row r = s.getRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(value);
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);

	}


}
