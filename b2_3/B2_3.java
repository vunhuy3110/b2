package b2_3;

import java.util.Scanner;

public class B2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương N: ");
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Số nhập vào không hợp lệ.");
        } else {

            int tong = 0;

            for (int i = 1; i <= N; i++) {
                tong += i;
            }

            System.out.printf("Tổng các số từ 1 đến %d là: %d%n", N, tong);
        }

        scanner.close();
    }
}
