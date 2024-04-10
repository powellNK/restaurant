public class Dish {
    private String nameOfDish;
    private int priceDish;
    private int timeCooking;
    private int ageLimit;

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public int getPriceDish() {
        return priceDish;
    }

    public void setPriceDish(int priceDish) {
        this.priceDish = priceDish;
    }

    public int getTimeCooking() {
        return timeCooking;
    }

    public void setTimeCooking(int timeCooking) {
        this.timeCooking = timeCooking;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public Dish(String nameOfDish, int priceDish, int timeCooking, int ageLimit) {
        this.nameOfDish = nameOfDish;
        this.priceDish = priceDish;
        this.timeCooking = timeCooking;
        this.ageLimit = ageLimit;
    }


    @Override
    public String toString() {
        return "Название: " + nameOfDish +
                " Цена: " + priceDish +
                ", Время приготовления: " + timeCooking +
                " , ВОзрастной ценз: " + ageLimit;
    }
}
