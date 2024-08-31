package com.example;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome {
    public static ChromeOptions getCapabilities(){
        ChromeOptions chromeOptions = new ChromeOptions();
        HashMap<String,Object> bsOptions = new HashMap<String,Object>();
        bsOptions.put("os", "windows");
        bsOptions.put("osVersion", 11);
        bsOptions.put("browserVersion", "latest");
        bsOptions.put("seleniumVersion", "4.8.0");
        chromeOptions.setCapability("bstack.options", bsOptions);
        return chromeOptions;
    }
}
