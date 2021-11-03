package bean;

public class Hero {
    private String name;
    private int mana;
    private int strength;
    private int agility;
    private int dexterity;
    private int money;
    private int experience;

    public Hero(String[] args) {
        this(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]),
                Integer.parseInt(args[4]), Integer.parseInt(args[5]), Integer.parseInt(args[6]));
    }

    public Hero(String name, int mana, int strength, int agility, int dexterity, int money, int experience) {
        this.name = name;
        this.mana = mana;
        this.strength = strength;
        this.agility = agility;
        this.dexterity = dexterity;
        this.money = money;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getMana() {
        return mana;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getMoney() {
        return money;
    }

    public int getExperience() {
        return experience;
    }
}
