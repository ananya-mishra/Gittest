package test1;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.interactions.Action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;

public class Selenium {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String url= "http://demo.guru99.com/test/ajax.html";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("no")).click();
		driver.findElement(By.id("buttoncheck")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[8]/a")).click();
		
		WebElement home=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]"));
		WebElement linkhome=driver.findElement(By.linkText("Home"));
		Actions builder=new Actions(driver);
		Action event= builder.moveToElement(linkhome).click().build();
		event.perform();
		driver.findElement(By.name("userName")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("abcde");
		driver.findElement(By.name("submit")).click();
		WebElement hotel=driver.findElement(By.linkText("Hotels"));
		Actions builder1= new Actions(driver);
		Action event1=builder1.moveToElement(hotel).click().build();
		event1.perform();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img")).click();
		WebElement flight=driver.findElement(By.linkText("Flights"));
		Actions builder2= new Actions(driver);
		Action event2=builder2.moveToElement(flight).click().build();
		event2.perform();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]")).click();
		Select drop1=new Select(driver.findElement(By.name("passCount")));
		drop1.selectByVisibleText("2");
		Select drop2=new Select(driver.findElement(By.name("fromPort")));
		drop2.selectByVisibleText("Frankfurt");
		Select drop3=new Select(driver.findElement(By.name("fromMonth")));
		drop3.selectByVisibleText("June");
		Select drop4=new Select(driver.findElement(By.name("fromDay")));
		drop4.selectByVisibleText("12");
		Select drop5=new Select(driver.findElement(By.name("toPort")));
		drop5.selectByValue("Paris");
		Select drop6=new Select(driver.findElement(By.name("toMonth")));
		drop6.selectByVisibleText("August");

		Select drop7=new Select(driver.findElement(By.name("toDay")));
		drop7.selectByVisibleText("15");
		
		
		
		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[1]")).click();
		Select drop8=new Select(driver.findElement(By.name("airline")));
		drop8.selectByVisibleText("Unified Airlines");
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/a/img")).click();
		
		
		//TakesScreenshot srcshot=((TakesScreenshot)driver);
		//File SrcFile=srcshot.getScreenshotAs(OutputType.FILE);
		//File DestFile= new File("E:\\codes\\Screenshot");
		//FileUtils.copyFile(SrcFile,DestFile);
		
		
		
		
		
			}
		
		

	}



