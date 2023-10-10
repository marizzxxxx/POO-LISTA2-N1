import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um numero de 1 a 9: ");
        int tab = scanner.nextInt();
        
        if (tab >= 1 && tab <= 9) {
            System.out.println("Tabuada do " + tab + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = tab * i;
                System.out.println(tab + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Coloque outor numero!");
        }
        
        scanner.close();
    }
}