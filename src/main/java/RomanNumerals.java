import java.util.Map;

public class RomanNumerals {
    private Map<Integer, String> uniques = Map.of(
            10, "X",
            5, "V",
            1, "I"
    );

    private Map<Integer, String> repeatables = Map.of(
            1, "I",
            10, "X"
    );


    public String convert(int decimal) {
        String roman = "";
        if(decimal >= 0) {
            roman = getRepeatedOf("I", decimal, 0);
        }
        if (decimal == 4) {
            roman = "IV";
        }
        if (decimal >= 5) {
            roman = "V" + getRepeatedOf("I", decimal, 5);
        }
        if (decimal == 9) {
            roman = "IX";
        }
        if (decimal >= 10) {
            roman = "X" + getRepeatedOf("I", decimal, 10);
        }
        if (decimal == 14) {
            roman = "XIV";
        }
        if (decimal >= 15) {
            roman = "XV" + getRepeatedOf("I", decimal, 15);
        }
        if (decimal == 19) {
            roman = "XIX";
        }
        if(decimal == 20) {
            roman = "XX";
        }
        return roman;
    }

    private static String getRepeatedOf(String roman, int numberToConvert, int startingNumber) {
        return roman.repeat(numberToConvert - startingNumber);
    }
}
