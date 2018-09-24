Roman Numeral Generator.

For this little project I first worked out Roman Numerals from arabic numerals on paper.

I then listed the process I used to work out the Roman Numerals Manually and compared it to alogorithims I had found online.

I then wrote some unit tests to include simple numers and intentional wrong inputs so that the error I would write in the method
would display, also included were some deductive roman numerals such as XC for 90 and CM for 900 which could cause the method some issues.

I then proceeded to write the code using the most efficient alogirthium I could come up with. This was to create an Enum with all the
base Roman Numeral Elements and also the subtractive cases and added methods to return the numerals and their values.

I then wrote the interface class and included the Generate method that I would be using later.

I then wrote the RomanNumeralConverter method which implements the RomanNumeralGenerator interface;

I them proceeded to write the Generate method.

First I put in a condition to check if the number being inputted was within the range of 1 - 3999.

Numbers that passed that condition would then be passed into a loop which goes through each Roman Numeral in the Enum in turn
and checks to see if the number is divisable by the value of that Numeral.

If it is i.e the return value you get when the
number is divided by the numeral value is not 0 then the return value is subtracted from the number.

The return value is then passed into a loop which will add the numeral to an output string a number of times depening on
the return value. If the return value is 1 then it will add the numeral once, and twice if the return value was two and so on.

Once all the Numerals in the Enum have been iterated through the return string is then returned.

Any number which do not pass the first condition will skip the loop and just return an error message.



I then ran the unit tests against the RomanNumeralGenerator method and made adjustments the Numerals Enum removing some deductive Numerals that were causing errors
until all the tests passed. I then added some additional tests just to make sure I have covered as many scenarios as I could think of.


Once I was satisfied that the RomanNumeralGenerator was working correctly I then proceeded to write the main method.

This is where I would create the output to prompt the user to enter their chosen number or the word stop to end the program.

I then intialised Scanner to take in the users input, this is then checked for the "stop" word. If this is not present then
the method attempts to parse the users input into an Integer and pass it to the number varable. This number variable is
then passed to the Generate method.

If the Main method is unable to parse the input into a integer, then the default Number variable value of 0 is passed
to the Generate Method which will trigger the error method letting the user know that they have made an incorret entry.

Once the return string or error message is displayed. The user will then see the prompt to enter input again. Only once
the user has entered "stop" will the program come to an end.

