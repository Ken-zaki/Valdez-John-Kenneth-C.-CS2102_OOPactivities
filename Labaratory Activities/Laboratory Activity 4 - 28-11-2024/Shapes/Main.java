public class Main {
    public static void main(String[] args) {
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(8, 12);
        Triangle triangle = new Triangle(10,12,15);

        //collection of shapes
        Shape[] shapes = {square, rectangle, triangle};
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        //for computing and printing the perimeter and area
        shapeCollection.getPropertyValues();
    }
}