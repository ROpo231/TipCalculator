
import java.util.Scanner;
public class theworld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an odd integer: ");
        int number = scan.nextInt();

        while (number % 2 == 0) {
            System.out.print("No silly, i said odd not odd! Try again: ");
            number = scan.nextInt();
        }

        System.out.print("Done!");

    }
}
