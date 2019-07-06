package PersonCharacter;

import PersonCharacter.FightStyle.FightingStyle;
import PersonCharacter.Weapons.WeaponBehavior;

public class PersonCharacter {

    private int health;
    private int armor;
    private int magicResist;
    private int magicPoints;
    private int heightInInches;
    private int weight;
    private String playerDescription;
    private String playerFirstName;
    private String playerSirName;
    private String playerCatchPhrase;
    private WeaponBehavior weapon;
    private FightingStyle fightingStyle;

    public PersonCharacter(int health, int armor, int magicResist, int magicPoints, int heightInInches, int weight) {
        this.health = health;
        this.armor = armor;
        this.magicResist = magicResist;
        this.magicPoints = magicPoints;
        this.heightInInches = heightInInches;
        this.weight = weight;
    }

    public void performAttack(){
        fightingStyle.fightStyle();
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon){
        this.weapon = weapon;
    }

    public void setFightingStyle(FightingStyle fightingStyle){
        this.fightingStyle = fightingStyle;
    }

    public void fight(){
        System.out.println("Fought with nothing and no style....");
    }

    public int getMagicResist() {
        return magicResist;
    }

    public void setMagicResist(int magicResist) {
        this.magicResist = magicResist;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMagicPoints() {
        return magicPoints;
    }

    public void setMagicPoints(int magicPoints) {
        this.magicPoints = magicPoints;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getPlayerDescription() {
        return playerDescription;
    }

    public void setPlayerDescription(String playerDescription) {
        this.playerDescription = playerDescription;
    }

    public String getPlayerFirstName() {
        return playerFirstName;
    }

    public void setPlayerFirstName(String playerFirstName) {
        this.playerFirstName = playerFirstName;
    }

    public String getPlayerSirName() {
        return playerSirName;
    }

    public void setPlayerSirName(String playerSirName) {
        this.playerSirName = playerSirName;
    }

    public String getPlayerCatchPhrase() {
        return playerCatchPhrase;
    }

    public void setPlayerCatchPhrase(String playerCatchPhrase) {
        this.playerCatchPhrase = playerCatchPhrase;
    }

}
