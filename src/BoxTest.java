import static org.junit.jupiter.api.Assertions.*;

/**
 * Box class method tests
 *
 * @author Bennett Fife
 * @version 10/18/23
 */

class BoxTest {

    @org.junit.jupiter.api.Test
    void setLength() {
        Box b = new Box(10.0, 22.0, 2.0);
        b.setLength(20.5);
        assertEquals(20.5, b.getLength());

        assertThrows(IllegalArgumentException.class,
                () -> b.setLength(-40.6));

    }

    @org.junit.jupiter.api.Test
    void getLength() {
        Box b = new Box(10.0, 22.0, 2.0);
        assertEquals(10.0, b.getLength());
    }

    @org.junit.jupiter.api.Test
    void setWidth() {
        Box b = new Box(10.0, 22.0, 2.0);
        b.setWidth(56.5);
        assertEquals(56.5, b.getWidth());

        assertThrows(IllegalArgumentException.class,
                () -> b.setLength(-65.6));
    }

    @org.junit.jupiter.api.Test
    void getWidth() {
        Box b = new Box(10.0, 22.0, 2.0);
        assertEquals(22.0, b.getWidth());
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        Box b = new Box(10.0, 22.0, 2.0);
        assertEquals(2.0, b.getHeight());
    }

    @org.junit.jupiter.api.Test
    void setHeight() {
        Box b = new Box(10.0, 22.0, 2.0);
        b.setHeight(54.2);
        assertEquals(54.2, b.getHeight());

        assertThrows(IllegalArgumentException.class,
                () -> b.setHeight(-77.1));
    }

    @org.junit.jupiter.api.Test
    void calcVolume() {
        Box b = new Box(10.0, 22.0, 2.0);
        assertEquals(440.0, b.calcVolume());
    }

    @org.junit.jupiter.api.Test
    void calcSurfaceArea() {
        Box b = new Box(10.0, 22.0, 2.0);
        assertEquals(568.0, b.calcSurfaceArea());
    }
}