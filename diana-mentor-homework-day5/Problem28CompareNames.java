public class Problem28CompareNames {
    public static void main(String[] args) {

        String a = "HOFBrINCl";
        String b = "HOFBrINCL";

        if (a.equalsIgnoreCase(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

    }
}
