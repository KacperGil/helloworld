import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Podaj pierwsza cyfre");
        int a=scanner.nextInt();
        System.out.println("Podaj druga cyfre");
        int b=scanner.nextInt();

        if(a>b && a<5){
            System.out.println("Cyfra " +a+ " jest mniejsza od 5");
        }else{
            System.out.println("nw co tam jest");
        }

    }
}
