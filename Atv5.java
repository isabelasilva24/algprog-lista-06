import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[20];

        System.out.println("Digite 20 números:");

        for (int i = 0; i < 20; i++) {
            numeros[i] = sc.nextInt();
        }

        System.out.println("Vetor original:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\nPares:");
        for (int n : numeros) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
        }

        System.out.println("\nÍmpares:");
        for (int n : numeros) {
            if (n % 2 != 0) {
                System.out.print(n + " ");
            }
        }
    }
}