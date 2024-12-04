package problem_one;

public class Clothing extends Product{
    private String brand;
    private double discountPercentage; //Ex 0.29 for 29%
    public Clothing(String name, double price, String brand, double discountPercentage) {
        super.setName(name);
        super.setPrice(price);
        this.brand = brand;
        this.discountPercentage = discountPercentage;
    }

    @Override
    public double getPrice() {
        return super.getPrice() * (1 - discountPercentage);
    }


    @Override
    public String toString() {
        return "Clothing{" +
                "name='" + super.getName() + '\'' +
                ", original price=" + super.getPrice() +
                ", discounted price=" + getPrice() +
                ", brand='" + brand + '\'' +
                ", discountPercentage=" + (discountPercentage * 100) + "%" +
                "} ";
    }
}
