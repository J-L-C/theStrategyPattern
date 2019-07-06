import PersonCharacter.FightStyle.CoffeeStyle;
import PersonCharacter.FightStyle.AirplaneStyle;
import PersonCharacter.PersonCharacter;
import PersonCharacter.Weapons.BowAndArrowBehavior;
import PersonCharacter.Weapons.WandBehavior;

public class Application {

    public static void main(String[] args){
        PersonCharacter character = new PersonCharacter(25, 10, 5, 10, 80,190);
        character.setWeapon(new WandBehavior());
        character.setFightingStyle(new CoffeeStyle());
        character.performAttack();
        character.setWeapon(new BowAndArrowBehavior());
        character.setFightingStyle(new AirplaneStyle());
        character.performAttack();
    }
}
