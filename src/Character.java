import java.util.ArrayList;

import Strategy.Attack.AttackStrategy;
import Strategy.Defense.DefenseStrategy;

public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private ArrayList<DefenseStrategy> defenseStrategies;

    public Character(String type, AttackStrategy attackStrategy, ArrayList<DefenseStrategy> defenseStrategies) {
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = defenseStrategies;
    }

    public void attack() {
        attackStrategy.attack(this.type);
    }

    public void defend() {
        for(DefenseStrategy defenseStrategy: defenseStrategies) {
            defenseStrategy.defend();
        }
    }
}