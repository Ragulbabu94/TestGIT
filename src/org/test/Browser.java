package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\rragu\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("r.ragul1992@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("swathi@1995");
		
		WebElement loginbutton = driver.findElement(By.name("login"));
		loginbutton.click();
		
		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
	
	}
}
