public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        ShapeVisitor areaCalculator = new AreaCalculator();
        ShapeVisitor drawer = new ShapeDrawer();


        circle.accept(areaCalculator);
        rectangle.accept(areaCalculator);


        circle.accept(drawer);
        rectangle.accept(drawer);
    }
}
