import java.util.Scanner;

public class AnaliseNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int somaPares = 0;
        int qtdImpares = 0;

        
        System.out.println("Digite 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

      
        System.out.print("\nNúmeros pares digitados: ");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                somaPares += num;
            }
        }

       
        System.out.println("Soma dos números pares: " + somaPares);

        
        System.out.print("Números ímpares digitados: ");
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                qtdImpares++;
            }
        }

        System.out.println("Quantidade de números ímpares: " + qtdImpares);

        scanner.close();
    }
}