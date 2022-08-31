import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.reflections8.vfs.Vfs.File;

public class Seleniummaintask1 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Installation\\demo\\Drivers2\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		driver.findElement(By.xpath("//input[@name='vfb-5']")).sendKeys("Sabari");
		driver.findElement(By.xpath("//input[@name='vfb-7']")).sendKeys("Vignesh");
		driver.findElement(By.id("vfb-8-1")).click();
		Robot key=new Robot();
		key.keyPress(KeyEvent.VK_TAB);
		key.keyPress(KeyEvent.VK_3);
		key.keyPress(KeyEvent.VK_8);
		key.keyPress(KeyEvent.VK_SPACE);
		key.keyPress(KeyEvent.VK_CAPS_LOCK);
		key.keyPress(KeyEvent.VK_M);
		key.keyPress(KeyEvent.VK_CAPS_LOCK);
		key.keyPress(KeyEvent.VK_A);
		key.keyPress(KeyEvent.VK_I);
		key.keyPress(KeyEvent.VK_N);
		key.keyPress(KeyEvent.VK_SPACE);
		key.keyPress(KeyEvent.VK_CAPS_LOCK);
		key.keyPress(KeyEvent.VK_S);
		key.keyPress(KeyEvent.VK_CAPS_LOCK);
		key.keyPress(KeyEvent.VK_T);
		key.keyPress(KeyEvent.VK_R);
		key.keyPress(KeyEvent.VK_E);
		key.keyPress(KeyEvent.VK_E);
		key.keyPress(KeyEvent.VK_T);
		key.keyPress(KeyEvent.VK_TAB);
		driver.findElement(By.cssSelector("input[id='vfb-13-address-2']")).sendKeys("Main Road");
		key.keyPress(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("//input[@id='vfb-13-address-2']")).sendKeys("Nil");
		key.keyPress(KeyEvent.VK_TAB);
	driver.findElement(By.xpath("//input[@name='vfb-13[state]']")).sendKeys("Tamil Nadu");
	driver.findElement(By.xpath("//input[@name='vfb-13[zip]']")).sendKeys("Erode");
	key.keyPress(KeyEvent.VK_TAB);
	driver.findElement(By.xpath("//select[@class='vfb-select valid']")).click();
	driver.findElement(By.xpath("//option[@value='India']")).click();
	driver.findElement(By.id("vfb-14")).sendKeys("abc@gmail.com");
	key.keyPress(KeyEvent.VK_TAB);
	driver.findElement(By.xpath("//input[@id='vfb-18']")).sendKeys("29/09/2022");
	driver.findElement(By.className("vfb-select valid")).click();
	driver.findElement(By.cssSelector("option[value='10']")).click();
	driver.findElement(By.cssSelector("select[id='vfb-16-min']")).click();
	driver.findElement(By.cssSelector("option[value='30']")).click();
	driver.findElement(By.id("vfb-19")).sendKeys("9597715951");
	driver.findElement(By.cssSelector("input[id='vfb-20-0']")).click();
	driver.findElement(By.className("vfb-textarea  vfb-medium ")).sendKeys("This is completed");
	driver.findElement(By.cssSelector("input[name='vfb-3']")).sendKeys("99");
	driver.findElement(By.id("vfb-4")).click();
	Screenshot snap=(Screenshot)driver;
	File store=snap.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(store,new File("D:\\Project\\ScreenShots\\image.png"));
	System.out.println("ScreenShot Captured");
	driver.findElement(By.xpath("//button[text()='  Alert and Popup  ']")).click();
	Actions x=new Actions(driver);
	WebElement xbutton=driver.findElement(By.xpath("//button[@name='alertbox']"));
	x.doubleClick().perform();
	driver.switchTo().alert().accept();
	Actions z=new Actions(driver);
	WebElement zbutton=driver.findElement(By.xpath("//button[@name='confirmalertbox']"));
	z.doubleClick().perform();
	driver.switchTo().alert().accept();
	Actions s=new Actions(driver);
	WebElement sbutton=driver.findElement(By.xpath("//button[@name='promptalertbox1234']"));
	s.doubleClick().perform();
	driver.switchTo().alert().accept();


	
	
	
	
	
	}

}
