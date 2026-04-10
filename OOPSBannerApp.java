import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp - UC8
 * Uses HashMap to store character patterns and prints "OOPS"
 * using a fully modular and scalable approach.
 * 
 * @author Anupam
 * @version 8.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Get pattern map
        Map<Character, String[]> patternMap = getPatternMap();

        // Step 2: Word to print
        String word = "OOPS";

        // Step 3: Render banner
        printBanner(word, patternMap);
    }

    // 🔹 Create HashMap of patterns
    public static Map<Character, String[]> getPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        });

        map.put('P', new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        });

        map.put('S', new String[]{
            " ***** ",
            "*     *",
            "*      ",
            " ***** ",
            "      *",
            "*     *",
            " ***** "
        });

        return map;
    }

    // 🔹 Function to print banner
    public static void printBanner(String word, Map<Character, String[]> map) {

        // Outer loop → rows
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            // Inner loop → characters
            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]).append(" ");
                }
            }

            System.out.println(line);
        }
    }
}