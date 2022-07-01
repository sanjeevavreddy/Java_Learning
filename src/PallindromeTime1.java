import java.text.DateFormat;
import java.time.LocalTime;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class PallindromeTime1 {
    public static void main(String[] args) {

        System.out.println(solve("22:59"));
    }


    public static int solve(String GivenTime) {

        int minutes = 0;
        while (!checkPallindrome(GivenTime)) {
            LocalTime tempTime = LocalTime.parse(GivenTime);
            GivenTime = tempTime.plusMinutes(1).toString();
            minutes++;
        }
        return minutes;

    }

    private static boolean checkPallindrome(String givenTime) {
        StringBuilder temp = new StringBuilder();
        for (int i = givenTime.length() - 1; i >= 0; i--) {
            temp.append(givenTime.charAt(i));
        }
        return givenTime.equals(temp.toString());
    }


}

