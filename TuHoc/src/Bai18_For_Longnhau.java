public class Bai18_For_Longnhau {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(i + "" + j + "\t");

            }
            System.out.println("");
        }
//        vẽ chữ N

        System.out.println("");
        System.out.println("");

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == j || j == 7 || j == 1) {
                    System.out.print("*" + "\t");
                } else System.out.print("" + "\t");

            }
            System.out.println("");
        }
        // hình vuông
        System.out.println("");
        System.out.println("");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i == 7 || i == 1 || j == 1 || j == 7) {
                    System.out.print("*" + "\t");
                } else System.out.print("" + "\t");

            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("_________________");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
//             System.out.print("" + "\t");

            }
            System.out.println("");
        }
    }

}
