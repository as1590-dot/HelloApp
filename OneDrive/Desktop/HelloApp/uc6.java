public class uc6 {

    static String[] O = {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
    };

    static String[] P = {
            "***** ",
            "*    *",
            "*    *",
            "***** ",
            "*     ",
            "*     ",
            "*     "
    };

    static String[] S = {
            " ***** ",
            "*     ",
            "*     ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
    };

    public static void main(String[] args) {

        for (int i = 0; i < 7; i++) {
            System.out.print(O[i] + "  ");
            System.out.print(O[i] + "  ");
            System.out.print(P[i] + "  ");
            System.out.print(S[i]);
            System.out.println();
        }

    }
}