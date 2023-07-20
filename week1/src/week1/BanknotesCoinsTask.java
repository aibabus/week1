package week1;

import java.util.Locale;
import java.util.Scanner;

public class BanknotesCoinsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter a number: ");
        double inputValue = scanner.nextDouble();;

        double[] banknotes = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
        System.out.println(inputValue);
        for (double i : banknotes){
            double notesN = inputValue / i;
            int value = (int)notesN;
            if (i > 0){
                System.out.println(value + " " + "nota(s) de R$ " + i);
                inputValue = inputValue % i;
            }
        }
    }
}
