package reusable;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.BaseClass;

public class WebDriverHelper extends BaseClass {
	
	
	public void sendText(By element,String text) {
		driver.findElement(element).sendKeys(text);
	}
	
	public String getText(By element) {
		String text=null;
		text=driver.findElement(element).getText();
		return text;
	} 
	
	public void clickButton(By element) {
		driver.findElement(element).click();
	}
	
	public void switchHandles(int index) {
		ArrayList<String> handles=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(handles.get(index));
	}
	
	public void hover(By element) {
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(element)).perform();
	}
	
	public void clearText(By element) {
		driver.findElement(element).clear();
	}
	
	public void explicitWaitForInvisibilty(By element,int time) {
		WebDriverWait wait=new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
	}
 
	public void scrollUntilVisible(By element, int x) {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)"," ");
	}
/*public void scrollForVisiblity(By element, int x) {
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)"," ");
	}*/

	
	/*public void image(By element) {
	WebElement i = driver.findElement(element);

	Boolean p = (Boolean) ((JavascriptExecutor)driver)
	.executeScript("return arguments[0].complete "
	+ "&& typeof arguments[0].naturalWidth != \"undefined\" "
	+ "&& arguments[0].naturalWidth > 0", i);
	}*/
	
	
}
