import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma string para ser invertida:");
        String original = scanner.nextLine();
        
        StringBuilder invertida = new StringBuilder();
        
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida.append(original.charAt(i));
        }
        
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida.toString());
        
        scanner.close();
    }
}
