package good.patterns.challenges.orderService;


import java.util.Objects;

public class User {
    private String name;
    private String lastName;
    private double money;

    public User(String name, String lastName, double money) {
        this.name = name;
        this.lastName = lastName;
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Double.compare(user.money, money) == 0 &&
                Objects.equals(name, user.name) &&
                Objects.equals(lastName, user.lastName);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, lastName, money);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMoney() {
        return money;
    }


}
