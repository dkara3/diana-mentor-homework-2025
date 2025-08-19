public class Problem38FirstWord {
    public static void main(String[] args) {

        String phrase = "Dad's on a huntring trip, and he hasn't been home in a few days.";
        //for context: most quotes and phrases I use in programming referance hit TV Show "Supernatural" by CW

        System.out.println(phrase.substring(0, phrase.indexOf(" ")));

    }
}
