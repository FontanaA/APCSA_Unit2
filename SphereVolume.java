public class SphereVolume {

    static final double PI = Math.PI;

    private double volume;

    public  SphereVolume(double radius)  {
        volume =  ((double) (4 / 3) * PI * Math.pow(radius, 3)) ;
    }

    public double GetDistance() { return volume;  }

    public String toString() {
        return "Volume of sphere =  " + volume;
    }
}