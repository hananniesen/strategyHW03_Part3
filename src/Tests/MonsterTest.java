package Tests;


import Monsters.Imp;
import Monsters.Kobold;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class MonsterTest {
    Imp imp1;
    Imp imp2;
    Imp imp3;
    Imp imp4;
    Kobold kobold1;
    Kobold kobold2;
    Kobold kobold3;
    Kobold kobold4;

    HashMap<String, Integer> items;
    HashMap<String, Integer> items1;
    HashMap<String, Integer> items2;

    Integer hp = 5;
    Integer maxHP = 10;
    Integer xp = 10;
    String sword = "Sword";
    Integer one = 1;
    String gold = "Gold";
    Integer five = 5;
    String silver = "Silver";
    Integer four = 4;
    String arrow = "Arrow";
    Integer three = 3;

    @BeforeEach
    void setUp(){
        //constructor test
        imp1 = null;
        assertNull(imp1);
        imp1 = new Imp(10, 10, items);
        assertNotNull(imp1);

        kobold1 = null;
        assertNull(kobold1);
        kobold1 = new Kobold(10, 10, items);

        //field setting and getter test
        items1 = new HashMap<>();
        items1.put(sword, one);
        items1.put(gold, five);
        imp2 = new Imp(maxHP, xp, items1);
        kobold2 = new Kobold(maxHP, xp, items1);

        //equality test
        imp3 = new Imp(15, 15, items);
        imp4 = new Imp(15, 15, items);
        kobold3 = new Kobold(15, 15, items);
        kobold4 = new Kobold(15,15, items);

        //setters test
        Integer hp = 5;
        items2 = new HashMap<>();
        String silver = "Silver";
        Integer four = 4;
        String arrow = "Arrow";
        Integer three = 3;
    }
    @AfterEach
    void tearDown() {
        imp1 = null;
        imp2 = null;
        imp3 = null;
        imp4 = null;
        kobold1 = null;
        kobold2 = null;
        kobold3 = null;
        kobold4 = null;
        items = null;
        items1 = null;
        items2 = null;
    }

    // GETTERS AND SETTERS --------------------------------------------------------------------------------
    @Test
    void getHpImp() {
        assertEquals(maxHP, imp2.getHp());            //field setting and getter test
        assertNotEquals(imp2.getHp(), imp3.getHp());  //equality test
    }

    @Test
    void getMaxHPImp() {
        assertEquals(maxHP, imp2.getMaxHP());               //field setting and getter test
        assertNotEquals(imp2.getMaxHP(), imp3.getMaxHP());  //equality test
    }

    @Test
    void getXpImp() {
        assertEquals(xp, imp2.getXp());               //field setting and getter test
        assertNotEquals(imp2.getXp(), imp3.getXp());  //equality test
    }

    @Test
    void getItemsImp() {
        assertEquals(items1, imp2.getItems());              //field setting and getter test
        assertNotEquals(imp2.getItems(), imp3.getItems());  //equality test
    }

    @Test
    void getHpKob() {
        assertEquals(maxHP, kobold2.getHp());            //field setting and getter test
        assertNotEquals(kobold2.getHp(), kobold3.getHp());  //equality test
    }

    @Test
    void getMaxHPKob() {
        assertEquals(maxHP, kobold2.getMaxHP());               //field setting and getter test
        assertNotEquals(kobold2.getMaxHP(), kobold3.getMaxHP());  //equality test
    }

    @Test
    void getXpKob() {
        assertEquals(xp, kobold2.getXp());               //field setting and getter test
        assertNotEquals(kobold2.getXp(), kobold3.getXp());  //equality test
    }

    @Test
    void getItemsKob() {
        assertEquals(items1, kobold2.getItems());              //field setting and getter test
        assertNotEquals(kobold2.getItems(), kobold3.getItems());  //equality test
    }
}