public class L_2_1_8 {
    public static int leapYearCount(int year) {
        return (year / 4 - year / 100) + year / 400;
    }

    public static void main(String[] args) {
        System.out.println(leapYearCount(200));
    }
}
