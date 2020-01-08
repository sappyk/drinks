package order.drink;

public class Adds extends Drink {
    
    int adds = 50;//стоимость молока и сахара

    public int getAdds() {
        return adds;
    }

    public static void addSmth() {
        cup();
        System.out.println("Добавляем молоко и сахар");
    }

}
