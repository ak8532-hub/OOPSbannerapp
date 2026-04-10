public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline initialization + String.join()
        String[] banner = {
            String.join(" ", " ***** ", " ***** ", " ****** ", " ***** "),
            String.join(" ", "*     *", "*     *", "*     *", "*     *"),
            String.join(" ", "*     *", "*     *", "*     *", "*"),
            String.join(" ", "*     *", "*     *", "******", " ***** "),
            String.join(" ", "*     *", "*     *", "*", "      *"),
            String.join(" ", "*     *", "*     *", "*", "*     *"),
            String.join(" ", " ***** ", " ***** ", "*", " ***** ")
        };

        // Loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}