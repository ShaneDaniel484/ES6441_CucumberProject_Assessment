import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Driver;

public class roboclassPractice {
	
	public static void main(String[] args) throws AWTException, InterruptedException {  
		
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.pdf2doc.com");
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		
		WebElement upfile = driver.findElement(By.xpath("(//span[@class='button__text'])[1]"));
		upfile.click();
		
		
		
		Thread.sleep(5000);
		Robot rb = new Robot();
		
		//robot class method
		StringSelection str = new StringSelection("C:\\Users\\sdaniel\\Downloads\\TX - 03");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		
		
		//pressing and releasing the key
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
}
