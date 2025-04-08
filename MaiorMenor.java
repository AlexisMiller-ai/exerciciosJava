import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        
        
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        
        
        int maior = vetor[0];
        int menor = vetor[0];
        
        for (int i = 1; i < 10; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        
        
        System.out.println("\nO maior elemento do vetor é: " + maior);
        System.out.println("O menor elemento do vetor é: " + menor);
        
        scanner.close();
    }
}

