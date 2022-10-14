import java.lang.Math;
public class RightTriangle{
    public double rt(double b, double h) {
        double t = Math.pow(b,2);
        double r = Math.pow(h,2);
        double f = Math.sqrt(t+r);
        return f;
    }
}