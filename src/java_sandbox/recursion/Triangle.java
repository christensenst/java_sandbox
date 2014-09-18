package java_sandbox.recursion;

/**
 * A triangular shape composed of stacked unit squares
 * 
 * Example:
 * []
 * [][]
 * [][][]
 * ...
 * 
 * There are 2 key requirements to make sure that recursion is successful:
 *     1. Every recursive call must simplify the computation in some way.
 *     2. There must be special cases to handle the simplest computations directly.
 */
public class Triangle {
    
    private int width;
    
    /**
     * Constructs a triangular shape.
     * @param aWidth 
     */
    public Triangle(int aWidth) {
        width = aWidth;
    }
    
    /**
     * Computes the area of the triangle.
     * @return 
     */
    public int getArea() {
        if (width <= 0) return 0;
        if (width == 1) return 1;
        Triangle smallerTriangle = new Triangle(width - 1);
        int smallerArea = smallerTriangle.getArea();
        return smallerArea + width;
    }
}
