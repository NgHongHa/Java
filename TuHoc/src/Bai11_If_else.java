import java.util.Scanner;

public class Bai11_If_else {
    public static void main(String[] args) {
        // tính BMI
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào chiều cao : ");
        double cao = sc.nextDouble();
        System.out.println("nhập vào cân nặng : ");
        double nang = sc.nextDouble();
        // tinhs bmi
        double bmi = nang / Math.pow(cao, 2);
        // kiểm tra điều kiện
        if (bmi < 15)
            System.out.println("thân hình quá gầy");
        else if (bmi > 15 && bmi < 16) {
            System.out.println("thân hình  gầy");
        } else if (bmi > 16 && bmi < 18.5) {
            System.out.println("thân hình hơi gầy");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.println("thân hình bình thươngf");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("thân hình hơi béo");
        } else if (bmi > 30 && bmi < 35) {
            System.out.println("thân hình hơi béo");
        } else
            System.out.println("béo");
    }
}
