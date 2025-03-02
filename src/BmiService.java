public class BmiService {
    public double calculate(double h, double m) {
        double d = m / (h * h);
        int result = (int) (d);
        return result;
    }
}