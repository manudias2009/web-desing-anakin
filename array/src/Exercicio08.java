import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {

        Random rd = new Random();

        int[] x = new int[10];
        int aux;
        boolean achou;

        for (int i = 0; i < x.length;) {

            aux = rd.nextInt(10);


            achou=false;
            //pra não ter numero repetido
            // comeca na posicao 0 e vai aumentando uma a uma posição do vetor até chegar no final

            for (int k=0; k<i;k++){
                if (aux==x[k]){
                    achou=true;
                    break;
                }
            }
            if (achou == false){
                x[i]=aux;
                System.out.print(x[i] + " ");
                i++;
            }


    }
}}
