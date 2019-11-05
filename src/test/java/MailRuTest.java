import helpers.BaseTest;
import helpers.JsonDataReader;
import org.testng.annotations.Test;
import steps.EmailPageSteps;
import steps.MainPageSteps;

import java.util.Map;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.visible;


public class MailRuTest extends BaseTest {

    @Test(description = "Test SignIn form and emails")
    public void logInTest() {
        Map<String, String> testData = JsonDataReader.getTestData();
        // Actions
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.open().signIn(testData.get("url"), testData.get("password"));
        // Assert
        EmailPageSteps emailPageSteps = new EmailPageSteps();
        emailPageSteps.checkEmailContainer().should(visible);
        emailPageSteps.checkCountEmails().shouldHave(size(4));
        emailPageSteps.expectsTitle("(2) Входящие - Почта Mail.ru");
    }
}
