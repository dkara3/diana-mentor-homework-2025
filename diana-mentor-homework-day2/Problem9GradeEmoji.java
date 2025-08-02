public class Problem9GradeEmoji {
    public static void main(String[] args) {

        String grade = "F";

        if (grade == "A" || grade == "B") {
            System.out.println(":D");
        }
        if (grade == "C" || grade == "D") {
            System.out.println(":)");
        }
        if (grade == "F") {
            System.out.println(":(");
        } else {
            System.out.println("Please insert a grade between A and F, write in ALL CAPS");
        }

    }
}
