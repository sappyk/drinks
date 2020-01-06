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
            boolean start = true;
            do {
                System.out.println("Сахар, молоко добавим ? \n"
                    +"1) Да\n"
                    +"2) Нет\n"
                    +"0) Я передумал(а)");
                
                switch (readNumber()) {
                    case 0:
                        start = false;
                        System.out.println("До встречи!");
                        break;
                        
                    case 1:
                        addSmthToTea();
                        break;
                        
                    case 2:
                        costTea();
                        break;
                    
                }
            }while(start = false);
    }
     
     private static void addSmthToTea() {
            boolean start = true;
            do {
                System.out.println("Чего желаете ? \n"
                    +"1) Молоко\n"
                    +"2) Сахар\n"
                    +"0) Я передумал(а)");
                
                switch (readNumber()) {
                    case 0:
                        start = false;
                        System.out.println("До встречи!");
                        break;
                        
                    case 1:
                        milk();
                        break;
                        
                    case 2:
                        sugar();
                        break;
                    
                }
            }while(start = false);
       
    }
     
     public static void coffeeDrink() {
        System.out.println("Вы заказали чашечку кофе!");
    }
     
    public static void chocolateDrink() {
        System.out.println("Вы заказали чашечку шоколада!");
    }
    
    public static void milk() {
        int milk = 20; //стоимость чая
        int tea = 80;
        int total = milk + tea;
        System.out.println("С вас: " + total + " руб.");
        
    }
    
    public static void sugar() {
        int tea = 80; //стоимость чая
        int sugar = 10;
        int total = tea + sugar;
        System.out.println("С вас: " + total + " руб.");
        
    }
    
    public static void costTea() {
        int tea = 80; //стоимость чая
        System.out.println("С вас: " + tea + " руб.");
        
    }
}
