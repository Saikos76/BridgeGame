package bridgegame;

public class Warrior extends Character {

    public Warrior(GameRenderer renderer, String name, int level) {
        super(renderer, name, level);
    }

    @Override
    public void attack() {
        renderer.renderAttack(name, "Sword Slash");
    }
}