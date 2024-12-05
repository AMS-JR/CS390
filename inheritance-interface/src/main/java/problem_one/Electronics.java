package problem_one;

public class Electronics extends Product{
    private int warrantyInMonths; //in months
    private  double warrantyCost;

    public Electronics(String name, double price, int warrantyInMonths, double warrantyCost) {
        super.setName(name);
        super.setPrice(price);
        this.warrantyInMonths = warrantyInMonths;
        this.warrantyCost = warrantyCost;
    }
    @Override
    public double getPrice() {
        return super.getPrice() + warrantyCost;
    }
    @Override
    public String toString() {
        return "Electronics{" +
                "name='" + super.getName() + '\'' +
                ", original price=" + super.getPrice() +
                ", final price (with warranty)=" + getPrice() +
                ", warrantyInMonths=" + warrantyInMonths +
                ", warrantyCost=" + warrantyCost +
                "} ";
    }

}
