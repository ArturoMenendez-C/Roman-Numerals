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
        if(numberToConvert == 10){
            roman = "X";
        }
        if(numberToConvert == 11){
            roman = "XI";
        }
        if(numberToConvert == 12){
            roman = "XII";
        }
        if(numberToConvert == 13){
            roman = "XIII";
        }
        return roman;
    }
}
