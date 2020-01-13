package order.drink;

import order.ReaderNumber;

public class Tea extends Drink {
    int tea = 80;//стоимость чая

    public void setTea(int tea) {
        this.tea = tea;
    }

    public int getTea() {
        return tea;
    }

    public static void teaDrink() {
        ReaderNumber reader = new ReaderNumber();
        System.out.println("Вы заказали чашечку чая!");
        boilWater();
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
                        Tea addTea = new Tea();
                        
                        System.out.println("Счет: \n" 
                                + addTea.getTea() + " руб." + " - Чай \n"
                                + adds.getAdds() + " руб." + " - Молоко и сахар");
                        break;
                        
                    case 2:
                        addDrink();
                        cup();
                        costTea();
                        break; 
                }
            }while(start = false);
    }

    public static void costTea() {
        Tea pureTea = new Tea();
        System.out.println("С вас: " + pureTea.getTea() + " руб.");
       
    }
}
