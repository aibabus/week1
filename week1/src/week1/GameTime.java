package week1;

import java.util.Scanner;

public class GameTime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Initial hour: ");
        int initialH = scanner.nextInt();
        System.out.print("Initial minute: ");
        int initialM = scanner.nextInt();
        System.out.print("Final hour: ");
        int finalH = scanner.nextInt();
        System.out.print("Final minute: ");
        int finalM = scanner.nextInt();

        // Calculate the duration of the game
        int totalMin = (finalH * 60 + finalM) - (initialH * 60 + initialM);

        if (totalMin <= 0) {
            totalMin += 24 * 60;
        }

        int hours = totalMin / 60;
        int minutes = totalMin % 60;

        // Print the duration of the game
        System.out.println("O JOGO DUROU " + hours + " HORA(S) E "+ minutes + " MINUTO(S)");
    }
}
