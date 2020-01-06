package order;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    
    private static int readNumber() {
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
    
    public static void startWork() throws IOException {
        
        Scanner sc = new Scanner(System.in);
        boolean start = true;
        do {

        System.out.println("Сделайте свой заказ! \n"
            + " 1) Чай\n"
            + " 2) Кофе\n"
            + " 3) Шоколад\n"
            + " 0) Выход из программы.\n");
        
        switch (readNumber()) {
            case 0:
                start = false;
                System.out.println("До встречи!");
                break;
            
            case 1:
                teaDrink();
                break;
                
            case 2:
               coffeeDrink();
               break;
            
            case 3:
                chocolateDrink();
                break;
        }
        } while(start = false);
        }
    
     public static void teaDrink() {
        System.out.println("Вы заказали чашечку чая!");
    }
     
     public static void coffeeDrink() {
        System.out.println("Вы заказали чашечку кофе!");
    }
     
    public static void chocolateDrink() {
        System.out.println("Вы заказали чашечку шоколада!");
    }
}
    

        
