import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.print("Informe o valor da diária normal: ");
        double dcomum = input.nextDouble();

        
        double taxas = 0.40; 
        double valorcomum = taxas * dcomum * 30;

        
        double taxac = 0.70;
        double taxapromo = 0.22;
        double dpromo = dcomum - (dcomum * taxapromo);
        double valorpromo = taxac * dpromo * 30;



        double lucro = valorpromo - valorcomum;



        System.out.println("O valor da diária no período da promoção é: " + dpromo);

        System.out.println("O valor médio arrecadado sem a promoção, durante um mês, é: " + valorcomum);

        System.out.println("O valor médio arrecadado com a promoção, durante um mês, é: " + valorpromo);
        
        System.out.println("O lucro ou prejuízo mensal com a promoção é: " + lucro);

        input.close();
    }
}
