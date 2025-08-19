public class Problem40QuoteUppercase {
    public static void main(String[] args) {

        String phrase = "Fight the \"fairies\"!";

        System.out.println((phrase.substring(0, phrase.indexOf("\"")) + (phrase.substring(phrase.indexOf("\""), phrase.lastIndexOf("\"")).toUpperCase()) + (phrase.substring(phrase.lastIndexOf("\"")))));

    }
}
