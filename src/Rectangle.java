/**
 * Class represents a rectangle with
 * short and long sides value,
 * and provide functional to calculate
 * perimeter and diagonal values of it.
 *
 * @author Andrii Shchavinskyi
 * @version 1.0
 */
public class Rectangle {

    // sides value
    private int longSideLength;
    private int shortSideLength;

    public Rectangle(int longSideLength, int shortSideLength) throws IllegalArgumentException {
        if (longSideLength < 1 || shortSideLength < 1) {
            throw new IllegalArgumentException("Wrong sides length values!");
        }
        this.longSideLength = longSideLength;
        this.shortSideLength = shortSideLength;
    }

    /**
     * Calculates perimeter of rectangle.
     *
     * @return integer value of perimeter
     */
    public int getPerimeterValue() {
        return (longSideLength * 2) + (shortSideLength * 2);
    }

    /**
     * Calculates diagonal length of rectangle.
     *
     * @return double value of diagonal length
     */
    public double getDiagonalLength() {
        return Math.sqrt((longSideLength * longSideLength) + (shortSideLength * shortSideLength));
    }

    public int getLongSideLength() {
        return longSideLength;
    }

    public void setLongSideLength(int longSideLength) {
        if (longSideLength < 1) {
            throw new IllegalArgumentException("Side can't be with negative length value!");
        }
        this.longSideLength = longSideLength;
    }

    public int getShortSideLength() {
        return shortSideLength;
    }

    public void setShortSideLength(int shortSideLength) {
        if (shortSideLength < 1) {
            throw new IllegalArgumentException("Side can't be with negative length value!");
        }
        this.shortSideLength = shortSideLength;
    }
}
