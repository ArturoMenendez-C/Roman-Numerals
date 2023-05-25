public class RomanNumerals {
    public String convert(int numberToConvert) {
        if(numberToConvert == 5){
            return "V";
        }
        return "I".repeat(numberToConvert);
    }
}
