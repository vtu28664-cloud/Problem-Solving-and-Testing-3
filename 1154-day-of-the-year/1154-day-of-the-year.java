import java.io.*;
import java.time.LocalDate;
class Solution {
    public static int dayOfYear(String date) {
        LocalDate d=LocalDate.parse(date);
        return d.getDayOfYear();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String date=br.readLine().trim();
        int result=dayOfYear(date);
        System.out.println(result);
        br.close();
    }
}