public class Main {
    public static void main(String[] args) {
        NewDateInterface calendarToNewDateAdapter = new CalendarToNewDateAdapter();
        calendarToNewDateAdapter.setDay(30);
        calendarToNewDateAdapter.setMonth(3);
        calendarToNewDateAdapter.setYear(2026);

        calendarToNewDateAdapter.advanceDays(6);

        System.out.printf("%d.%d.%d%n", calendarToNewDateAdapter.getDay(), calendarToNewDateAdapter.getMonth(), calendarToNewDateAdapter.getYear());
    }
}
