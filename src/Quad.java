public class Quad extends Shape {
    private final String defaultName = "quad";
    private String name;

    public Quad(String name) {
        this.name = name;
    }

    public Quad() {
    }

    @Override
    public void printName() {
        System.out.println(name == null ? defaultName : name);
    }
}
