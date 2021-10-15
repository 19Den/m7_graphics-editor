public class ShapePrinter {
    private final Shape shape;

    public ShapePrinter(Shape shape) {
        this.shape = shape;
    }

    public void print() {
        shape.printName();
    }
}
