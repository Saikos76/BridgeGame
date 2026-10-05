package bridgegame;

public class Main {

    public static void main(String[] args) {

        Color red = new RedColor();
        Color blue = new BlueColor();

        Shape redCircle = new Circle(red);
        Shape blueCircle = new Circle(blue);

        Shape redSquare = new Square(red);
        Shape blueSquare = new Square(blue);

        redCircle.draw();
        blueCircle.draw();
        redSquare.draw();
        blueSquare.draw();
    }
}
