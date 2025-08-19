public class Problem46PasswordStrength {
    public static void main(String[] args) {

        String password = "mjcodso!";

        if (password.length() >= 8 && password.contains("!")) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }

    }
}
