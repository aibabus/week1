package week1;

public class Sequence4 {
    public static void main(String[] args) {
        int a;
        int b;
        for (a = 0; a <= 20; a += 2) {
            for (b = 10; b <= 30; b+=10) {
                System.out.println("I=" + (a / 10.0 + " J=" + ((b + a)/10.0)));
            }
        }
    }
}
