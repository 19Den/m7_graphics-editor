public class Trapezoid extends Shape {
    private final String defaultName = "trapezoid";
    private String name;

    public Trapezoid(String name) {
        this.name = name;
    }

    public Trapezoid() {
    }

    @Override
    public void printName() {
        System.out.println(name == null ? defaultName : name);
    }
}
