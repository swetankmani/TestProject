package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Google_Search {

	public static void main(String[] args) {
		
		googlesearch();
		
	}
	
	public static void googlesearch() {
		
		
		String ProjectPath = System.getProperty("user.dir");
		System.out.println(ProjectPath);
		System.setProperty("webdriver.chrome.driver",ProjectPath +"\\Driver\\chromedriver\\chromedriver.exe" );
	//	System.setProperty("webdriver.chrome.driver", value)
		WebDriver driver = new ChromeDriver();
		
		//Open the browser
		driver.get("https://www.google.co.in/");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Search the text in google
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//Enter click  after entering the text
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		//Close  the browser
		driver.close();
		
		System.out.println("Successfully completed the Test");
		
		 
		
		
	}
}
