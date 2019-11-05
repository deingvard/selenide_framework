package steps;

import com.codeborne.selenide.Selenide;
import helpers.BaseTest;
import pageobjects.MainPage;


public class MainPageSteps extends BaseTest {

    private final MainPage mainPage = new MainPage();

    public MainPageSteps open() {
        logger.info("Open mail.ru page");
        Selenide.open("/");
        return this;
    }

    public void enterLogin(String login) {
        logger.info("Type the name of a user and press Enter");
        mainPage.getLoginField().setValue(login).pressEnter();
    }

    public void enterPassword(String password) {
        logger.info("Type the name of a password and press Enter");
        mainPage.getPasswordField().setValue(password).pressEnter();
    }

    public void signIn(String loginField, String passwordField) {
        this.enterLogin(loginField);
        this.enterPassword(passwordField);
    }

}
