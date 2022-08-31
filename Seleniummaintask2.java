import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniummaintask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Installation\\demo\\Drivers2\\chromedriver_win32 (6)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://computer-database.gatling.io/computers");
	driver.findElement(By.id("searchbox")).sendKeys("ACE");
	driver.findElement(By.id("searchsubmit")).click();
	String data= driver.findElement(By.xpath("/*[@id=\"main\"]/table/tbody/tr[1]/td[1]/a")).getText();
	System.out.println(data);
	String data1=driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[2]/td[1]/a")).getText();
	System.out.println(data1);
	String data2=driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[3]/td[1]/a")).getText();
	System.out.println(data2);
	String data3=driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[3]/td[1]/a")).getText();
	System.out.println(data3);
	String data4=driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[4]/td[1]/a")).getText();
	System.out.println(data4);
	String data5=driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[5]/td[1]/a")).getText();
	System.out.println(data5);
	String data6=driver.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr[6]/td[1]/a")).getText();
	System.out.println(data6);
driver.findElement(By.id("add")).click();
driver.findElement(By.id("name")).sendKeys("ACE2");
driver.findElement(By.id("introduced")).sendKeys("2022-06-02");
driver.findElement(By.id("discontinued")).sendKeys("2022-08-01");
driver.findElement(By.id("company")).click();
driver.findElement(By.xpath("//option[@value='15']"));
driver.findElement(By.id("//input[@type='submit']")).click();
String name=  driver.findElement(By.xpath("//div[@class='alert-message warning']")).getText();
System.out.println(name);
	}

}
