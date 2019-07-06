package PersonCharacter.Weapons;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Shots fired! *Thung!!* 7 points of damage!");
    }
}
