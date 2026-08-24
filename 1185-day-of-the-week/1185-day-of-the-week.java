class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int[] daysInMonths = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayNames = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        int totalDays = 0;
        for (int y = 1971; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }
        for (int m = 1; m < month; m++) {
            totalDays += daysInMonths[m];
        }
        if (month > 2 && isLeapYear(year)) {
            totalDays += 1;
        }
        totalDays += day - 1;
        return dayNames[totalDays % 7];
    }
    
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}