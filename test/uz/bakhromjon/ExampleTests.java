package uz.bakhromjon;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 05/10/22, Wed, 12:47
 **/
public class ExampleTests {
    @Test
    public void checkAValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean res = validator.checkISBN(0755502671);
        assertTrue(res);
    }

    @Test
    public void checkAnInValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean res = validator.checkISBN(0755502672);
        assertFalse(res);
    }

}
