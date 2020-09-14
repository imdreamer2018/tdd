import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mommifier {


    public String convert(String string) {

        StringBuilder stringBuilder = new StringBuilder(string);

        int vowelsCount = 0;
        int vowelsBegin = 0;

        for (int i = 0; i < stringBuilder.length(); i++) {
            if (judgeIsContinuousVowel(stringBuilder, vowelsBegin, i)) {
                vowelsCount++;
            } else {
                vowelsCount = 0;
                vowelsBegin = i + 1;
            }
            if (vowelsCount * 10 > stringBuilder.length() * 3) {
                return stringBuilder.insert(vowelsBegin + 1, "mommy").toString();
            }
        }
        return string;
    }

    private boolean judgeIsContinuousVowel(StringBuilder stringBuilder, int markCharacterIndex, int currentCharacterIndex) {

        List<String> vowelsList = Arrays.asList("a","e","i","o","u");
        String markCharacter = String.valueOf(stringBuilder.charAt(markCharacterIndex));
        String currentCharacter = String.valueOf(stringBuilder.charAt(currentCharacterIndex));

        return vowelsList.contains(markCharacter) && markCharacter.equals(currentCharacter);
    }
}
