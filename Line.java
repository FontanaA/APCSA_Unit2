public class Line {
    private double y;
    private double m;
    private double x;
    private double b;

    public  Line(double InM, double InX, double InB)  {
        m = InM;
        x = InX;
        b = InB;
        y = m*x+b;
    }

    public double GetYInt() { return b;  }
    public double GetSlope() { return m; }
    public double GetY() {return y ; }

    public String toString() {
        return "Line with slope:"+m+", point: (" + x + ", "+y+") and y-intercept:" + b + "\n" + y + " = " + m + " * "+ x + " + " + b;
    }
}