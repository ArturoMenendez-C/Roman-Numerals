import java.util.Map;

public class RomanNumerals {

    public String convert(int decimal) {
        String roman = "";

        if(decimal >= 1){
            roman = "I" + convert(decimal-1);
        }
        if(decimal >= 5){
            roman = "V" + convert( decimal-5);
        }
        if(decimal >= 10){
            roman = "X" + convert(decimal-10);
        }
        if(decimal >= 50){
            roman = "L" + convert(decimal-50);
        }
        return roman;
    }

}
