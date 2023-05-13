package com.qa.testscript;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LogoTest {
	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//a[@class='mmtLogo makeFlex']"));
		System.out.println(logo.isDisplayed());
		driver.quit();
	}
}