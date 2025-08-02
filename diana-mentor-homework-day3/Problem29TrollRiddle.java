import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Problem29TrollRiddle {
    public static void main(String[] args) {

        Random rand = new Random();

        System.out.println("You are walking through a forest on a dark, stormy night to reach");
        System.out.println("the tall tower in time to save your brother from eating a poisonous");
        System.out.println("cookie. On the way, you stumble upon a giant ugly beast...");


        int possibility = rand.nextInt(0, 3);


        if (possibility == 0) {
            System.out.println("Upon seeing you, the troll demands that you answer");
            System.out.println("a riddle in order to pass. Left with no choice, you reluctantly agree.");
            System.out.println("\"Why is a raven like a writing desk?\"");
            System.out.println("Too bad for you, the riddle has no true answer, and you're left bereft.");
            System.out.println("Victorious and hungy, the troll eats you whole.");
        } else if (possibility == 1) {
            System.out.println("Upon seeing you, the troll demands that you answer");
            System.out.println("a riddle in order to pass. Left with no choice, you reluctantly agree.");
            System.out.println("\"What is yours, but is used by everyone but you?\"");
            System.out.println("You take a moment to think. \"My name.\"");
            System.out.println("Dissapointed, the troll lets you pass.");
        } else if (possibility == 2) {
            System.out.println("Luckily, the troll is asleep. Stealthily, you shuffle past him");
            System.out.println("and make your way to your brother.");
        }


    }
}
