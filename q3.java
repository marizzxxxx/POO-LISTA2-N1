import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("CALCULADORA DE COMBUSTIVEL\n");

            System.out.print("Forneça o tempo gasto na viagem:");
            double tempo = scanner.nextDouble();
            System.out.print("Forneça a velocidade média:");
            double velocidade = scanner.nextDouble();
            
            double distancia;
            distancia = tempo * velocidade;

            System.out.print("Distancia média: ");
            System.out.print(distancia);

            double litros;
            litros = distancia / 12;

            System.out.print("\nQuantidade de litros utilizada na viagem: ");
            System.out.print(litros);
   }
        }
    }