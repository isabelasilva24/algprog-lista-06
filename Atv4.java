import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = new char[10];
        int consoantes = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um caractere: ");
            letras[i] = sc.next().charAt(0);

            char c = Character.toLowerCase(letras[i]);

            if (Character.isLetter(c) &&
                c != 'a' && c != 'e' && c != 'i' &&
                c != 'o' && c != 'u') {
                consoantes++;
            }
        }

        System.out.println("Consoantes:");
        for (int i = 0; i < 10; i++) {
            char c = Character.toLowerCase(letras[i]);

            if (Character.isLetter(c) &&
                c != 'a' && c != 'e' && c != 'i' &&
                c != 'o' && c != 'u') {
                System.out.println(letras[i]);
            }
        }

        System.out.println("Quantidade de consoantes: " + consoantes);
    }
}
