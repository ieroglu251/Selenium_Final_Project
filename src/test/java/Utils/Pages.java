package Utils;


import Pages.activities.CalendarEventsPage;

public class Pages {

    private CalendarEventsPage calendarEventsPage;




    public CalendarEventsPage calendarEventsPage() {
        if (calendarEventsPage == null) {
            calendarEventsPage = new CalendarEventsPage();
        }
        return calendarEventsPage;
    }


}
