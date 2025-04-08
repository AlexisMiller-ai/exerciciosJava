import java.util.Scanner;

public class ProcessaNumerosReais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        int quantidadeNegativos = 0;
        double somaPositivos = 0.0;

        System.out.println("Digite 10 números reais:");

        // Preenche o vetor e faz os cálculos
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            
            if (numeros[i] < 0) {
                quantidadeNegativos++;
            } else {
                somaPositivos += numeros[i];
            }
        }

        // Mostra os resultados
        System.out.println("\nQuantidade de números negativos: " + quantidadeNegativos);
        System.out.printf("Soma dos números positivos: %.2f", somaPositivos);

        scanner.close();
    }
}