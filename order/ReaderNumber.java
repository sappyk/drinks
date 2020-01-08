package order;

import java.util.Scanner;

public class ReaderNumber {
     public static int readNumber() {
        Scanner sc = new Scanner(System.in);
        int read;
        try {
            read = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException ex) {
            System.out.println("Ошибка:" + ex.getMessage());
            read = 0;
        }
        return read;
    }
}
