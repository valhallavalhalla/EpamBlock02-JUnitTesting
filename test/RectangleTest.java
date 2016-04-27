import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrii on 28.04.16.
 */
public class RectangleTest {

    public static final double ACCURACY = 1e-10;

    @Test
    public void testGetPerimeterValue() throws Exception {
        Rectangle rectangle = new Rectangle(5, 10);
        int perimeterValue = rectangle.getPerimeterValue();
        assertEquals("Perimeter : ", 30, perimeterValue);
    }

    @Test
    public void testGetDiagonalLength() throws Exception {
        Rectangle rectangle = new Rectangle(10, 20);
        double diagonalLength = rectangle.getDiagonalLength();
        assertEquals("Diagonal has length : ", Math.sqrt(500), diagonalLength, ACCURACY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWrongSidesValues() {
        Rectangle rectangle = new Rectangle(-3, -50);
    }

}