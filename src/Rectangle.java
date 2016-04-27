/**
 * Created by andrii on 28.04.16.
 */
public class Rectangle {

    private int sideOneLength;
    private int sideTwoLength;

    public Rectangle(int longSideLength, int shortSideLength) {
        if (longSideLength < 1 || shortSideLength < 1) {
            throw new IllegalArgumentException("Wrong sides length values!");
        }
        this.sideOneLength = longSideLength;
        this.sideTwoLength = shortSideLength;
    }

    public int getPerimeterValue() {
        return (sideOneLength * 2) + (sideTwoLength * 2);
    }

    public double getDiagonalLength() {
        return Math.sqrt((sideOneLength * sideOneLength) + (sideTwoLength * sideTwoLength));
    }

    public int getSideOneLength() {
        return sideOneLength;
    }

    public void setSideOneLength(int sideOneLength) {
        this.sideOneLength = sideOneLength;
    }

    public int getSideTwoLength() {
        return sideTwoLength;
    }

    public void setSideTwoLength(int sideTwoLength) {
        this.sideTwoLength = sideTwoLength;
    }
}
