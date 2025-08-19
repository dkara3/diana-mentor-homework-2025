import java.util.Random;

public class Problem46FortuneCookie {
    public static void main(String[] args) {

        Random rand = new Random();

        String fortune1 = "You will find peace in what is causing you worry.";
        String fortune2 = "Fate won't be kind to you.";
        String fortune3 = "Love is just around the corner.";
        String fortune4 = "The friends you have now will carry you to your next life.";
        String fortune5 = "Beware, danger lurks on by.";
        String fortune6 = "An adventure awaits you. Allons-y!";

        int fortune = rand.nextInt(0, 6);
        int luckyNum = rand.nextInt(0, 100);

        switch (fortune) {
            case 0:
                System.out.println(fortune1 + " Lucky # " + luckyNum);
                break;
            case 1:
                System.out.println(fortune2 + " Lucky # " + luckyNum);
                break;
            case 2:
                System.out.println(fortune3 + " Lucky # " + luckyNum);
                break;
            case 3:
                System.out.println(fortune4 + " Lucky # " + luckyNum);
                break;
            case 4:
                System.out.println(fortune5 + " Lucky # " + luckyNum);
                break;
            case 5:
                System.out.println(fortune6 + " Lucky # " + luckyNum);
                break;
        }


    }
}
