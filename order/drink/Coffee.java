package order.drink;

import order.ReaderNumber;

public class Coffee extends Drink{
    
    int coffee = 100;//стоимость кофе

    public int getCoffee() {
        return coffee;
    }
    
    public static void coffeeDrink() {
        
        ReaderNumber reader = new ReaderNumber();
        System.out.println("Вы заказали чашечку кофе!");
        boolean start = true;
            do {
                System.out.println("Сахар, молоко добавим ? \n"
                    +"1) Да\n"
                    +"2) Нет\n"
                    +"0) Я передумал(а)");
                
                switch (reader.readNumber()) {
                    case 0:
                        start = false;
                        System.out.println("До встречи!");
                        break;
                        
                    case 1:
                        addDrink();
                        Adds adds = new Adds();
                        adds.addSmth();
                        Coffee addCoffee = new Coffee();
                        System.out.println("Счет: \n" 
                                + addCoffee.getCoffee() + " руб." + " - Кофе \n"
                                + adds.getAdds() + " руб." + " - Молоко и сахар");
                        break;
                        
                    case 2:
                        addDrink();
                        cup();
                        costCoffee();
                        break;
                    
                }
            }while(start = false);
    }
        
    public static void costCoffee() {
        Coffee pureCoffee = new Coffee();
        System.out.println("С вас: " + pureCoffee.getCoffee() + " руб.");
       
    }
}
   

