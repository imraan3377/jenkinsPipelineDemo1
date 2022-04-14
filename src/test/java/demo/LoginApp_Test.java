package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginApp_Test {
	  WebDriver driver;
  @Test
  public void testLogin() {
	
		  
			driver.findElement(By.id("Email")).sendKeys("jupiter@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("123456");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			boolean loginlink = driver.findElement(By.linkText("jupiter@gmail.com")).isDisplayed();
			Assert.assertEquals(true, loginlink);

	  }
	  @BeforeClass
	  private void beforeClass() {
		  WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://demowebshop.tricentis.com/login");
		
	}
	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }
	
  }

