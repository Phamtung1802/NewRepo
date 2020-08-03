public class Main {
    public static void main(String[] args) {
        ShapeFactory shape=new ShapeFactory();
        shape.getShape("Circle").draw();
    }
}
