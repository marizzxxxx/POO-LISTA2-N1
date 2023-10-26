import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe a duração do evento em segundos: ");
        int demseg = input.nextInt();

        int hrs = demseg / 3600;
        int min = (demseg % 3600) / 60;
        int seg = demseg % 60;

        String horas = String.format("%02d:%02d:%02d", hrs, min, seg);

        System.out.println("Duração do evento: " + horas);

        input.close();
    }
}
