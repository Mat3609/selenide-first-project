package driver;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSingleton {
    public static void getDriver() {
        switch (System.getProperty("browser")) {

            case "chrome": {
                WebDriverManager.chromedriver().setup();
                Configuration.browser = "chrome";
                break;
            }
            case "firefox": {
                WebDriverManager.firefoxdriver().setup();
                Configuration.browser = "firefox";
                break;
            }
        }
    }
}
