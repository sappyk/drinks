package order;

import java.io.IOException;
import java.util.Scanner;
import order.drink.Coffee;
import order.drink.Tea;

public class Menu {

    public static void startWork() throws IOException {
        
        Scanner sc = new Scanner(System.in);
        ReaderNumber reader = new ReaderNumber();
        boolean start = true;
        do {

        System.out.println("Сделайте свой заказ! \n"
            + " 1) Чай\n"
            + " 2) Кофе\n"
            + " 0) Выход из программы.\n");
        
        switch (reader.readNumber()) {
            case 0:
                start = false;
                System.out.println("До встречи!");
                break;
            
            case 1:
                Tea tea = new Tea();
                tea.teaDrink();
                break;
                
            case 2:
                Coffee coffee = new Coffee();
                coffee.coffeeDrink();
                break;

        }
        } while(start = false);
        }
   

}
