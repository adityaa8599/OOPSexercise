public class Circle {

    private double radius;
    public Circle() {  // 1st (default) constructor
        radius = 1.0;

    }
    public Circle(double r) {  // 2nd constructor
        radius = r;
    }

    public  double getRadius() {
        return radius;
    }
    /** Returns the area of this Circle instance */
    public void  setRadius(double newRadius) {
        radius=newRadius;
    }

    public  double getArea() {
        return radius*radius*Math.PI;
    }
    public  double getCircumference() {
        return 2*radius*Math.PI;
    }
    public String toString() {
        return "Circle[radius=" + radius+"]";
    }


}


