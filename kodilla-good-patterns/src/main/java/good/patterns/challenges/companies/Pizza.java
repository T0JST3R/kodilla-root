package good.patterns.challenges.companies;

public class Pizza implements Product {
    private Integer name, size;
    private Double price;
    private String companyName;

    public Pizza(Integer name, Integer size, Double price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }

    @Override
    public Integer getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        if (this.size == 0) {
            return 15.0;
        } else if (this.size == 1) {
            return 18.0;
        } else if (this.size == 2) {
            return 22.0;
        } else return 100.0;
    }

    public Integer getSize() {
        return size;
    }
}
