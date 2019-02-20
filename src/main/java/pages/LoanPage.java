package pages;

import locators.LoanPageLocators;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

/**
 * Class Loanpage.
 */
public class LoanPage extends LoanPageLocators {

    /**
     * Method checkHeaderMenu.
     *
     * @return the loan page
     */
    public LoanPage checkHeaderMenu() {
        $$(LIST_HEADER).shouldHaveSize(4);
        return this;
    }

    /**
     * Method checkContacts.
     *
     * @return the loan page
     */
    public LoanPage checkContacts() {
        $$(LIST_HEADER).get(3).click();
        $(CONTACTS).shouldBe(visible);
        $$(CONTACTS_LIST).shouldHaveSize(4);
        return this;
    }

    /**
     * Method checkHeaderService.
     *
     * @return the loan page
     */
    public LoanPage checkHeaderService() {
        $$(LIST_SERVICE).shouldHaveSize(5);
        return this;
    }

    /**
     * Method checkThatPageIsCompletelyLoaded.
     *
     * @return the loan page
     */
    public LoanPage checkThatPageIsCompletelyLoaded() {
        assertEquals("complete", executeJavaScript("return document.readyState"));
        return this;
    }

    /**
     * Method clickToTheMainLogo.
     *
     * @return the loan page
     */
    public LoanPage clickToTheMainLogo() {
        $(MAIN_LOGO).shouldBe(visible);
        return this;
    }

    /**
     * Method checkService.
     *
     * @return the loan page
     */
    public LoanPage checkService() {
        $(SERVICE).shouldHave(
                text("Консультации специалистов"), text("Традиционные методы лечения"),
                text("УЗИ диагностика"), text("Детские приемы"),
                text("Диспансеризация"), text("Функциональная диагностика"),
                text("Амбулаторное оперативное пособие (оперирующие врачи)"), text("Процедурный кабинет"),
                text("Аппаратные методы исследования"), text("Наркология"),
                text("Лабораторная диагностика"), text("Центр реабилитации"),
                text("Справки"), text("Школы (образовательные занятия для пациентов и их родственников)"),
                text("Психологическая помощь"));
        return this;
    }

    /**
     * Method checkSpecialist.
     *
     * @return the loan page
     */
    public LoanPage checkSpecialist() {
        $$(LIST_HEADER).get(2).click();
        $$(LIST_SPECIALIST).shouldHaveSize(35);
        return this;
    }
}
