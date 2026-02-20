public class OOPSbannerapp5{

    public static void main(String[] args) {

        // Inline declaration and initialization of String array
        String[] bannerLines = {
            String.join(" ", "   ***  ", "   ***  ", " ****  ", " ****  "),
            String.join(" ", " **   ** ", " *   * ", " *   * ", " *     "),
            String.join(" ", "**     **", "*     *", " *   * ", "  ***  "),
            String.join(" ", "**     **", "*     *", " ****  ", "     * "),
            String.join(" ", "**     **", "*     *", " *     ", "      *"),
            String.join(" ", " **   ** ", " *   * ", " *     ", " *    *"),
            String.join(" ", "   ***  ", "   ***  ", " *     ", "  **** ")
        };

        // Loop to print the banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}