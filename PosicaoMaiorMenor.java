import java.util.Scanner;

public class PosicaoMaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[5];
        
        System.out.println("Digite 5 valores:");

        // Leitura dos valores
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        // Inicializa com o primeiro elemento
        double maior = valores[0];
        double menor = valores[0];
        int posMaior = 0;
        int posMenor = 0;

        // Encontra as posições do maior e menor
        for (int i = 1; i < 5; i++) {
            if (valores[i] > maior) {
                maior = valores[i];
                posMaior = i;
            }
            if (valores[i] < menor) {
                menor = valores[i];
                posMenor = i;
            }
        }

        // Exibe os resultados
        System.out.println("\nValores digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("[%d] = %.2f\n", i, valores[i]);
        }

        System.out.println("\nPosição do maior valor (" + maior + "): " + posMaior);
        System.out.println("Posição do menor valor (" + menor + "): " + posMenor);
        
        scanner.close();
    }
}