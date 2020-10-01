public class CubeSA {

    private double SurfaceArea;

    public  CubeSA(double SideLength)  {
        SurfaceArea = 6 * SideLength * SideLength;
    }

    public double GetSurfaceArea() { return SurfaceArea;  }

    public String toString() {
        return "Square surface area = " + SurfaceArea;
    }
}