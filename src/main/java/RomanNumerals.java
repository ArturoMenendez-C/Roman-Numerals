public class RomanNumerals {
    public String convert(int numberToConvert) {
        String roman = "";

        if(numberToConvert == 12){
            roman = "X";
            numberToConvert -= 10;
        }
        if(numberToConvert == 11){
            roman = "X";
            numberToConvert -= 10;
        }
        if(numberToConvert == 10){
            roman = "X";
            numberToConvert -= 10;
        }
        if (numberToConvert >= 5) {
            roman = "V";
            numberToConvert -= 5;
        }
        if (numberToConvert <= 3) {
            roman += "I".repeat(numberToConvert);
        }
        return roman;
    }
}
