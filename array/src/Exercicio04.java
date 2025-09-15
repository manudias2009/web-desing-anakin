import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String[] mes = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
                "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        double[] temperatura = new double[mes.length];

        double mediaA = 0;
        for (int x = 0; x < mes.length; x++) {

            System.out.print("Digite a temperatura media de " + mes[x]+" ");
            temperatura[x] = sc.nextDouble();
            //digita  e soma digita e soma
            mediaA = mediaA + temperatura[x];


        }
        mediaA = mediaA / mes.length;
        System.out.println("Média anual: " + df.format(mediaA));
        System.out.println("Meses do ano com temperatura acima da média anual");
        //qual é o maior, se a temperatura for maior q a media é para imprimir  nome do mes
        for (int i = 0; i < mes.length; i++) {
            if (temperatura[i] > mediaA) {
                System.out.println(mes[i]);
            }
        }
    }
}
