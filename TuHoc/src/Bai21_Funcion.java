//public class Bai21_Funcion {
//    public static void main(String[] args) {
//        int kq = cong(1, 3, 4);
//        System.out.println(+kq);
//        // gọi hàm xin chào
//        xinchao("female");
//    }
//
//    public static int cong(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    // hàm thủ tục ko có return
//    public static void xinchao(String gioitinh) {
//        if (gioitinh.equals("female"))
//            System.out.println("xin chào tôi là nữ");
//        else System.out.println("xin chào tôi là nam");
//    }
//}
//Giải pt b2
public class Bai21_Funcion {
    public static void main(String[] args) {
        String kq = GiaiPTB2(1, 2, 3);
        System.out.println(kq);
        String kq2 = GiaiPTB2(1, 2, 1);
        String kq3 = GiaiPTB2(1, 2, -3);
        System.out.println(kq2);
        System.out.println(kq3);
    }

    // hàm giải ptb2
    public static String GiaiPTB2(double a, double b, double c) {
        if (a == 0) {
            if (b == 0 && c == 0) return "pt vô số nghiệm";
            if (b == 0 && c != 0) return "pt  bậc 1 vô nghiệm";
            else return "pt có nghiệm kép" + (-c / b);
        } else {
            // giải ptb2
            double denta = b * b - 4 * a * c;
            if (denta < 0) return "pt b2 vo nghiem";
            else if (denta == 0) {
                double x = -b / 2 * a;
                return "pt b2 co nghiem kep " + x;
            } else {
                double x1 = (-b + Math.sqrt(denta)) / 2 * a;
                double x2 = (-b - Math.sqrt(denta)) / 2 * a;
                return "pt b2 co nghiem kep x1 : " + x1 + "va x2 : " + x2;
            }
        }
    }
}