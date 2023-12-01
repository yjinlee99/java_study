package day10.enum_ex01;

public class Main {
    public static void main(String[] args) {
        enum_test firstDay = new enum_test(Day.MONDAY);
        firstDay.tellItLikeItIs();

        enum_test thirdDay = new enum_test(Day.WEDNESDAY);
        thirdDay.tellItLikeItIs();

        enum_test sixthDay = new enum_test(Day.SATURDAY);
        sixthDay.tellItLikeItIs();
    }
}
