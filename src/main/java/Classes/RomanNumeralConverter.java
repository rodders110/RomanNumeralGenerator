package Classes;

import Enums.Numerals;
import Interfaces.RomanNumeralGenerator;




public class RomanNumeralConverter implements RomanNumeralGenerator {

    String answer = "";

    public String generate(int number) {
        if (number > 0 && number < 4000) {
            for (Numerals digit : Numerals.values()) {
                int times = number / digit.getValue();
                if (times != 0) {

                    number = number - (digit.getValue() * times);

                    while(times != 0){
                        answer += digit.getNumeral();
                        times--;
                    }

                }
            }

            return answer;
        }
        return "Incorrect input. Only enter 1 - 3999.";
    }

}
