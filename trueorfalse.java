import java.util.Scanner;

public class trueorfalse {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Escreva um número : ");
        int n = sc.nextInt();

        boolean par = n%2==0;

        if (par == true) {
            System.out.printf("O número %d é par", n);
        }
        else {
            System.out.printf("O número %d é ímpar", n);
        }
    }
}
