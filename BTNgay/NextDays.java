public class NextDays {
    
    public static String getNextDays(int day, int month, int year) {
        // Kiểm tra năm nhuận
        boolean isLeapYear = (year % 4 == 0);

        // Kiểm tra ngày và tháng hợp lệ
        if (day < 1 || month < 1 || month > 12 || year < 1812 || year > 2012) {
            return "Invalid input";
        }

        // Kiểm tra ngày hợp lệ trong tháng
        if (day > daysInMonth(month, isLeapYear)) {
            return "Invalid input";
        }

        // Tìm ngày kế tiếp
        day++;
        if (day > daysInMonth(month, isLeapYear)) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        return "Next date: " + day + "/" + month + "/" + year;
    }

    // Hàm trả về số ngày trong một tháng
    public static int daysInMonth(int month, boolean isLeapYear) {
        if (month == 2 && isLeapYear) {
            return 29;
        } else {
            int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return daysInMonth[month - 1];
        }
    }

    public static void main(String[] args) {
        int day = 29;
        int month = 2;
        int year = 1952;

        // Gọi phương thức getNextDate và in kết quả ra màn hình
        String nextDate = NextDays.getNextDays(day, month, year);
        System.out.println(nextDate);
    }
}