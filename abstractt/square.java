package abstractt;

public class square extends Shape{
    private final double len;

    public square(double len) {
        this.len = len;
    }

    public double getLen() {
        return len;
    }

    @Override
    public double calculateArea() {
        return Math.pow(len,2);
    }
}
