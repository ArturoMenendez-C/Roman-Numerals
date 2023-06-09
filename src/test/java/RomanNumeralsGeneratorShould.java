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
//            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "8, VIII",
//            "9, IX",
            "10, X",
            "11, XI",
            "12, XII",
            "13, XIII",
//            "14, XIV",
            "15, XV",
            "16, XVI",
            "17, XVII",
            "18, XVIII",
//            "19, XIX",
            "20, XX",
            "40, XL",
    })
    void convert_number_into_roman(int numberToConvert, String roman){
        RomanNumerals romanNumerals = new RomanNumerals();

        String numberToRoman = romanNumerals.convert(numberToConvert);

        assertEquals(roman, numberToRoman);
    }
}
