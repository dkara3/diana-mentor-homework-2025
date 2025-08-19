public class Problem25EmojiDetect {
    public static void main(String[] args) {

        String msg = "I will interrogate the cat ₍^. .^₎⟆";

        if (msg.contains("₍^. .^₎⟆")) {
            System.out.println("I found the cat");
        } else {
            System.out.println("Dean, where did the cat go?");
        }

    }
}
