package org.soundsair;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class SoundsAirUntilPaymentPage {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sindhu\\eclipse-workspace\\Project Assignments\\Driver\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.soundsair.com/");
		WebElement one = dr.findElement(By.xpath("(//div[@class='control__indicator'])[2]"));
		one.click();
		WebElement from = dr.findElement(By.xpath("//select[@id='from']"));
		Select dd=new Select(from);
		dd.selectByIndex(3);
		WebElement to = dr.findElement(By.xpath("//select[@id='to']"));
		Select dd1=new Select(to);
		dd1.selectByIndex(9);
		WebElement date = dr.findElement(By.xpath("//input[@id='depart_date']"));
		date.click();
		Thread.sleep(1500);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		for (int i = 1; i<=2; i++) {
			
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}	
		WebElement adult = dr.findElement(By.xpath("(//button[@class='btn btn-default btn-number'])[2]"));
		adult.click();
		WebElement child = dr.findElement(By.xpath("(//button[@class='btn btn-default btn-number'])[4]"));
		child.click();
		//WebElement infant = dr.findElement(By.xpath("(//button[@class='btn btn-default btn-number'])[6]"));
		//infant.click();
		WebElement flights = dr.findElement(By.xpath("//button[@type='submit']"));
		flights.click();
		dr.manage().timeouts().implicitlyWait(100, TimeUnit.MINUTES);
		WebElement amount = dr.findElement(By.xpath("(//span[text()='$737.00'])[2]"));
		amount.click();
		Thread.sleep(1500);
		WebElement con = dr.findElement(By.xpath("(//button[@type='button'])[10]"));
		con.click();
		WebElement title = dr.findElement(By.xpath("(//select[@class='passenger-title form-control'])[1]"));
		Select dd2=new Select(title);
		dd2.selectByIndex(8);
		WebElement adult1 = dr.findElement(By.xpath("(//input[@class='form-control passenger-first-name'])[1]"));
		adult1.sendKeys("Sabari");
		WebElement adult1m = dr.findElement(By.xpath("(//input[@class='form-control passenger-middle-name'])[1]"));
		adult1m.sendKeys("Sundhara");
		WebElement adult1l = dr.findElement(By.xpath("(//input[@class='date-pick-years form-control passenger-last-name'])[1]"));
		adult1l.sendKeys("Moorthi");
		WebElement title2 = dr.findElement(By.xpath("(//select[@class='passenger-title form-control'])[1]"));
		Select dd3=new Select(title2);
		dd3.selectByIndex(2);
		WebElement adult2 = dr.findElement(By.xpath("(//input[@class='form-control passenger-first-name'])[2]"));
		adult2.sendKeys("Sushmita");
		WebElement adult2m = dr.findElement(By.xpath("(//input[@class='form-control passenger-middle-name'])[2]"));
		adult2m.sendKeys("Sabari");
		WebElement adult2l = dr.findElement(By.xpath("(//input[@class='date-pick-years form-control passenger-last-name'])[2]"));
		adult2l.sendKeys("Balamurugan");
		WebElement title3 = dr.findElement(By.xpath("(//select[@class='passenger-title form-control'])[3]"));
		Select dd4=new Select(title3);
		dd4.selectByIndex(8);
		WebElement childf = dr.findElement(By.xpath("(//input[@class='form-control passenger-first-name'])[3]"));
		childf.sendKeys("Keerthi");
		WebElement childm = dr.findElement(By.xpath("(//input[@class='form-control passenger-middle-name'])[3]"));
		childm.sendKeys("Sabari");
		WebElement childl = dr.findElement(By.xpath("(//input[@class='date-pick-years form-control passenger-last-name'])[3]"));
		childl.sendKeys("Balamurugan");
		WebElement childage = dr.findElement(By.xpath("//select[@class='form-control passenger-age']"));
		Select dd5=new Select(childage);
		dd5.selectByIndex(4);
		/*WebElement infantf = dr.findElement(By.xpath("(//input[@class='form-control passenger-first-name'])[4]"));
		infantf.sendKeys("Kishore");
		WebElement infantm = dr.findElement(By.xpath("(//input[@class='form-control passenger-middle-name'])[4]"));
		infantm.sendKeys("Sabari");
		WebElement infantl = dr.findElement(By.xpath("(//input[@class='date-pick-years form-control passenger-last-name'])[4]"));
		infantl.sendKeys("Balamurugan");*/
		WebElement mail = dr.findElement(By.xpath("(//input[@name='email'])[1]"));
		mail.sendKeys("sabari@gmail.com");
		WebElement mobile = dr.findElement(By.xpath("(//input[@name='phone'])[1]"));
		mobile.sendKeys("9791161178");
		WebElement contact = dr.findElement(By.xpath("//input[@name='mobile']"));
		contact.sendKeys("8124252525");
		WebElement con1 = dr.findElement(By.xpath("(//button[@type='submit'])[2]"));
		con1.click();
		Thread.sleep(3000);
		TakesScreenshot tk=(TakesScreenshot)dr;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Sindhu\\eclipse-workspace\\Project Assignments\\Screenshot\\Passenger.png");
		FileUtils.copyFile(src, des);
		Thread.sleep(5000);
		WebElement read = dr.findElement(By.xpath("//input[@id='check1']"));
		read.click();
		WebElement confirm = dr.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(2000);
		JavascriptExecutor jk=(JavascriptExecutor)dr;
		jk.executeScript("arguments[0].scrollIntoView(true)",confirm);
		confirm.click();
		Thread.sleep(5000);
		TakesScreenshot tk1=(TakesScreenshot)dr;
		File src1 = tk1.getScreenshotAs(OutputType.FILE);
		File des1=new File("C:\\Users\\Sindhu\\eclipse-workspace\\Project Assignments\\Screenshot\\PaymentSounds.png");
		FileUtils.copyFile(src1, des1);
		
		
		
		
		
		
		
		
		
	}
}
