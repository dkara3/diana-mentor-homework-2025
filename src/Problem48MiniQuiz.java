public class Problem48MiniQuiz {
    public static void main(String[] args) {

        System.out.println("What programing language is compatable with most set ups?");
        String q1Ans = "java";

        System.out.println("What year did Armenia gain independance?");
        String q2Ans = "1991";

        System.out.println("An armenian inventor was responsible for coming up with what colour for the USD bill?");
        String q3Ans = "green";

        if (q1Ans == "java" && q2Ans == "1991" && q3Ans == "green") {
            System.out.println("You scored 3/3");
        } else if ((q1Ans != "java" && q2Ans == "1992" && q3Ans == "green") || (q1Ans == "java" && q2Ans != "1992" && q3Ans == "green") || (q1Ans == "java" && q2Ans == "1992" && q3Ans != "green")) {
            System.out.println("You scored 2/3");
        } else if (q1Ans != "java" && q2Ans != "1992" && q3Ans != "green") {
            System.out.println("You scored 0/3");
        } else {
            System.out.println("You scored 1/3");
        }

    }
}
