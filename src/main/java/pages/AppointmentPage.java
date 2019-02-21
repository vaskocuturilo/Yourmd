package pages;

import com.codeborne.selenide.Condition;
import locators.AppointmentPageLocators;
import utils.PropertiesReader;

import static com.codeborne.selenide.Selenide.*;

/**
 * Class Landing page.
 */
public class AppointmentPage extends AppointmentPageLocators {

    /**
     * Navigate to main page landing page.
     *
     * @return the landing page
     */
    public AppointmentPage navigateToMainPage() {
        open(PropertiesReader.getProperty("URL"));
        return this;
    }

    /**
     * Method openAmountDropDown.
     *
     * @return the landing page
     */
    public AppointmentPage openAmountDropDown() {
        $(AMOUNT_DROP_DOWN).click();
        return this;
    }

    /**
     * Method selectValue.
     *
     * @param value the value
     * @return the landing page
     */
    public AppointmentPage selectValue(final String value) {
        $$(SELECT_MENU_OUTER).find(Condition.text(value)).click();
        return this;
    }

    /**
     * Method selectAmount.
     *
     * @param value the value
     * @return the landing page
     */
    public AppointmentPage selectAmount(final String value) {
        $(APPOINTMENT).click();
        openAmountDropDown();
        selectValue(value);
        return this;
    }

    /**
     * Method add user name.
     *
     * @param value value.
     * @return the landing page
     */
    public AppointmentPage addUserName(final String value) {

        $(USERNAME).setValue(value);

        return this;
    }

    /**
     * Method add phone number.
     *
     * @param value value.
     * @return the landing page
     */
    public AppointmentPage addPhoneNumber(final String value) {

        $(PHONE_NUMBER).setValue(value);

        return this;
    }

    /**
     * Method add time.
     *
     * @param value value.
     * @return the landing page
     */
    public AppointmentPage addTime(final String value) {
        $(TIME).setValue(value);
        return this;
    }

    /**
     * Method clickOnLeaveRequest.
     *
     * @return the loan page
     */
    public LandingPage clickOnLeaveRequest() {
        $(SEND_REQUEST).click();
        $(ALERT_INFO_FORM).shouldBe(Condition.visible).shouldHave(Condition.text(ALERT_TEXT));
        $(CLOSE_FORM).click();
        return new LandingPage();
    }
}
