import java.util.Random;

public class Problem37CaseSwitcher {
    public static void main(String[] args) {

        Random rand = new Random();

        char ch = (char)(rand.nextInt(26)+97);
        char low = 0;

        if (ch >= 'A' && ch <= 'Z') {

            low =  (char)(ch + 32);

        } else if (ch >= 'a' && ch <= 'z') {
            low = (char)(ch - 32);
        }

        System.out.println("" + ch + " -> " + low);


    }
}
