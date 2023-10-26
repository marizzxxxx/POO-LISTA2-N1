import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um valor de três dígitos: ");
        int mum = input.nextInt();

        if (mum >= 100 && mum <= 999) {
            int d1 = mum / 100;
            int d2 = (mum % 100) / 10;
            int d3 = mum % 10;

            int inverso = d3 * 100 + d2 * 10 + d1;

            System.out.println("O valor original é: " + mum);
            System.out.println("O valor invertido é: " + inverso);
        } else {
            System.out.println("O número informado não tem três dígitos.");
        }

        input.close();
    }
}
