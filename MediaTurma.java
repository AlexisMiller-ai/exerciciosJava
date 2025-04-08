import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[15];
        double soma = 0.0;

        System.out.println("Digite as notas dos 15 alunos:");

        
        for (int i = 0; i < 15; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        
        double media = soma / 15;

       
        System.out.println("\nNotas dos alunos:");
        for (int i = 0; i < 15; i++) {
            System.out.printf("Aluno %2d: %.1f\n", (i + 1), notas[i]);
        }

        System.out.printf("\nMédia geral da turma: %.2f", media);

        scanner.close();
    }
}