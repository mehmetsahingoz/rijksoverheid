package nl.rijksoverheid.test.junit;

/**
 * Created by oscar on 30-6-15.
 */
public class Translator {

    private static final String[] WORDS_NL = {"fiets", "auto", "vliegtuig", "boot", "ruimteschip", "helicopter"};
    private static final String[] WORDS_EN = {"bike", "car", "airplane", "boat", "spaceship", "helicopter"};

    public String translateToEnglish(String dutchWord) {
        for (int i = 0; i < WORDS_NL.length; i++) {
            String word = WORDS_NL[i];
            if (word.equals(dutchWord)) {
                return WORDS_EN[i];
            }
        }
        return null;
    }

    public String translateToDutch(String englishWord) {
        for (int i = 0; i < WORDS_EN.length; i++) {
            String word = WORDS_EN[i];
            if (word.equals(englishWord)) {
                return WORDS_NL[i];
            }
        }
        return null;
    }
}
