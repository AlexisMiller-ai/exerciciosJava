import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class VerificaDuplicados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        Set<Integer> unicos = new HashSet<>();
        Set<Integer> duplicados = new HashSet<>();

        System.out.println("Digite 10 números inteiros:");

        // Leitura dos valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
            
            // Verifica duplicados
            if (!unicos.add(vetor[i])) {
                duplicados.add(vetor[i]);
            }
        }

        // Exibe os resultados
        System.out.println("\nValores digitados:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetor[i] + " ");
        }

        if (duplicados.isEmpty()) {
            System.out.println("\n\nNenhum valor duplicado encontrado.");
        } else {
            System.out.println("\n\nValores duplicados:");
            for (int num : duplicados) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}