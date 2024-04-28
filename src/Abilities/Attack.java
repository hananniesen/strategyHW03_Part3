package Abilities;


import Monsters.Monster;

/**
 * The `Attack` interface extends the `Ability` tagging interface, and contains the public
 * abstract method `attack()`
 *
 * @author  Anne Hansen
 * @version 1.0
 * @since   2024-04-20
 */
public interface Attack extends Ability {
    /**
     * abstract method `attack()` that depletes the health of the `target`
     *
     * @param target a Monster object that takes damage
     * @return Integer
     * @since   2024-04-20
     */
    public abstract Integer attack(Monster target);

}
