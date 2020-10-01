public class CircleC {

    static final double PI = Math.PI;

    private double c;

    public  CircleC(double r)  {
        c = 2 * PI * r;
    }

    public double GetCircumference() { return c; }

    public String toString() {
        return "circle circumference = " + c;
    }
}