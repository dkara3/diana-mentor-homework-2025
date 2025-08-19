public class Problem26BetweenTags {
    public static void main(String[] args) {

        String html = "<b>BOLD</b>";

        System.out.println(html.substring(html.indexOf(">")+1, html.lastIndexOf("<")));

    }
}
