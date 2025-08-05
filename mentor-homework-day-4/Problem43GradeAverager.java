public class Problem43GradeAverager {
    public static void main(String[] args) {

        int grade1 = 85;
        int grade2 = 92;
        int grade3 = 77;
        int average = (grade1 + grade2 + grade3) / 3;

        if (average >= 0 && average <= 20) {
            System.out.println("Avg " + average + " -> F");
        } else if (average >= 20 && average < 40) {
            System.out.println("Avg " + average + " -> D");
        } else if (average >= 40 && average < 60) {
            System.out.println("Avg " + average + " -> C");
        } else if (average >= 60 && average < 80) {
            System.out.println("Avg " + average + " -> B");
        } else if (average >= 80 && average <= 100) {
            System.out.println("Avg " + average + " -> A");
        }

    }
}
