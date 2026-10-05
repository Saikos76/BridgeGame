package bridgegame;

public abstract class Character {

    protected GameRenderer renderer;
    protected String name;
    protected int level;

    public Character(GameRenderer renderer, String name, int level) {
        this.renderer = renderer;
        this.name = name;
        this.level = level;
    }

    public void display() {
        renderer.renderCharacter(name, level);
    }

    public abstract void attack();
}