import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Solution {
    public static int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        return (int) Math.abs(ChronoUnit.DAYS.between(d1, d2));
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String date1 = br.readLine().trim();
        String date2 = br.readLine().trim();
        int result = daysBetweenDates(date1, date2);
        System.out.println(result);
        br.close();
    }
}