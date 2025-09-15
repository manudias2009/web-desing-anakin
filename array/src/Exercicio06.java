import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade;
        boolean especial = true;

        System.out.print("Quantidade de elementos no Array --> ");
        quantidade = sc.nextInt();

        int[] x = new int[quantidade];

        for (int i = 0; i < x.length; i++) {
            System.out.print("Número " + (i + 1) + "-->");
            x[i] = sc.nextInt();
        }
        // verifica se o vetor não é especial
        for (int i = 0; i < quantidade -1; i++) {
            //se os dois resultados foram iguais, ou é par par ou é impar impar logo NAO especial
            if (x[i] % 2==x[i+1]%2) {
                especial=false;
                break;
            }


        }
        if (especial == true){
            System.out.println("É especial!");
        }
        else{
            System.out.println("Não é especial");
        }

    }
}
