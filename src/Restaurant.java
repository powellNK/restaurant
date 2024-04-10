public class Restaurant {
    private int size;
    private int capacity;
    private Dish[] dishs;

    public Restaurant(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        dishs = new Dish[capacity];
    }

    public void addDish(Dish dish) {
        if (size == capacity) {
            throw new IllegalArgumentException("Нет места для блюда");
        }
        dishs[size++] = dish;
    }

    public void printMenu() {
        for (int i = 0; i < size; i++) {
            System.out.println(dishs[i]);
        }
    }

    public boolean isEnoughTime(String nameDish, int time) {
        for (int i = 0; i < size; i++) {
            if (dishs[i].getNameOfDish().equals(nameDish) && time >= dishs[i].getTimeCooking()) {
                return true;
            }
        }
        return false;
    }

}
