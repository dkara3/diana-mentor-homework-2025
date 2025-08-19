public class Problem12ContainsSecret {
    public static void main(String[] args) {

        String text = "It's no secret that the government is after us!";
        String lowercase = text.toLowerCase();


        System.out.println(text.contains("secret"));

    }
}
