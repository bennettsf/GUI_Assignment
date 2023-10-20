/**
 * Box is created with a length, width, and height to be used for calculations
 *
 * @author Bennett Fife
 * @version 10/18/23
 */
public class Box {
    private Double length;
    private Double width;
    private Double height;

    /**
     * @param length length of box
     * @param width  width of box
     * @param height height of box
     */
    public Box(Double length, Double width, Double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    /**
     * This method sets the length of the Box object
     *
     * @param length set box length; must not be negative
     */
    public void setLength(Double length) {
        if (length < 0) {
            throw new IllegalArgumentException("length must not be negative or null");
        }
        this.length = length;
    }

    /**
     * This method returns the length of the Box object
     *
     * @return The length of the box
     */
    public Double getLength() {
        return this.length;
    }

    /**
     * This method sets the width of the Box object
     *
     * @param width set box width; must not be negative
     */
    public void setWidth(Double width) {
        if (width < 0) {
            throw new IllegalArgumentException("width must not be negative or null");
        }
        this.width = width;
    }

    /**
     * This method returns the width of the Box object
     *
     * @return The width of the box
     */
    public Double getWidth() {
        return this.width;
    }

    /**
     * This method returns the height of the Box object
     *
     * @return The height of the box
     */
    public Double getHeight() {
        return this.height;
    }

    /**
     * This method sets the height of the Box object
     *
     * @param height set box height; must not be negative
     */
    public void setHeight(Double height) {
        if (height < 0) {
            throw new IllegalArgumentException("height must not be negative or null");
        }
        this.height = height;
    }

    /**
     * This method calculates the volume of the Box object (L * W * H)
     *
     * @return The volume calculation of the Box as a Double
     */
    public Double calcVolume() {
        return getHeight() * getLength() * getWidth();
    }

    /**
     * This method calculates the surface area of the Box object (2*(L*W) + 2*(L*H) + 2*(H*W))
     *
     * @return The surface area calculation of the Box as a Double
     */
    public Double calcSurfaceArea() {
        return (2 * (getLength() * getWidth())) + (2 * (getLength() * getHeight())) + (2 * (getHeight() * getWidth()));
    }

}
