import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Water_Bottle_Test {

    Water_Bottle bottle;

    @Before
    public void before() {
        bottle = new Water_Bottle(100);
    }

    @Test
    public void checkVolume() {
        assertEquals(100, bottle.checkVolume());
    }

    @Test
    public void takeDrink() {
        bottle.takeDrink();
        bottle.takeDrink();
        assertEquals(80, bottle.checkVolume());
    }

    @Test
    public void emptyVolume() {
        bottle.emptyBottle();
        assertEquals(0, bottle.checkVolume());
    }

    @Test
    public void fillBottle() {
        bottle.emptyBottle();
        bottle.fillBottle();
        assertEquals(100, bottle.checkVolume());
    }
}
