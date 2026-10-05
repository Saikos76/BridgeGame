package bridgegame;

public class PixelRenderer implements GameRenderer {

    @Override
    public void renderCharacter(String name, int level) {
        System.out.println("[Pixel] Rendering " + name + " at level " + level + " with pixel graphics.");
    }

    @Override
    public void renderAttack(String characterName, String attack) {
        System.out.println("[Pixel] " + characterName + " performs " + attack + " with pixel effects.");
    }
}