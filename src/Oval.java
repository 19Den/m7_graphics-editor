public class Oval extends Shape {
    private final String defaultName = "oval";
    private String name;

    public Oval(String name) {
        this.name = name;
    }

    public Oval() {
    }

    @Override
    public void printName() {
        System.out.println(name == null ? defaultName : name);
    }
}
