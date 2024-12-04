package recursion.exponent;

public class Exponential {
    public static void main(String[] args) {
        System.out.println("Exponential");
        Exponential exp = new Exponential();
        System.out.println("x^n: " + exp.power(2, 10));
    }
    /**
     *
     * @param x
     * @param n
     * @return power of x^n
     */
    public double power(double x, int n){
        if(n < 0){
            throw new IllegalArgumentException("Exponent must be non-negative");
        }
        if(n == 0){ // base case
            return 1;
        }
        return x * power(x, n-1);
    }
}
