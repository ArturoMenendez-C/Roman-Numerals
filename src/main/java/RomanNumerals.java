public class RomanNumerals {
    public String convert(int numberToConvert) {
        String roman = "I".repeat(numberToConvert);
        if(numberToConvert == 4){
            roman = "IV";
        }
        if(numberToConvert >= 5){
            roman = "V" + "I".repeat(numberToConvert-5);
        }
        if(numberToConvert == 9){
            roman = "IX";
        }
        return roman;
    }
}
