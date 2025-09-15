import java.util.Random;

public class Exercicio07 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] x = new int[rd.nextInt(1,16)];
        int grau=0;
        int freq;

        for(int i=0; i<x.length;i++){
            x[i]=rd.nextInt(2,10);
            System.out.print(x[i]+" ");
        }
        // descobiri o grau do vetor
        for (int i=0;i<x.length;i++){
            //quantas vezes tal numero aparece no vetor
            freq=0;
            for (int k=0;k<x.length;k++){
                if (x[i]==x[k]){
                    freq++;
                }
            }
            //pra ver se tem alguma frequencia maior, e para armazenar a frequenia pq quando o for acaba a frequencia vira 0 denovoi
            if (freq>grau){
                grau=freq;
            }
        }
        System.out.println("\n grau do vetor: "+grau);


    }
}
