import java.util.Scanner;

public class CalculaFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe um número para verificar na sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (pertenceAFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceAFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true; // 0 e 1 sempre fazem parte da sequência
        }

        int anterior = 0;
        int atual = 1;

        while (atual < num) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return atual == num; // Retorna verdadeiro se o número atual é igual ao número dado
    }
}
