public class RomanNumerals {
    public String convert(int numberToConvert) {
        String roman = "";

        for (NumeralToRoman decimalToRoman : NumeralToRoman.values()) {
            if(numberToConvert >= decimalToRoman.decimal){
                roman += decimalToRoman.roman;
                numberToConvert -= decimalToRoman.decimal;
            }
        }

//        if (numberToConvert >= NumeralToRoman.TEN.decimal) {
//            roman += NumeralToRoman.TEN.roman;
//            numberToConvert -= NumeralToRoman.TEN.decimal;
//        }
//        if (numberToConvert >= NumeralToRoman.FIVE.decimal) {
//            roman += NumeralToRoman.FIVE.roman;
//            numberToConvert -= NumeralToRoman.FIVE.decimal;
//        }
//
//        while (numberToConvert >= NumeralToRoman.ONE.decimal) {
//            roman += NumeralToRoman.ONE.roman;
//            numberToConvert -= NumeralToRoman.ONE.decimal;
//        }

        return roman;
}

enum NumeralToRoman {
    TEN(10, "X"),
    FIVE(5, "V"),
    ONE(1, "I");

    private final int decimal;
    private final String roman;

    NumeralToRoman(int decimal, String roman) {
        this.decimal = decimal;

        this.roman = roman;
    }
}
}
