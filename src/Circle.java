public class Circle extends Shape {
    private final String defaultName = "circle";
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    public Circle() {
    }

    @Override
    public void printName() {
        System.out.println(name == null ? defaultName : name);
    }
}
