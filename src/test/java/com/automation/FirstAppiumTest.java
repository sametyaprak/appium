package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;

public class FirstAppiumTest {


    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","7.0");
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\samet\\IdeaProjects\\AppiumAutomation\\etsy.apk");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY,"com.etsy.android.ui.FragmentHolderSingleActivity");


        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),desiredCapabilities);
        //Actions actions = new Actions(driver);
        Thread.sleep(20000);

        WebElement darkModeCancel = driver.findElement(By.id("com.etsy.android:id/dark_mode_alert_dismiss"));
        darkModeCancel.click();
        WebElement getStarted = driver.findElement(By.id("com.etsy.android:id/btn_link"));
        getStarted.click();
        Thread.sleep(5000);
        WebElement emailTextBox = driver.findElement(By.id("com.etsy.android:id/edit_username"));
        emailTextBox.sendKeys("aliveli");
        WebElement paswordTextBox = driver.findElement(By.id("com.etsy.android:id/edit_password"));
        paswordTextBox.sendKeys("954625 ");

    }
}
