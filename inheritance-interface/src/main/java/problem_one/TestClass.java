package problem_one;

public class TestClass {
    public static void main(String[] args) {
        Product[] products = {
                new Clothing("T-Shirt", 19.99, "Nike", 0.10),
                new Electronics("Smartphone", 699.99, 2, 99.99),
                new Electronics("Laptop", 1199.99, 3, 149.99),
                new Furniture("Sofa", 499.99, "Leather", 50.00),
                new Furniture("Chair", 199.99, "Wood", 25.00)
        };
        //print the status of the objects(overriding toString())
        for(Product product : products){
            System.out.println(product);
        }
        //sum of all the products
        System.out.printf("Sum of the products: %.2f%n",sumProducts(products));


    }
    public static double sumProducts(Product[] col) {
        // Handle the case where the array is null
        if (col == null) {
            return 0.0; // Return 0.0 as default sum when no array is provided
        }

        double sum = 0.0;
        for (Product product : col) {
            if (product != null) {
                sum += product.getPrice();
            }
        }
        return sum;
    }

}
