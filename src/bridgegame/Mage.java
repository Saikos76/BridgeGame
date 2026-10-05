package bridgegame;

public class Mage extends Character {

    public Mage(GameRenderer renderer, String name, int level) {
        super(renderer, name, level);
    }

    @Override
    public void attack() {
        renderer.renderAttack(name, "Fireball");
    }
}