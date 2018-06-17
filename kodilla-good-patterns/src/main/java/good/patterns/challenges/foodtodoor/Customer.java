package good.patterns.challenges.foodToDoor;

public class Customer {
    private String name;
    private String adress;
    private double money;

    public Customer(String name, String adress, double money) {
        this.name = name;
        this.adress = adress;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public double getMoney() {
        return money;
    }
}
