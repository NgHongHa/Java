import java.util.Calendar;

public class Bai22_Date_Time {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
    }
}
// lưu ý tháng chạy từ 0 -11 để lấy chính xác tháng hiện tại cần get xogn +1
