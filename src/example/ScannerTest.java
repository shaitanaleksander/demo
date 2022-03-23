package example;

import java.io.Console;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("user name enter please here >>");

        String s = scanner.nextLine();

        System.out.println("hello " + s);
        System.out.println("what is your age? ");
        int i = scanner.nextInt();

        System.out.println("in 10 years you will be " +( i + 10));

    }
}
