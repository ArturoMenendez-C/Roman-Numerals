public class RomanNumerals {
    public String convert(int numberToConvert) {
        String roman = "I".repeat(numberToConvert);
        if(numberToConvert == 4){
            roman = "IV";
        }
        if(numberToConvert == 5){
            roman = "V";
        }
        if(numberToConvert == 6){
            roman = "VI";
        }
        if(numberToConvert == 7){
            roman = "VII";
        }
        if(numberToConvert == 8){
            roman = "VIII";
        }
        return roman;
    }
}
