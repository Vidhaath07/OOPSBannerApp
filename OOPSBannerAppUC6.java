public class OOPSBannerAppUC6 {

    // Static function to generate O pattern
    public static String[] printO() {
        return new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Static function to generate P pattern
    public static String[] printP() {
        return new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };
    }

    // Static function to generate S pattern
    public static String[] printS() {
        return new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {

        String[] O = printO();
        String[] P = printP();
        String[] S = printS();

        // Loop to print banner line by line
        for(int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}