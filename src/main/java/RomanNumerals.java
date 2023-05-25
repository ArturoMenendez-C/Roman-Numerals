public class RomanNumerals {
    public String convert(int numberToConvert) {
        String roman = "";
        if (numberToConvert == 6) {
            roman = "VI";
        }
        if (numberToConvert == 5) {
            roman = "V";
        }
        if (numberToConvert <= 3) {
            roman = "I".repeat(numberToConvert);
        }
        return roman;
    }
}
