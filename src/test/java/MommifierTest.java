import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MommifierTest {

    @Test
    void should_return_new_string_insert_mommy_when_number_of_vowels_more_than_30_percent_in_string() {

        Mommifier mommifier = new Mommifier();

        String vowelsMoreThan30Percent = "keep";

        String result = mommifier.convert(vowelsMoreThan30Percent);

        assertEquals("kemommyep", result);
    }

    @Test
    void should_return_itself_when_number_of_vowels_less_than_30_percent_in_string() {

        Mommifier mommifier = new Mommifier();

        String vowelsLessThan30Percent = "keepppp";

        String result = mommifier.convert(vowelsLessThan30Percent);

        assertEquals("keepppp", result);
    }

    @Test
    void should_return_itself_when_vowels_not_continuous_in_string() {

        Mommifier mommifier = new Mommifier();

        String vowelsLessThan30Percent = "keap";

        String result = mommifier.convert(vowelsLessThan30Percent);

        assertEquals("keap", result);
    }
}
