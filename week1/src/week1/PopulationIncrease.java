package week1;

import java.util.Locale;
import java.util.Scanner;

public class PopulationIncrease {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Number of cases: ");
        int count = scanner.nextInt();
        for(int i = 0; i < count; i++ ){
            int years = 0;
            System.out.println("cityA");
            double cityA = scanner.nextDouble();
            System.out.println("cityB");
            double cityB = scanner.nextDouble();
            System.out.println("growthA");
            double growthA = scanner.nextDouble();
            System.out.println("growthB");
            double growthB = scanner.nextDouble();

            while(cityA <= cityB){
                cityA = cityA + (cityA * (growthA / 100));
                cityB = cityB + (cityB * (growthB / 100));
                years += 1;
            }
            if(years > 100){
                System.out.println("Mais de 1 seculo, " + "More than 1 century");
            }else{
                System.out.println(years + " anos");
            }


        }
    }
}
