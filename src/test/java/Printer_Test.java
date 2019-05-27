import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Printer_Test {

    Printer printer;
    Printer printer2;

    @Before
    public void before(){
        printer = new Printer(150, 10);
        printer2 = new Printer(6, 10);
    }

    @Test
    public void checkSheets(){
        assertEquals(150, printer.checkSheets());
    }

    @Test
    public void printThis(){
        printer2.printThis(5, 1);
        assertEquals(1, printer2.checkSheets());
        assertEquals(5, printer2.checkToner());
    }


}
