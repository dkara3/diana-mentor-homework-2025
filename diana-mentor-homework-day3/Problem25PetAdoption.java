import java.util.Random;

public class Problem25PetAdoption {
    public static void main(String[] args) {

        Random rand = new Random();

        String[] animal = {"dog", "cat", "rabbit"};

        String animalName = animal[rand.nextInt(animal.length)];

        System.out.println(animalName);

        if (animalName == "rabbit") {
            System.out.println("Hop home!");
        }

    }
}
