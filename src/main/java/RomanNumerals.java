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
        if(numberToConvert >= 10){
            roman = "X" + "I".repeat(numberToConvert-10);
        }
        if(numberToConvert == 14){
            roman = "XIV";
        }
        if(numberToConvert >= 15){
            roman = "XV" + "I".repeat(numberToConvert-15);
        }

        return roman;
    }
}
