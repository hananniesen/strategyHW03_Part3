package Abilities;

import Monsters.Monster;

/**
 * The `RangedAttack` class implements the `Attack` interface, creates a `Monster`
 * object called `attacker`, a public method `RangedAttack()`, and overrides the `attack()`
 * method from the `Attack` interface
 *
 * @author  Anne Hansen
 * @version 1.0
 * @since   2024-04-20
 */
public class RangedAttack implements Attack {

    Monster attacker;
    /**
     * constructor `RangedAttack()` that defines `attacker`
     *
     * @param attacker a Monster object that inflicts damage
     * @since 2024-04-20
     */
    public RangedAttack(Monster attacker) {
        this.attacker = attacker;
    }

    /**
     * abstract method `attack()` that depletes the health of the `target`
     *
     * @param target a Monster object that takes damage
     * @return Integer
     * @since   2024-04-20
     */
    @Override
    public Integer attack(Monster target) {
        String message = attacker + " uses a ranged attack on " + target;
        System.out.println(message);
        return null;
    }
}
