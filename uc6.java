package UCs;

public class uc6 {

    // Letter O (9 characters wide)
    public static String[] getO() {
        return new String[] {
            "  ****** ",
            " **    **",
            " **    **",
            " **    **",
            " **    **",
            " **    **",
            "  ****** "
        };
    }

    // Letter P (9 characters wide)
    public static String[] getP() {
        return new String[] {
            " ******  ",
            " **    **",
            " **    **",
            " ******  ",
            " **       ",
            " **       ",
            " **       "
        };
    }

    // Letter S (9 characters wide)
    public static String[] getS() {
        return new String[] {
            "  ****** ",
            " **      ",
            " **      ",
            "  *****  ",
            "      ** ",
            "      ** ",
            " ******  "
        };
    }

    public static void main(String[] args) {

        String[] o1 = getO();
        String[] o2 = getO();
        String[] p  = getP();
        String[] s  = getS();

        for (int i = 0; i < o1.length; i++) {
            System.out.println(o1[i] + "  " + o2[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}