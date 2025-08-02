import java.util.Random;

public class Problem10WizardSpell {
    public static void main(String[] args) {

        Random rand = new Random();

        int spell = rand.nextInt(0, 9);

        if (spell % 2 == 0) {
            System.out.println("Spell Fizzles");
        } else {
            System.out.println("Spell Suceeds");
        }

    }
}
