import java.util.Scanner;

public class Bai10_Scaner {
    public static void main(String[] args) {
        // khởi tạo đối tượng Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(s);

        System.out.println("Nhập vào số nguyên: ");
        int n = sc.nextInt();

        System.out.println("Bạn đã nhập số nguyên n: " + n);

        sc.close();
    }
}
