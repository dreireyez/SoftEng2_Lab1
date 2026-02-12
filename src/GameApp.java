import java.util.ArrayList;

public class GameApp {
    public static void main(String[] args) {
        Character knight = new Character("Knight",
            new SwordAttack(),
            new ArrayList<>() {{
                add(new ShieldBlock());
                add(new Dodge());
                add(new MagicBarrier());
            }}
        );
        Character wizard = new Character("Wizard",
            new CastSpell(),
            new ArrayList<>() {{
                add(new MagicBarrier());
            }}
        );
        Character archer = new Character("Archer", 
            new ShootArrow(),
            new ArrayList<>() {{
                add(new Dodge());
            }}
        );

        knight.attack();
        knight.defend();

        wizard.attack();
        wizard.defend();

        archer.attack();
        archer.defend();
    }
}