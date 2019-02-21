package smoke;

import driver.BaseTest;
import org.testng.annotations.Test;
import pages.AppointmentPage;

public class RequestWithCorrectData extends BaseTest {

    @Test(description = "Navigate to main page > check all information")
    public void createRequestAndCheckInformation() {
        new AppointmentPage()
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
