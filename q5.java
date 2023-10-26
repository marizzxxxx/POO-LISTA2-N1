import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("IDADE PARA DIAS\n");
            System.out.print("Informe sua idade em anos, meses e dias:");
            
            System.out.print("Dias:");
            int dias = scanner.nextInt();
            System.out.print("Meses:");
            int meses = scanner.nextInt();
            System.out.print("Anos:");
            int anos = scanner.nextInt();
            
            int idade;

            var Idade = anos * 365 + meses * 30 + dias;

            System.out.println("Idade expressa em dias: " + Idade);
    
   }
        }
    }
