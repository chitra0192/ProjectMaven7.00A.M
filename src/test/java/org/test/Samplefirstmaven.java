package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Samplefirstmaven {
	
	
	public static void main(String[] args) {
		

			WebDriverManager.chromedriver().setup();
			
			WebDriver driver =new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			
			WebElement txtusername = driver.findElement(By.id("email"));
			txtusername.sendKeys("Chitra");
			
			WebElement txtpassword = driver.findElement(By.id("pass"));
			txtpassword.sendKeys("12345");

			WebElement btnlogin = driver.findElement(By.id("login"));		
			btnlogin.click();
		
	}

}
