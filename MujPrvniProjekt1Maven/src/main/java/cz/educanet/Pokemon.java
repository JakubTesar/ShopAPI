package cz.educanet;

public class Pokemon {
    private int number;
    private String name;
    private String type1;
    private String type2;
    private int total;
    private int hP;
    private int attack;
    private int defense;
    private int specialAttack;
    private int specialDefense;
    private int speed;
    private int generation;
    private boolean legendary;

    public Pokemon(int number, String name, String type1, String type2, int total, int hP,
                   int attack, int defense, int specialAttack, int specialDefense,
                   int speed, int generation, boolean legendary) {
        this.number = number;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hP = hP;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getType1() {
        return type1;
    }

    public String getType2() {
        return type2;
    }

    public int getTotal() {
        return total;
    }

    public int gethP() {
        return hP;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public int getSpecialDefense() {
        return specialDefense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getGeneration() {
        return generation;
    }

    public boolean getLegendary() {
        return legendary;
    }
}
