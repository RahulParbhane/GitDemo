package fileupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D://Softwares//Packages//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://smallpdf.com/pdf-to-word");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='l3tlg0-0 hrcxSS']")).click();
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Documents\\Fileupload.exe");
		

	}

}
