package week1;
import java.util.Scanner;

public class BanknotesTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputValue = scanner.nextInt();

        int[] banknotes = {100, 50, 20, 10, 5, 2, 1};
        System.out.println(inputValue);

        for (int i : banknotes){
            int notesN = inputValue / i;
            if (i > 0){
                System.out.println(notesN + " " + "nota(s) de R$ " + i);
                inputValue = inputValue % i;
            }
        }


    }
}
