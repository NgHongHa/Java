import java.util.Scanner;

public class Bai13_ToanTu3Ngôi {
    public static void main(String[] args) {
////        cú pháp  biến = biểu thức 1 ? biểu thức 2 : biểu thức 3
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" nhập vào số nguyên :");
//        int n = sc.nextInt();
//        String result = (n % 2 == 0) ? " chẵn" : "lẻ";
//        System.out.println(result);
//        bài tập viết ctrinh  nhập vào điểm và in ra kq xếp loại  hs dùng toán tử ba ngôi
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào điểm  tb của bạn : ");
        double n = sc.nextFloat();
        String xeploai = (n >= 8) ? "giỏi" :
                (n >= 6.5) ? "khá" :
                        (n > 5) ? "tbinh" : "yếu";

        System.out.println(xeploai);
    }

}
// NGOÀI RA CÒN CÓ SWIT CASSE
