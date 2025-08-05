import java.util.Random;

public class Problem50PersonalHoroscope {
    public static void main(String[] args) {

        Random rand = new Random();

        String aries = "\"Start it. Break it. Blame Mercury later.\"";
        String taurus = "\"Comfort food won't solve it… but it won’t hurt either.";
        String gemini = "\"You're not being nosy, you're being thorough.\"";
        String cancer = "\"Your mood called. It wants a nap.\"";
        String leo = "\"Yes, everyone noticed. You can stop pretending to be humble now.\"";
        String virgo = "\"The list you made for today? It now has a list.\"";
        String libra = "\"Flip a coin. Heads: you still won’t decide.\"";
        String scorpio = "\"Keep your secrets… but stop glaring while doing it.\"";
        String saggittarius = "\"Your next wild idea? Say it out loud — we dare you.\"";
        String capricorn = "\"Take a break. No, a real one. Put the spreadsheet down.\"";
        String aquarius = "\"You're not weird — you're trend-setting early.\"";
        String pisces = "\"Dream big. Then maybe wake up and write it down.\"";

        int sign = rand.nextInt(0, 12);

        switch (sign) {
            case 0:
                System.out.println(aries);
                break;
            case 1:
                System.out.println(taurus);
                break;
            case 2:
                System.out.println(gemini);
                break;
            case 3:
                System.out.println(cancer);
                break;
            case 4:
                System.out.println(leo);
                break;
            case 5:
                System.out.println(virgo);
                break;
            case 6:
                System.out.println(libra);
                break;
            case 7:
                System.out.println(scorpio);
                break;
            case 8:
                System.out.println(saggittarius);
                break;
            case 9:
                System.out.println(capricorn);
                break;
            case 10:
                System.out.println(aquarius);
                break;
            case 11:
                System.out.println(pisces);
                break;
        }

    }
}
