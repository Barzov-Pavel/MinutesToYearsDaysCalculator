
public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long remainingMinutes = minutes % 60;
            long localHours = minutes / 60;

            long remainingHours = localHours % 24;
            long localDays = localHours / 24;

            long remainingDays = localDays % 365;
            long localYears = localDays / 365;

            System.out.println(minutes + " min = " + localYears + " y and " + remainingDays + " d");
        }
    }
}
