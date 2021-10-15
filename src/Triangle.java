public class Triangle extends Shape {
    private final String defaultName = "triangle";
    private String name;

    public Triangle(String name) {
        this.name = name;
    }

    public Triangle() {
    }

    @Override
    public void printName() {
        System.out.println(name == null ? defaultName : name);
    }
}
