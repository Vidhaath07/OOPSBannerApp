import java.util.HashMap;
import java.util.Map;

public class OOPSBannerAppUC8 {

    // Function to build pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> map) {

        int height = 5;

        for(int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for(char c : word.toCharArray()) {

                String[] pattern = map.get(c);

                line.append(pattern[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner("OOPS", patternMap);
    }
}