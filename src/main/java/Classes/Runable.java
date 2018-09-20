package Classes;

import java.util.Scanner;

public class Runable {




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
                int number = Integer.parseInt(input);
                System.out.println(converter.generate(number));
            }

        }
    }

}
