package bridgegame;

public class Main {

    public static void main(String[] args) {

        GameRenderer consoleRenderer = new ConsoleRenderer();
        GameRenderer pixelRenderer = new PixelRenderer();

        Character warrior = new Warrior(consoleRenderer, "Knight", 10);
        Character mage = new Mage(pixelRenderer, "Wizard", 8);

        warrior.display();
        warrior.attack();

        System.out.println();

        mage.display();
        mage.attack();

        System.out.println();
        System.out.println("Switching renderer...");

        warrior = new Warrior(pixelRenderer, "Knight", 10);

        warrior.display();
        warrior.attack();
    }
}
