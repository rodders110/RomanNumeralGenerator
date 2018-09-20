import Classes.RomanNumeralConverter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratorTest {

    RomanNumeralConverter converter;

    @Before
    public void before(){
        converter = new RomanNumeralConverter();

    }

    @Test
    public void canReturnStringXXIV(){
        assertEquals("XXIV", converter.generate(24));
    }

    @Test
    public void canReturnStringCMXCIX(){
        assertEquals("CMXCIX", converter.generate(999));
    }

    @Test
    public void canReturnStringCCCXXVII(){
        assertEquals("CCCXXVII", converter.generate(327));
    }

    @Test
    public void canReturnStringMMMD(){
        assertEquals("MMMD", converter.generate(3500));
    }

    @Test
    public void canReturnStringMMMDCCCXXVII(){
        assertEquals("MMMDCCCXXVII", converter.generate(3827));
    }

    @Test
    public void canIgnoreWrongInput(){
        assertEquals("Incorrect input. Only enter 1 - 3999.", converter.generate(4000));
    }

    @Test
    public void canReturnString(){
        assertEquals("CXC", converter.generate(190));
    }
}
