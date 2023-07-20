package week1;

import java.util.Scanner;

public class ColumnInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        char T = scanner.next().toUpperCase().charAt(0);

        double[][] M = new double[12][12];
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = scanner.nextDouble();
            }
        }

        double sum = 0;
        for (int j = 0; j < 12; j++) {
            sum += M[j][C];
        }

        if (T == 'M') {
            sum /= 12;
        }

        System.out.printf("%.1f%n", sum);
    }
}
