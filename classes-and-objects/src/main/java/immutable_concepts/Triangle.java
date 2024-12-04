package immutable_concepts;

public record Triangle(double height, double base) {
    public Triangle {
        if (height <= 0  || base <= 0){
            throw new IllegalArgumentException("height and base should be positive values");
        }
    }
    public double computeArea(){
        return 0.5 * base * height;
    }
}
