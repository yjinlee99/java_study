package day10.enum_ex01;

enum Day {
    SUNDAY, MONDAY, TUESDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class enum_test {
    Day day;

    public enum_test(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
            case SATURDAY:
                System.out.println("Weekends are best.");
                break;

            default:
                System.out.println("Midweek days are so-so");
        }
    }
}
