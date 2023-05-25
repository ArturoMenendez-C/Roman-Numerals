import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsGeneratorShould {
    @Test
    void convert_one_into_I(){
        int numberToConvert = 1;
        RomanNumerals romanNumerals = new RomanNumerals();

        String numberToRoman = romanNumerals.convert(numberToConvert);

        String roman = "I";
        assertEquals(roman,numberToRoman);
    }

    @Test
    void convert_two_into_II(){
        int numberToConvert = 2;
        RomanNumerals romanNumerals = new RomanNumerals();

        String numberToRoman = romanNumerals.convert(numberToConvert);

        String roman = "II";
        assertEquals(roman,numberToRoman);
    }
}
