package pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    // Elements
    private SelenideElement loginField = $("#mailbox\\:login"),
            passwordField = $x(".//*[@id='mailbox:password']");

    // Type value in 'LogIn' field
    public SelenideElement getLoginField() {
        return this.loginField;
    }

    // Type value in 'Password' field
    public SelenideElement getPasswordField() {
        return this.passwordField;
    }

}
