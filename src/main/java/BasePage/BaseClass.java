package BasePage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

public static WebDriver driver;
public BaseClass() {
if(driver==null)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Jayavel\\Desktop\\Selenium\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/index.php");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
}

public void textbox(WebElement location,String a) {
	
location.sendKeys(a);
}

public void gettitle() {
	System.out.println(driver.getTitle());
}

public void dropdown1(WebElement location,int index)
{
	Select select=new Select(location);
	select.selectByIndex(index);
}
public void dropdown2(WebElement location,String value) {
	Select select=new Select(location);
	select.selectByValue(value);
	
}

public void dropdown3(WebElement location,String text)
{
	Select select=new Select(location);
	select.selectByVisibleText(text);
}

public void Screenshot(String Name) throws IOException
{
	TakesScreenshot tk=(TakesScreenshot)driver;
	File f1=tk.getScreenshotAs(OutputType.FILE);
	File f2=new File("C:\\Users\\Jayavel\\amazon\\Sceenshot\\"+Name+".jpg");
	FileHandler.copy(f1, f2);
}

public void ScrollDown(WebElement Location)
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",Location);
}



public void ExpliWait(String Text)
{
	WebDriverWait wait=new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(Text)));
}







}
