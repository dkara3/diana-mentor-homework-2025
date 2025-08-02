public class Problem31GradeLetter {
    public static void main(String[] args) {

        int number = 55;

        if (number >= 0) {
            if (number <= 20) {
                System.out.println("F");
            } else if (number >= 21) {
                if (number <= 40) {
                    System.out.println("D");
                } else if (number >= 41) {
                    if (number <= 60) {
                        System.out.println("C");
                    } else if (number >= 61) {
                        if (number <= 80) {
                            System.out.println("B");
                        } else if (number >= 81) {
                            if (number <= 100) {
                                System.out.println("A");

                            }
                        }
                    }
                }
            }
        }
    }
}
