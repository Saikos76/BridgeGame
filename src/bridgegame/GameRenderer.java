package bridgegame;

public interface GameRenderer {
    void renderCharacter(String name, int level);
    void renderAttack(String characterName, String attack);
}