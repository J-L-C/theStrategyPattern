package PersonCharacter.Weapons;

public class StaffBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("*Thwack!* That will reach you.... 11 points of damage!");
    }
}
