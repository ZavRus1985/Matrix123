import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MatrixRandomGenerated b = new MatrixRandomGenerated();

        System.out.print("Введите размерность массива: ");
        b.a = scanner.nextInt();
        System.out.println(b.mas);

    }
}
