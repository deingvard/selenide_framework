package helpers;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;


public class BaseTest {

    public static Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @BeforeClass
    public void setUp() {
        logger.info("Open the browser");
        // Define which browser we will use
        // Configuration.browser = "firefox";
        Configuration.browser = "chrome";
        Configuration.headless = true;
        // Configuration.browser = "safari";
        Configuration.timeout = 10000;
        // Size of the browser window
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://mail.ru";
        ScreenShooter.captureSuccessfulTests = true;
    }
}
