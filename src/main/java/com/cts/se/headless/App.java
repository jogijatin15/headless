package com.cts.se.headless;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        File file = new File("C:/dev-workspace/headless/phantomjs-2.1.1-windows/bin/phantomjs.exe");	
        
        System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
        WebDriver driver = new PhantomJSDriver();	
        driver.get("http://www.google.com");         
        WebElement element = driver.findElement(By.name("q"));	
        element.sendKeys("yahoo");					
        element.submit();         			
        System.out.println("Page title is: " + driver.getTitle());		
        
        driver.close();
        driver.quit();
    }
}
