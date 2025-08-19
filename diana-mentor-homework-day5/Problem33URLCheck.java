public class Problem33URLCheck {
    public static void main(String[] args) {

        String url = "https://supernatural.fandom.com/wiki/Supernatural_Wiki";

        if (url.contains("https://")) {
            System.out.println("URL is valid");
        } else  {
            System.out.println("URL is invalid");
        }

    }
}
