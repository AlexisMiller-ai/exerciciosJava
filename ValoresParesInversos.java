import java.util.Scanner;

public class ValoresParesInversos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[6];
        int contador = 0;

        System.out.println("Digite 6 números inteiros PARES:");

        // Loop para ler 6 valores pares
        while (contador < 6) {
            System.out.print("Valor " + (contador + 1) + ": ");
            int numero = scanner.nextInt();
            
            if (numero % 2 == 0) {
                valores[contador] = numero;
                contador++;
            } else {
                System.out.println("Erro: O número deve ser par. Tente novamente.");
            }
        }

        // Exibe os valores na ordem inversa
        System.out.println("\nValores pares na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println("Posição " + i + ": " + valores[i]);
        }

        scanner.close();
    }
}