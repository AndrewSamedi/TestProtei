package core;

import org.openqa.selenium.WebDriver;

abstract public class SeleniumPageTest {
    protected static WebDriver driver;

    public static void setDriver(WebDriver webDriver){    // реализуем паттерн PageObject
        driver = webDriver;
    }


}
