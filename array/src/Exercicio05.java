import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int quantidade,auxiliar,j;

        System.out.println( "Digite a quantidade de numeros que vai ter no vetor:");
        quantidade=sc.nextInt();

        int[] x = new int[quantidade];

        //entrada de daods
        //para cada i , que i seja menor que o tamanho do x e vai diminuindo a cada acao
        for (int i = 0; i < x.length; i++) {
            System.out.println("valor:");
            x[i] = sc.nextInt();
        }
        System.out.print("Array antes da inversão: ");
        // imprimir o array
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();

        // inverter os elementeos
        //para transformar o j na ultima posicao
        j=x.length-1;
        //divide por 2 para vhegar na metade( troar o numero de vezes certo)
        for(int i =0;i<x.length/2;i++){
            auxiliar=x[i];
            x[i]=x[j];
            x[j]=auxiliar;
            j--;
        }

        System.out.print("\n " +
                "Array depois da inversão: ");
        // imprimir o array
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }







    }
}
