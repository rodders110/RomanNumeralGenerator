package Classes;

import Enums.Numerals;
import Interfaces.RomanNumeralGenerator;

import java.util.Scanner;


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


    public static void main(String[] args) {

        Boolean stop = false;
        Scanner scanner = new Scanner(System.in);


        while (stop != true) {
            System.out.println("Please Enter a number between 1 - 3999 or stop to exit ");
            String input = scanner.nextLine();

            if (input.equals("stop")){
                stop = true;
            } else {
                RomanNumeralConverter converter = new RomanNumeralConverter();
                int number = 0;

                try {
                    number = Integer.parseInt(input);
                } catch(NumberFormatException e){
                    e.getStackTrace();
                } finally {
                    System.out.println(converter.generate(number));
                }


            }

        }
    }

}
