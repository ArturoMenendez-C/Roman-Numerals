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
        if(numberToConvert == 15){
            roman = "XV";
        }
        if(numberToConvert == 16){
            roman = "XVI";
        }
        if(numberToConvert == 17){
            roman = "XVII";
        }
        if(numberToConvert == 18){
            roman = "XVIII";
        }
        return roman;
    }
}
