import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class EliminaRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        Set<Integer> numerosUnicos = new LinkedHashSet<>();

        System.out.println("Digite 20 números inteiros:");

        // Leitura dos números
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            numerosUnicos.add(vetor[i]); // O Set automaticamente elimina duplicatas
        }

        // Exibição dos valores únicos
        System.out.println("\nValores originais:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nValores sem repetição:");
        for (int num : numerosUnicos) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}