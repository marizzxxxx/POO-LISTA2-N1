import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Conversor\n");
            System.out.print("Celsius para fahrenheit\n");

            System.out.print("Insira a temperatua:");
            double celsius = scanner.nextDouble();
            
            double fahrenheit;
            fahrenheit = (9 * celsius + 160) / 5;

            System.out.print("Em Fahrenheit: ");
            System.out.print(fahrenheit);
   }
        }
    }