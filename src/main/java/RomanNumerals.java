public class RomanNumerals {
    public String convert(int numberToConvert) {
        String roman = "I".repeat(numberToConvert);
        if(numberToConvert == 4){
            roman = "IV";
        }
        if(numberToConvert == 5){
            roman = "V";
        }
        return roman;
    }
}
