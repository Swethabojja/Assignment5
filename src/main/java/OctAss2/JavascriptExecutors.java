package OctAss2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;

public class JavascriptExecutors {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub

                  WebDriverManager.chromedriver().setup();
                   WebDriver driver = new ChromeDriver();
                       driver.manage().window().maximize();
                        driver.get("https://jqueryui.com/");

           driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();

             Thread.sleep(3000);

                 Actions act = new Actions(driver);

            driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\'content\']/iframe")));
                act.dragAndDropBy(driver.findElement(By.xpath("//div[@id='draggable']")), 60, 200).perform();

            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

   try {
            FileUtils.copyFile(screenshot, new File("D:\\Swetha\\SeleniumTesting\\Assignment2\\homePageScreenshot.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

}

}


