package pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EmailPage {

    // Elements
    private SelenideElement emailContainer = $(byId("b-letters"));
    private ElementsCollection countEmails = $$("#b-letters .b-datalist__body > div");

    // Get email container
    public SelenideElement getEmailContainer() {
        return this.emailContainer;
    }

    // Get count emails
    public ElementsCollection getCountEmails() {
        return this.countEmails;
    }

}
