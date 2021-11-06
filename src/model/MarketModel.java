package model;

import bean.*;
import factory.ArmorFactory;
import factory.PotionFactory;
import factory.SpellFactory;
import factory.WeaponFactory;

import java.util.ArrayList;
import java.util.List;

public class MarketModel {
    private List<Armor> armorList;
    private List<Weapon> weaponList;
    private List<Potion> potionList;
    private List<Spell> spellList;

    public MarketModel() {
        armorList = new ArmorFactory().randomChoose(5);
        weaponList = new WeaponFactory().randomChoose(5);
        potionList = new PotionFactory().randomChoose(3);
        spellList = new SpellFactory().randomChoose(1);
    }

    public List<Armor> getArmorList() {
        return armorList;
    }

    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public List<Potion> getPotionList() {
        return potionList;
    }

    public List<Spell> getSpellList() {
        return spellList;
    }

    public void buy(List items,int index) {
        items.remove(index);
    }
}
