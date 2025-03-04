public class BmiService {
    public double calculate(double heightInMeters, double weightInKilograms) {
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        int result = (int) (bmi);
        return result;
    }
}