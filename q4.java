import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("CALCULADORA DE DÓLAR\n");

            System.out.print("FORNEÇA O VALOR DO DÓLAR HOJE:");
            double dólar = scanner.nextDouble();
            System.out.print("INFORME A QUANTIA DE REAIS:");
            double quantia = scanner.nextDouble();
            
            double valor;
            valor = dólar * quantia;

            System.out.print("VALOR DO DÓLAR PARA REAL: ");
            System.out.print(valor);
   }
        }
    }