import java.util.Scanner;

public class Bai25_KieukituChar {
    public static void main(String[] args) {
        char a = 'a'; // lưu ý dùng nháy đơn
        char kt = 66;
        System.out.println(kt);
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào 1 kí tự");
        String s = sc.nextLine();
        char a1 = s.charAt(0);
        System.out.println(a1);
    }
}
