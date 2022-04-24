public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length , float  width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float newLength) {
        length = newLength;
    }

    public float getWidth() {
        return width;
    }


    public void setWidth(float newWidth) {
        width = newWidth;
    }

    public double getArea() {
        float a = length * width;
        double d1 = (double) a;
        return d1;
    }

    public double getPerimeter() {
        float p = 2 * (length + width);
        double d1 = (double) p;
        return d1;

    }
    public String toString() {
        return "Rectangle[length=" +length+ ",width="+width+"]";
    }
}


