public class ShapeDrawer implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing a circle with radius " + circle.getRadius());
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println("Drawing a rectangle with width "
                + rectangle.getWidth() + " and height " + rectangle.getHeight());
    }
}
