public class Problem40NestedCondition {
    public static void main(String[] args) {

        int age = 18;

        if (age < 13) {
            System.out.println("Child");
        }
        if (age >= 13 && age < 18) {
            System.out.println("Student");
        }
        if (age >= 18) {
            System.out.println("Adult");
        }

    }
}
