import java.util.Random;
import java.util.Scanner;

public class MatrixRandomGenerated {

int a;
int mas2[][];

    void matrix(){

        Random rand = new Random();
        int i=0, n=0 ;
        int mas[][] = new int[i][n];

        for (n = 0; n < this.a; n++) {
            for (i = 0; i < this.a; i++) {
                mas[i][n] = rand.nextInt(20);
                int lengthNumber = (String.valueOf(mas[i][n])).length();
                if (lengthNumber == 1) {
                    System.out.print(mas[i][n] + "  ");
                } else if (lengthNumber == 2) {
                    System.out.print(mas[i][n] + " ");
                }
                if (i == (a-1)) {
                    System.out.println();
                }
            }
        }
        this.mas2 = mas ;


    }

}
