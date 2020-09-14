import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MommifierTest {

    @Test
    void should_return_new_string_insert_mommy_when_number_of_vowels_more_than_30_percent() {

        Mommifier mommifer = new Mommifier();

        String vowelsMoreThan30Percent = "keep";

        String result = mommifer.convert(vowelsMoreThan30Percent);

        assertEquals("kemommyep", result);
    }
}
