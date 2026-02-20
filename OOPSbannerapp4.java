public class OOPSbannerapp4{
	public static void main(String[] args) {
		// Step 1: Create a String array to store banner lines
        String[] bannerLines = new String[7];
		// Step 2: Populate the array using String.join()
        bannerLines[0] = String.join(" ",
                "  ***  ", "  ***  ", " ****  ", " ****  ");
		bannerLines[1] = String.join(" ",
                " *   * ", " *   * ", " *   * ", " *     ");
		bannerLines[2] = String.join(" ",
                "*     *", "*     *", " *   * ", "  ***  ");
		bannerLines[3] = String.join(" ",
                "*     *", "*     *", " ****  ", "     * ");
		bannerLines[4] = String.join(" ",
                "*     *", "*     *", " *     ", "      *");
		bannerLines[5] = String.join(" ",
                " *   * ", " *   * ", " *     ", " *    *");
		bannerLines[6] = String.join(" ",
                "  ***  ", "  ***  ", " *     ", "  **** ");
		// Step 3: Use loop to print banner
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}