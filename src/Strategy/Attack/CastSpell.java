package Strategy.Attack;

public class CastSpell implements AttackStrategy {
    public void attack(String type) {
        System.out.println(type + " casts a spell!");
    }
}