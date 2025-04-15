import java.util.Arrays;
import java.util.Scanner;

public class Bai27_Mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời nhập vào số phần tử của mảng");
        int n = sc.nextInt();
        // tạo mảng có n phần tử
        int[] mang = new int[n];
        // nhập dl
        for (int i = 0; i < n; i++) {
            System.out.println("M[" + i + "] = ");
            mang[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(mang));
    }
    // xuất mảng

}
