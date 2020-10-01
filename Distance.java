public class Distance {

    private double Distance;

    public  Distance(double XOne, double YOne, double XTwo, double YTwo)  {
        Distance = Math.sqrt(((XTwo - XOne) * (XTwo - XOne )) + ((YTwo - YOne) * (YTwo - YOne )));
    }

    public double GetDistance() { return Distance;  }

    public String toString() {
        return "Distance =  " + Distance;
    }
}