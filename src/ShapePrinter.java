public class ShapePrinter {
    private Shape shape;

    public ShapePrinter() {
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void print(Shape shape) {
        shape.printName();
    }
}
