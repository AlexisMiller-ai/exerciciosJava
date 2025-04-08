import java.util.Scanner;

public class MaiorElementoPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE; 
        int posicao = -1;

        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            
            // Verifica se é o maior número
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }
        }

        
        System.out.print("\nVetor digitado: [");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        
        System.out.println("O maior elemento é: " + maior);
        System.out.println("Ele está na posição: " + posicao + " (índice base 0)");
        System.out.println("Ou na posição: " + (posicao + 1) + " (índice base 1)");

        scanner.close();
    }
}