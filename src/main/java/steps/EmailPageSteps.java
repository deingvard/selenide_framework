package steps;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import helpers.BaseTest;
import pageobjects.EmailPage;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class EmailPageSteps extends BaseTest {

    private final EmailPage emailPage = new EmailPage();

    public void expectsTitle(String text) {
        Selenide.Wait().until(titleIs(text));
    }

    public SelenideElement checkEmailContainer() {
        logger.info("Verify the mail of letters in the mail");
        return emailPage.getEmailContainer();
    }

    public ElementsCollection checkCountEmails() {
        logger.info("Verify the number of letters in the mail");
        return emailPage.getCountEmails();
    }


}
