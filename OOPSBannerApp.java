public class OOPSBannerApp {

    // 🔹 Inner Static Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for pattern
        public String getLine(int row) {
            return pattern[row];
        }

        public char getCharacter() {
            return character;
        }
    }

    // 🔹 Utility method to create patterns
    public static CharacterPattern getOPattern() {
        return new CharacterPattern('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });
    }

    public static CharacterPattern getPPattern() {
        return new CharacterPattern('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });
    }

    public static CharacterPattern getSPattern() {
        return new CharacterPattern('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });
    }

    public static void main(String[] args) {

        // Array of objects
        CharacterPattern[] word = {
            getOPattern(),
            getOPattern(),
            getPPattern(),
            getSPattern()
        };

        // Build and print banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : word) {
                line.append(cp.getLine(i)).append(" ");
            }

            System.out.println(line);
        }
    }
}