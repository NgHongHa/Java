public class Bai17_Breack_continue {
    public static void main(String[] args) {
        // timh tong 1-5 bo qua so 3
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            } else System.out.println("tong" + i);
        }
    }
}
