import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsGeneratorShould {
    
    @ParameterizedTest
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "5, V",
    })
    void convert_number_into_roman(int numberToConvert, String roman){
        RomanNumerals romanNumerals = new RomanNumerals();

        String numberToRoman = romanNumerals.convert(numberToConvert);

        assertEquals(roman, numberToRoman);
    }
}
