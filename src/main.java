public class main {
    public static void main(String[] args){
        Restaurant Shiska = new Restaurant(10);
        Shiska.addDish(new Dish("Стейк", 490, 17, 0));
        Shiska.addDish(new Dish("Карбонара", 500, 15, 0));

        Shiska.printMenu();

        boolean enough = Shiska.isEnoughTime("Карбонара", 15);
        if (enough){
            System.out.println("Успеем");
        }else{
            System.out.println("Не успеем");
        }
    }
}
