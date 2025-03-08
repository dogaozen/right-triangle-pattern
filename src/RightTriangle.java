import java.util.Scanner;

public class RightTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("How many lines?: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
