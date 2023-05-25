public class RomanNumerals {
    public String convert(int numberToConvert) {
        if(numberToConvert == 4){
            return "IV";
        }
        return "I".repeat(numberToConvert);
    }
}
