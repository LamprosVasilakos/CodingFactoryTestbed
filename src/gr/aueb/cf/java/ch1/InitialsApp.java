package gr.aueb.cf.java.ch1;

/**
 * Εκτυπώνει τα αρχικά του ονόματος μου με κεφαλαία γράμματα,
 * με αστεράκια στη κονσολα.
 */

public class InitialsApp {
    public static void main(String[] args) {
        String initials = """
                        *               * * * * * *
                       * *              *           *
                      *   *             *           *
                     *     *            * * * * * *
                    *       *           * * * * * *
                   *         *          *           *
                  *           *         *           *
                 *             *        * * * * * *
                """;

        System.out.print(initials);
    }
}
