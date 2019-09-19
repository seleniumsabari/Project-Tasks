package org.assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Project Assignments\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.snapdeal.com/");
		WebElement srch = dr.findElement(By.xpath("//input[@id='inputValEnter']"));
		srch.sendKeys("i phone");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement mobile = dr.findElement(By.xpath("//p[text()='Apple iPhone 6s ( 32GB , 2 GB ) Space Grey']"));
		mobile.click();
		String parent = dr.getWindowHandle();
		Set<String> all = dr.getWindowHandles();
		for (String x : all) {
			if(!x.equals(parent)) {
				dr.switchTo().window(x);
			}
		}
		Thread.sleep(1500);
		WebElement cart = dr.findElement(By.xpath("//span[text()='add to cart']"));
		cart.click();
		WebElement cart1 = dr.findElement(By.xpath("//span[text()='Cart']"));
		cart1.click();
		Thread.sleep(2000);
		WebElement qty1 = dr.findElement(By.xpath("//div[text()='1']"));
		qty1.click();
		WebElement qty2 = dr.findElement(By.xpath("//li[text()='2']"));
		qty2.click();
		Thread.sleep(1500);
		WebElement close = dr.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[2]"));
		close.click();
		Thread.sleep(1500);
		WebElement cart2 = dr.findElement(By.xpath("//span[text()='add to cart']"));
		cart2.click();
		TakesScreenshot tk=(TakesScreenshot)dr;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Sindhu\\eclipse-workspace\\Project Assignments\\Screenshot\\Payment.png");
		FileUtils.copyFile(src, des);
	}
}
