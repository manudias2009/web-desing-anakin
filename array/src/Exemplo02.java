import java.util.Random;

public class Exemplo02 {
    public static void main(String[] args) {
//        double x = Math.random()*10;
//        int y= (int)x;
//        System.out.println(y);

        Random rd =new Random();
        int x =rd.nextInt(5,10);
        System.out.println(x);
    }
}
