import java.util.Random;

public class Exercicio10 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] x = new int[10];
        int temp=0;
        //preenchimento e impressao antes da ordenação
        System.out.println("Antes da ordenação");
        for (int i = 0; i < x.length; i++) {
            x[i] = rd.nextInt(5,89);
            System.out.print(x[i]+" ");
        }

        // lógica para ordenar (crescente)
        for(int j=0;j<x.length;j++){
        for (int o=0; o<x.length-1 ;o++){

            if (x[o]>x[o+1]){
                temp=x[o];
                x[o]=x[o+1];
                x[o+1]=temp;
            }
        }}

        System.out.println("\nDepois da ordenação");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");

        }
            // executa 3 vezes para ve ro maior
        // fazer 10 vezes para ver a maior nota

    }
}
