public class Problem39AgeGroup {
    public static void main(String[] args) {

        int age = 55;

        if (age >= 0) {
            if (age <= 2) {
                System.out.println("Baby");
            } else if (age >= 3) {
                if (age <= 5) {
                    System.out.println("Toddler");
                } else if (age >= 6) {
                    if (age <= 12) {
                        System.out.println("Kid");
                    } else if (age >= 13) {
                        if (age <= 17) {
                            System.out.println("Teen");
                        } else {
                            System.out.println("Adult");
                        }
                    }
                }
            }
        }
    }
}

