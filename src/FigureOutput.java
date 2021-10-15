public class FigureOutput {
    public static void main(String[] args) {
        Shape circleDefault = new Circle();
        Shape circleWithNewName = new Circle("circle_2");
        new ShapePrinter(circleDefault).print();
        new ShapePrinter(circleWithNewName).print();

        Shape quadDefault = new Quad();
        Shape quadWithNewName = new Quad("quad_2");
        new ShapePrinter(quadDefault).print();
        new ShapePrinter(quadWithNewName).print();

        Shape triangleDefault = new Triangle();
        Shape triangleWithNewName = new Triangle("triangle_2");
        new ShapePrinter(triangleDefault).print();
        new ShapePrinter(triangleWithNewName).print();

        Shape trapezoidDefault = new Trapezoid();
        Shape trapezoidWithNewName = new Trapezoid("trapezoid_2");
        new ShapePrinter(trapezoidDefault).print();
        new ShapePrinter(trapezoidWithNewName).print();

        Shape ovalDefault = new Oval();
        Shape ovalWithNewName = new Oval("oval_2");
        new ShapePrinter(ovalDefault).print();
        new ShapePrinter(ovalWithNewName).print();

    }
}
