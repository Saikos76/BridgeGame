package bridgegame;

public class ConsoleRenderer implements GameRenderer {

    @Override
    public void renderCharacter(String name, int level) {
        System.out.println("[Console] Character: " + name + ", Level: " + level);
    }

    @Override
    public void renderAttack(String characterName, String attack) {
        System.out.println("[Console] " + characterName + " uses " + attack);
    }
}