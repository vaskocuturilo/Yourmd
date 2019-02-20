package smoke;

import driver.BaseTest;
import org.testng.annotations.Test;
import pages.LandingPage;

public class RequestWithCorrectData extends BaseTest {

    @Test(description = "Navigate to main page > checks all information")
    public void createRequestAndCheckInformation() {
        new LandingPage()
                .navigateToMainPage()
                .selectAmount("Гастроэнтерология")
                .addUserName("Auto test")
                .addPhoneNumber("+7 999 99 99")
                .addTime("24 Monate")
                .clickOnLeaveRequest()
                .checkThatPageIsCompletelyLoaded()
                .checkHeaderMenu()
                .checkHeaderService()
                .checkService()
                .checkSpecialist()
                .checkContacts()
                .clickToTheMainLogo();
    }
}
