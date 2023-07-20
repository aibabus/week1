package week1;

import java.util.Locale;
import java.util.Scanner;

public class WeightedAverages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Number of cases: ");
        int count = scanner.nextInt();
        for(int i = 0; i < count; i++ ){
            System.out.println("First");
            double firstN = scanner.nextDouble();
            System.out.println("Second");
            double secondN = scanner.nextDouble();
            System.out.println("Third");
            double thirdN = scanner.nextDouble();
            System.out.println("First");

            double average = (firstN*2 + secondN*3 + thirdN*5)/10;
            String formattedAverage= String.format("%.1f", average);
            System.out.println(formattedAverage);
        }

    }
}
