package org.cts.test.login;

import org.apache.commons.io.filefilter.TrueFileFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Java {

	@Test(dataProvider = "login")
	public void login(String s1, String s2) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		WebElement txtUser = driver.findElement(By.name("email"));
		txtUser.sendKeys(s1);

		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys(s2);

		WebElement btnLogin1 = driver.findElement(By.id("login"));
		btnLogin1.click();

		WebElement btnLogin = driver.findElement(By.name("login"));
         btnLogin.click();
	}

	@DataProvider(name = "login", parallel = true)
	public Object[][] data() {
		return new Object[][] { { "raj448", "258963" }, { "ragul", "rg78956" }, { "raki", "rak85693" } };

	}
}
