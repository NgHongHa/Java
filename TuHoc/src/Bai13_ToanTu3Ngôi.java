import java.util.Scanner;

public class Bai13_ToanTu3Ngôi {
    public static void main(String[] args) {
//        cú pháp  biến = biểu thức 1 ? biểu thức 2 : biểu thức 3
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhập vào số nguyên :");
        int n = sc.nextInt();
        String result = (n % 2 == 0) ? " chẵn" : "lẻ";
        System.out.println(result);
    }
}
