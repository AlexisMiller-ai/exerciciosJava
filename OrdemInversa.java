import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[6];

        // Leitura dos valores
        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();
        }

        // Exibição na ordem inversa
        System.out.println("\nValores na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println("Posição " + i + ": " + valores[i]);
        }

        scanner.close();
    }
}