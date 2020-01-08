package order.drink;

public abstract class Drink {
    
    public static void boilWater() {
        System.out.println("Кипятим воду");
    }
    
    public static void addDrink(){
        System.out.println("Добавляем напиток в воду");
    }
    
    public static void cup() {
        System.out.println("Переливаем напиток в чашку");
    }
   
}
