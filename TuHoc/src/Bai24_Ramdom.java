import java.util.Random;

public class Bai24_Ramdom {
    public static void main(String[] args) {
        Random rand = new Random();
        // lấy ngẫu nhiên số nguyên
        int songuyen = rand.nextInt(-50, 51);
        System.out.println(songuyen);
        // tương tự số thực . nextdouble
    }
}
