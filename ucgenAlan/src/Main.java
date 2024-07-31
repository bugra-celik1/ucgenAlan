import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     double a,b,c,cevre,u,alan;
     Scanner inp = new Scanner(System.in);
        System.out.print("Üçgenin 1. kenarını giriniz:");
        a = inp.nextDouble();
        System.out.print("Üçgenin 2. kenarını giriniz:");
        b = inp.nextDouble();
        System.out.print("Üçgenin 3. kenarını giriniz:");
        c = inp.nextDouble();

        cevre = a + b + c;
        u = cevre / 2;

        alan = Math.sqrt(u*(u-a) * (u-b) * (u -c));

        System.out.println("Üçgenin alanı:" + alan);







    }
}