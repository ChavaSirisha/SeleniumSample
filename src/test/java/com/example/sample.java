package com.example;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sample {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","src\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
       // options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

        // String p1 = driver.findElement(By.xpath("(//*[@class='_2nQDXZ'])[1]/div/span[contains(text(),'₹')][2]")).getText();
        // String p2 = driver.findElement(By.xpath("(//*[@class='_2nQDXZ'])[2]/div/span[contains(text(),'₹')][2]")).getText();
        // String total = driver.findElement(By.xpath("(//*[@class='_3LxTgx'])/div/div/span")).getText();

        // p1 = p1.replace("₹", "");
        // p2 = p2.replace("₹", "");
        // int sum = Integer.parseInt(p1.replace(",", "")) + Integer.parseInt(p2.replace(",", ""));
        // int tot = Integer.parseInt(total.replace(",", ""));
        //assertion`
        driver.quit();
    }
}
