public class Problem8SymbolCheck {
    public static void main(String[] args) {

        String email = "[a@b.com](mailto:a@b.com)";
        boolean at = false;
        boolean period = false;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                at = true;
            }
            if (email.charAt(i) == '.') {
                period = true;
            }
        }

        if (at == true && period == true) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

}

