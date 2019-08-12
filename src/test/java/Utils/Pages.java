package Utils;


import Pages.activities.CalendarEventsPage;
import Pages.activities.LoginPage;

public class Pages {

    private LoginPage loginPage;


    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

}
