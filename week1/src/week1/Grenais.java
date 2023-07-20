package week1;

import java.util.Scanner;

public class Grenais {
    public static void main(String[] args) {
        int inter = 0;
        int gremio = 0;
        int draws = 0;

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int nextM = 1;

        while(nextM == 1){
            int interW = 0;
            int gremioW = 0;
            int drawsM = 0;
            int countM = 0;
            System.out.print("Inter score: ");
            int interGoals = scanner.nextInt();
            System.out.print("Gremio score: ");
            int gremioGoals = scanner.nextInt();
            System.out.println("Novo grenal " + interGoals + " - Inter " + gremioGoals + " - Gremio");
            if(interGoals > gremioGoals){
                interW += 1;
            } else if (interGoals < gremioGoals) {
                gremioW += 1  ;
            }else{
                drawsM += 1;
            }
            countM += 1;
            inter += interW;
            gremio += gremioW;
            draws += drawsM;
            count += countM;


            int next = scanner.nextInt();
            nextM = next;
        }

        System.out.println(count + " - grenais");
        System.out.println("Inter: " + inter);
        System.out.println("Gremio: " + gremio);
        System.out.println("Empates: " + draws);

    }
}
