import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        double nota;
        int total = 0;


        double[] x = new double[2];

        // para cada aluno realizar o ngc de repeticao dentro desse forzao
        for (int i = 0; i < x.length; i++) {

            System.out.println("Aluno " + (i + 1));
            //muda de aluno, zera a variavel nota. Se zerar ela la em cima, ela vai ser zerada somente uma vez
            nota = 0;
            // para cada nota (4)
            for (int n = 1; n <= 4; n++) {
                System.out.println("Nota " + n + " -->");
                //eu quero que some as notas
                nota = nota + sc.nextDouble();

            }
            // para guardar quantas pessoas estao aprovadas
            if (x[i] <= 6) {
                total++;
            }
            // adiciona as medias de todos os alunos dentro de uma lista
            x[i] = nota / 4;
            System.out.println("");


        }

        System.out.println("\n Media dos alunos");
        //para imprimir as medias de todos os alunos
        for (int i = 0; i < x.length; i++) {
            System.out.println("Aluno " + (i + 1) + "-->" + df.format(x[i]));
        }

        System.out.println("Total de Alunos Aprovados: " + total);
    }
}
