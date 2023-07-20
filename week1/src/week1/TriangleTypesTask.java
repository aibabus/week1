package week1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TriangleTypesTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Enter A: ");
        double A = scanner.nextDouble();
        System.out.print("Enter B: ");
        double B = scanner.nextDouble();;
        System.out.print("Enter C: ");
        double C = scanner.nextDouble();;

        double[] InputSides = {A, B, C};
        Arrays.sort(InputSides);


        double inputValueA = InputSides[2];
        double inputValueB = InputSides[1];
        double inputValueC = InputSides[0];

        System.out.println("a " + inputValueA);
        System.out.println("B " +inputValueB);
        System.out.println("C " +inputValueC);

        if(inputValueA >= (inputValueB + inputValueC)){
            System.out.println("NAO FORMA TRIANGULO");

        } else if (sqr(inputValueA) == (sqr(inputValueB) + sqr(inputValueC))) {
            System.out.println("TRIANGULO RETANGULO");

        } else if (sqr(inputValueA) > (sqr(inputValueB) + sqr(inputValueC))) {
            System.out.println("TRIANGULO OBTUSANGULO");

        } else if (sqr(inputValueA) < (sqr(inputValueB) + sqr(inputValueC))) {
            System.out.println("TRIANGULO ACUTANGULO");

        }
        int count = 0;
        double[] sides = {inputValueA, inputValueB, inputValueC};
        for(int i = 0; i < sides.length -1 ; i++){
            if(sides[i] == sides[i + 1]){
                count +=1;
            }


        }
        switch(count){
            case 0: if (inputValueA == inputValueC){
                System.out.println("TRIANGULO ISOSCELES");
            }
            break;

            case 1:
                System.out.println("TRIANGULO ISOSCELES");

                break;
            case 2:
                System.out.println("TRIANGULO EQUILATERO");
                break;
        }
    }
    public static double sqr(double a){
        return a*a;
    }


}
