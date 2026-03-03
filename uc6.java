public class uc6 {

    // Helper method to generate O pattern
    public static String[] generateO() {
        return new String[] {
            " OOOO ",
            " O  O ",
            " O  O ",
            " O  O ",
            " OOOO "
        };
    }

    // Helper method to generate P pattern
    public static String[] generateP() {
        return new String[] {
            " PPPP ",
            " P   P",
            " PPPP ",
            " P    ",
            " P    "
        };
    }

    // Helper method to generate S pattern
    public static String[] generateS() {
        return new String[] {
            " SSSS ",
            " S    ",
            " SSS  ",
            "    S ",
            " SSSS "
        };
    }

    public static void main(String[] args) {

        String[] O = generateO();
        String[] P = generateP();
        String[] S = generateS();

        // Loop-based rendering system
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}