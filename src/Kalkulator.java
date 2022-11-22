import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj pierwsza cyfre");
        int a=scanner.nextInt();
        System.out.println("Podaj druga cyfre");
        int b=scanner.nextInt();
        int wynik=a+b;
        System.out.println("Wynik dodawania: "+wynik);

    }
}
