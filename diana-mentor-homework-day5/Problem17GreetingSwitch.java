public class Problem17GreetingSwitch {
    public static void main(String[] args) {

        String lang = "fr";

        System.out.println("Language is: " + lang);

        if (lang.equals("fr")) {
            System.out.println("Bonjour");
        }
        if (lang.equals("en")) {
            System.out.println("Hello");
        }
        if (lang.equals("es")) {
            System.out.println("Hola");
        }

    }
}
