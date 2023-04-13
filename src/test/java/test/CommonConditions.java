package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import driver.DriverSingleton;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonConditions {

    @BeforeTest(alwaysRun = true)
    public static void setUpDriver() {
        DriverSingleton.getDriver();
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }

    @AfterTest(alwaysRun = true)
    public static void closeDriver() {
        Selenide.closeWebDriver();
    }
}
