public class FigureOutput {
    public static void main(String[] args) {

        Shape circle = new Circle();
        ShapePrinter anyone = new ShapePrinter();
        anyone.print(circle);
        Shape circle_2 = new Circle("circle_2");
        anyone.setShape(circle_2);
        anyone.print(circle_2);
    }
}
