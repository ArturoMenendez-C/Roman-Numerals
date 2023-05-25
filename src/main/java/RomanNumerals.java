public class RomanNumerals {
    public String convert(int numberToConvert) {
        if(numberToConvert == 1) {
            return "I";
        }
        if(numberToConvert == 2) {
            return "II";
        }
        return null;
    }
}
